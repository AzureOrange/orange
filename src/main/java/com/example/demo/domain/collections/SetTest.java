package com.example.demo.domain.collections;

import com.example.demo.domain.entity.User;
import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

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
        TreeSet<Person> personTreeSet = Sets.newTreeSet();
        personTreeSet.add(new Person(1,"A"));
        personTreeSet.add(new Person(1,"B"));
        personTreeSet.add(new Person(5,"A"));
        personTreeSet.add(new Person(3,"A"));

        personTreeSet.forEach(person -> {
            System.out.println(person.toString());
        });

        Set<String> topicSet = Sets.newHashSet();
        topicSet.add("22");
        topicSet.add("33");
        topicSet.add("11");

        final String questionIdList = topicSet.stream().map(String::intern).collect(Collectors.joining(","));
        System.out.println(questionIdList);

        System.out.println(isClaszz(User.class));
        /*
         treeSet要注意的事项：
     1. 往TreeSet添加元素的时候，如果元素本身具备了自然顺序的特性，那么就按照元素自然顺序的特性进行排序存储。
     2. 往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，那么该元素所属的类必须要实现Comparable接口，把元素 的比较规则定义在compareTo(T o)方法上。

     3. 如果比较元素的时候，compareTo方法返回 的是0，那么该元素就被视为重复元素，不允许添加.(注意：TreeSet与HashCode、equals方法是没有任何关系。)

     4. 往TreeSet添加元素的时候, 如果元素本身没有具备自然顺序 的特性，而元素所属的类也没有实现Comparable接口，那么必须要在创建TreeSet的时候传入一个 比较器。

     5.  往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，而元素所属的类已经实现了Comparable接口， 在创建TreeSet对象的时候也传入了比较器
     那么是以比较器的比较规则优先使用。
         */
    }

    public static boolean isClaszz(Class clazz){
        return clazz.equals(User.class);
    }
}
