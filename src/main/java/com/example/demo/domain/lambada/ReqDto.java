package com.example.demo.domain.lambada;

import com.example.demo.domain.entity.User;
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
