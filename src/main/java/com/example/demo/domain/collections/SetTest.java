package com.example.demo.domain.collections;

import com.google.common.collect.Sets;

import java.util.HashSet;

/**
 * descript
 *
 * @author orange
 * @Time 2017/12/25 0025
 */
public class SetTest {

    public static void main(String[] args) {

        //  HashSet
        HashSet<Person> personHashSet = Sets.newHashSet();

        personHashSet.add(new Person(1,"A"));
        personHashSet.add(new Person(1,"A"));
        personHashSet.add(new Person(1,"C"));
        personHashSet.add(new Person(2,"B"));
        personHashSet.add(new Person(3,"B"));

        personHashSet.forEach(person -> {
            System.out.println(person.toString());
        });

        // TreeSet


    }
}
