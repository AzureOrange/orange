package com.example.demo.file;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 数据包（JSON对应的JavaBean） --新版本
 *
 * Created by LYF on 2018/5/16.
 * @author orange
 */
@Data
public class DataPacketBean {
    /**
     * 不同区域的分隔符
     */
    private static final String SEPARATOR = "_";

    @ApiModelProperty(value = "学生作业ID")
    private String studentWorkId;

    @ApiModelProperty(value = "题目ID")
    private String topicId;

    @ApiModelProperty(value = "填空题空的序号，从0开始")
    private int num;

    @ApiModelProperty(value = "结果所属类型，1:题干区，2:答题区，3:订正区")
    private int area;

    @ApiModelProperty(value = "学生做题源数据")
    private String stuDoing;

    @ApiModelProperty(value = "学生订正源数据")
    private String stuRevise;

    @ApiModelProperty(value = "老师批改源数据")
    private String tchCorrect;

    @ApiModelProperty(value = "老师批订源数据")
    private String tchRevise;

    public DataPacketBean() {
        this.studentWorkId = "";
        this.topicId = "";
        this.num = 0;
        this.area = 0;
        this.stuDoing = "";
        this.stuRevise = "";
        this.tchCorrect = "";
        this.tchRevise = "";
    }

    public String getKey() {
        return studentWorkId + SEPARATOR + topicId + SEPARATOR + area + SEPARATOR + num;
    }

    public static String getKey(String studentWorkId, String topicId,int area, int num) {

        return studentWorkId + SEPARATOR + topicId + SEPARATOR + area + SEPARATOR + num;
    }

}