package com.example.demo.domain.threads;

/**
 * descript
 *
 * @author orange
 * @Time 2018/8/3 0003
 */
public class MyThread2 implements Runnable {

    private int ticket = 10;
    private String name;

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            if (this.ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票---->" + (this.ticket--));
            }
        }
    }

    public static void main(String[] args) {
        //设计三个线程 实现Runnable的， 相当于是拿出一个卖票10张得任务给三个人去共同完成，new MyThread相当于创建一个任务，
        // 然后实例化三个Thread，创建三个线程即安排三个窗口去执行。
        MyThread2 mt = new MyThread2();
        Thread t1 = new Thread(mt, "一号窗口");
        Thread t2 = new Thread(mt, "二号窗口");
        Thread t3 = new Thread(mt, "三号窗口");
//         MyThread1 mt2 = new MyThread1();
//         MyThread1 mt3 = new MyThread1();
        t1.start();
        t2.start();
        t3.start();
    }
}
