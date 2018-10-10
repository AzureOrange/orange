package com.example.demo.domain.threads;

/**
 * descript
 *
 * @author orange
 * @Time 2017/12/27 0027
 */
public class VideoThread extends Thread {

    @Override
    public void run() {
        for (int i = 50; i < 100; i++){
            System.out.println("当前线程为：" + getName() + "--->" + i);
        }
    }
}
