package com.example.demo.file;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 数据包（JSON对应的JavaBean）-- 老版本
 * Created by LYF on 2017/7/18.
 * @author orange
 */
@Data
public class DataPacket {

    @ApiModelProperty(value = "父题ID")
    private String parentId;

    @ApiModelProperty(value = "所属类型 4-学生作业")
    private int type;

    @ApiModelProperty(value = "题目ID")
    private String topicId;

    @ApiModelProperty(value = "回答结果位置,填空题空的索引，从0开始")
    private int resultIndex;

    @ApiModelProperty(value = "结果所属类型，1-题干区，2-答题区，3-订正区")
    private int area;

    @ApiModelProperty(value = "作业进程  1学生做，2老师批，3学生订，4老师批订")
    private int process;

    @ApiModelProperty(value = "详细内容")
    private String content;

    public DataPacket() {
        this.parentId = "";
        this.type = 0;
        this.topicId = "";
        this.resultIndex = 0;
        this.area = 0;
        this.process = 0;
        this.content = "";
    }
}