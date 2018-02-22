package com.example.demo.domain.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * descript
 *
 * @author orange
 * @Time 2018/2/2 0002
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class XhMsg {

    private String RequestMethod;

    private String ResponseJsonParam;

    private String Description;

    private int ErrorCode;

    private String Url;

    private String BodyData;



}
