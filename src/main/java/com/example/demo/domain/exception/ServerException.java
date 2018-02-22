package com.example.demo.domain.exception;

import lombok.Data;

/**
 * descript
 *
 * @author orange
 * @Time 2018/2/2 0002
 */
@Data
public class ServerException {

    private String traceId;

    private int code;

    private String msg;

    private String description;

    private String errors;
}
