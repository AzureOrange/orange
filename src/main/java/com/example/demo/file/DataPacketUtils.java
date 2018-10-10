package com.example.demo.file;


import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 数据包操作工具类
 *
 * Created by LYF on 2018/6/2.
 * @author orange
 */
@SuppressWarnings("ResultOfMethodCallIgnored")
public class DataPacketUtils {

    /**
     * 读取数据包 -- 新版本
     *
     * @param filePath 本地数据包临时文件的绝对路径
     * @return List<DataPacket>
     */
    @Nullable
    private static Map<String, DataPacketBean> readDataPacket_New(@Nullable String filePath) {
        if (StringUtils.isEmpty(filePath)) {
            return Maps.newHashMap();
        }
        try {
            URL urlInfo = new URL(filePath);
            HttpURLConnection conn = (HttpURLConnection) urlInfo.openConnection();
            conn.setRequestMethod("GET");
            InputStream inStream = conn.getInputStream();

            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[2048];
            int len;
            while (-1 != (len = inStream.read(buffer))) {
                outStream.write(buffer, 0, len);
            }
            outStream.close();
            inStream.close();

            String json = new String(outStream.toByteArray(), "UTF-8");
            Gson gs = new GsonBuilder()
                    .setPrettyPrinting()
                    .disableHtmlEscaping()
                    .create();
            Map<String, DataPacketBean> dataPackets = gs.fromJson(
                    json, new TypeToken<Map<String, DataPacketBean>>() {}.getType());
            if (dataPackets == null) {
                dataPackets = Maps.newHashMap();
            }
            return dataPackets;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 读取数据包
     *
     * @param filePath 本地数据包临时文件的绝对路径
     * @return List<DataPacket>
     */
    @Nullable
    private static List<DataPacket> readDataPacket_Old(@Nullable String filePath) {
        if (StringUtils.isEmpty(filePath)) {
            return Lists.newArrayList();
        }
        try {
            URL urlInfo = new URL(filePath);
            HttpURLConnection conn = (HttpURLConnection) urlInfo.openConnection();
            conn.setRequestMethod("GET");
            InputStream inStream = conn.getInputStream();

            int len = inStream.available();
            byte[] buffer = new byte[len];
            inStream.read(buffer);
            inStream.close();
            String json = new String(buffer, "UTF-8");
            if (json.startsWith("默认空文本")) {
                return Lists.newArrayList();
            }
            Gson gs = new GsonBuilder()
                    .setPrettyPrinting()
                    .disableHtmlEscaping()
                    .create();

            List<DataPacket> dataPackets = gs.fromJson(json, new TypeToken<List<DataPacket>>() {
            }.getType());
            if (dataPackets == null) {
                dataPackets = new ArrayList<>();
            }
            return dataPackets;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        String filePath = "http://xuehaifile.oss-cn-hangzhou.aliyuncs.com/CA103001/175432f77b4040e58c21b7aa1cb570a3.json";
        Map<String, DataPacketBean> result = readDataPacket_New(filePath);
        System.out.println(result + "\n");

        String submitContentUrl = "http://xuehaifile.oss-cn-hangzhou.aliyuncs.com/CA103001/eb15b00bd63047af8ccedf5be0a36508.json";
        List<DataPacket> results = readDataPacket_Old(submitContentUrl);
        System.out.println(results.get(0).getArea());
    }
}