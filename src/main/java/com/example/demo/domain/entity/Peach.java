package com.example.demo.domain.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author orange
 * @descript
 * @Time 2017/7/31 0031
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Peach {

    private int id;

    private String name;

    @Singular(value = "users")
    private List<User> list =new ArrayList<>();

}
