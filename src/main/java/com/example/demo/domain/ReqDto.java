package com.example.demo.domain;

import lombok.Data;

import java.util.List;

/**
 * @author orange
 * @descript
 * @Time 2017/8/24 0024
 */
@Data
public class ReqDto {
    private List<User> users;

    private long id;
}
