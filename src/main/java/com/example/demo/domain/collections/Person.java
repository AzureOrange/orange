package com.example.demo.domain.collections;

import java.util.Objects;

/**
 * descript
 *
 * @author orange
 * @Time 2017/12/25 0025
 */
public class Person implements Comparable<Person>{

    private int id;

    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        int result = id;
        return Objects.hash(result);
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.id - o.id;
    }
}
