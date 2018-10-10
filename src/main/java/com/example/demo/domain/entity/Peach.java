package com.example.demo.domain.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author orange
 * @descript
 * @Time 2017/7/31 0031
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Peach {

    private int id;

    private int age;

    private String name;

    @Singular(value = "users")
    private List<User> list =new ArrayList<>();

    public static void main(String[] args) {
        Peach peach = builder().name("张三").age(1).id(2).build();

        System.out.println(peach);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Peach)) return false;

        Peach peach = (Peach) o;

        if (id != peach.id) return false;
        if (age != peach.age) return false;
        return name.equals(peach.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + age;
        result = 31 * result + name.hashCode();
        return result;
    }
}
