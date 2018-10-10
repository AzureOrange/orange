package com.example.demo.domain.json;

import com.example.demo.common.Constants;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import lombok.Data;
import org.apache.commons.collections.CollectionUtils;
import org.json.simple.JSONValue;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * descript
 *
 * @author orange
 * @Time 2018/8/15 0015
 */
@Data
public class Subject {

    /**
     * 年级
     */
    private Long gradeId;

    /**
     * 组ID
     */
    private Long groupId;

    /**
     * 学科
     */
    private Long subjectId;

    /**
     * 版本
     */
    private Long textBookVersion;

    public static void main(String[] args) {
        List<Subject> subjectList = (List<Subject>) JSONValue.parse(Constants.jsonContent);
        Map<Long, Set<Long>> gradeToVersion = Maps.newHashMap();

        for (int j = 0; j < subjectList.size(); j++) {
            Map<String, Object> json = (Map<String, Object>) subjectList.get(j);
            long gradeId = (Long) json.get("gradeId");
            long textBookVersion = (Long) json.get("textBookVersion");

            Set<Long> versionSet = gradeToVersion.get(gradeId);
            if (CollectionUtils.isEmpty(versionSet)){
                versionSet = Sets.newHashSet();
            }
            versionSet.add(textBookVersion);
            gradeToVersion.put(gradeId, versionSet);
        }

        Set<Map.Entry<Long, Set<Long>>> entryEntry = gradeToVersion.entrySet();
        for (Map.Entry<Long, Set<Long>> entry : entryEntry) {
            System.out.println("键：" + entry.getKey() + "值：" + entry.getValue());
        }

        String a = "11";
        String b = "22";
        swap(a,b,"ccc", "ddd");
        System.out.println("a = " + a + "\nb = " + b);
    }

    public static void swap(String a, String ... b){
        System.out.println("b的长度" + b.length + "\n b的值" + b[0] + "\n" + b[1]);
    }
}
