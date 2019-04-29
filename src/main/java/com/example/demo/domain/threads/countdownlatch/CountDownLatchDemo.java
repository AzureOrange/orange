package com.example.demo.domain.threads.countdownlatch;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch 实例
 *      -> 能够使一个或多个线程等待其他线程完成各自的工作后再执行
 *      -> 闭锁的状态是一次性的，它确保在闭锁打开之前所有特定的活动都需要在闭锁打开之后才能完成。
 *
 * @author orange
 * @Time 2019/4/29
 */
public class CountDownLatchDemo {
    static SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws InterruptedException {
        //指定计数的次数 注意这个次数与下面线程数密切相关
        CountDownLatch latch = new CountDownLatch(2);
        System.out.println("当前的计数" + latch.getCount());

        Work work1 = new Work("orange", 1, latch);
        Work work2 = new Work("peach", 2, latch);

        work1.run();
        work2.run();
        System.out.println("当前的计数" + latch.getCount());

        //调用此方法会一直阻塞当前线程，直到计数器的值为0，除非线程被中断或者计数器超时，返回false代表计数器超时。
        latch.await();
        System.out.println("当前的计数" + latch.getCount());

        System.out.println("all work done at " + sdf.format(new Date()));
    }
}
