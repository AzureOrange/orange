package com.example.demo.domain.kotlin;

/**
 * descript
 *
 * @author orange
 * @Time 2018/2/28 0028
 */
public class JavaTest {

    public static void main(String[] args) {


        KotlinTest kotlinTest = new KotlinTest("test");

        int count = kotlinTest.sum(2,3);

        System.out.println("\n" + count);

        kotlinTest.vars(1,2,3) ;
    }
}
