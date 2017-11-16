package com.example.demo.domain;

import java.util.Objects;

/**
 * @author orange
 * @descript
 * @Time 2017/7/25 0025
 */
public class Equal {

    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equal)) return false;

        Equal Equal = (Equal) o;

        if (getSize() != Equal.getSize()) return false;
        return getName() != null ? getName().equals(Equal.getName()) : Equal.getName() == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,size);
    }
}
