package com.example.demo.domain.collections;


import com.google.common.collect.Lists;

import java.util.*;

/**
 * descript
 *
 * @author orange
 * @Time 2017/12/25 0025
 */
public class ListTest {

    public static void main(String[] args) {
        // List
        List<Person> personList = Lists.newArrayList();
        personList.add(new Person(1,"A"));
        personList.add(new Person(1,"A"));
        personList.add(new Person(2,"B"));

        // LinkedList
        LinkedList<Person> personLink = Lists.newLinkedList();
        personLink.add(new Person(1,"A"));
        personLink.addFirst(new Person(2,"A"));

        // Vector
        Vector<Person> personVector = new Vector<>();
        personVector.add(new Person(1,"A"));
        personVector.addElement(new Person(2,"B"));
        Enumeration vector = personVector.elements();
        while (vector.hasMoreElements()){
            System.out.println(vector.nextElement().toString());
        }


        // 方案一
        personList.forEach(person -> {
            System.out.println("方案一" + person.toString());
        });

        // 方案二
        for (Person person : personList){
            System.out.println("方案二--->" + person.toString());
        }

        // 方案三
        Iterator it = personList.iterator();
        while(it.hasNext()) {
            System.out.println("方案三" + it.next().toString());
        }

        // 方案四：
        for (int i = 0; i < personList.size(); i++) {
            System.out.println("方案四--->" + personList.get(i));
        }
    }
}