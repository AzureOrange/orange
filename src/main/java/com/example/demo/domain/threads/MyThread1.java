package com.example.demo.domain.threads;

/**
 * descript
 *
 * @author orange
 * @Time 2018/8/3 0003
 */
public class MyThread1 extends Thread {

    private int ticket = 10;
    private String name;

    public MyThread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            if (this.ticket > 0) {
                System.out.println(this.name + "卖票---->" + (this.ticket--));
            }
        }
    }

    public static void main(String[] args) {
        // 继承Thread类的，我们相当于拿出三件事即三个卖票10张的任务分别分给三个窗口，他们各做各的事各卖各的票各完成各的任务
        // 因为MyThread继承Thread类，所以在new MyThread的时候在创建三个对象的同时创建了三个线程；
        MyThread1 mt1 = new MyThread1("一号窗口");
        MyThread1 mt2 = new MyThread1("二号窗口");
        MyThread1 mt3 = new MyThread1("三号窗口");
        mt1.start();
        mt2.start();
        mt3.start();
    }

}
