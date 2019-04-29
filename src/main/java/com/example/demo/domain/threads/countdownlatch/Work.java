package com.example.demo.domain.threads.countdownlatch;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * description
 *
 * @author orange
 * @Time 2019/4/29
 */
public class Work implements Runnable {

    /**
     * 工作者名称
     */
    private String workerName;
    /**
     * 工作耗时
     */
    private int workTime;
    /**
     * 并发控制类
     */
    private CountDownLatch latch;
    SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");


    Work(String workerName, int workTime, CountDownLatch latch) {
        this.workerName = workerName;
        this.workTime = workTime;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Worker " + workerName + " do work begin at " + sdf.format(new Date()));
        doWork();// 工作了
        System.out.println("Worker " + workerName + " do work complete at " + sdf.format(new Date()));

        // 工人完成工作，计数器减一
        latch.countDown();
    }

    private void doWork() {
        try {
            Thread.sleep(workTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
