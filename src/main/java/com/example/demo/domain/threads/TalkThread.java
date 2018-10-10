package com.example.demo.domain.threads;

/**
 * descript
 *
 * @author orange
 * @Time 2017/12/27 0027
 */
public class TalkThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++){
            System.out.println("当前线程为：" + getName() + "--->" + i);
        }
    }
}
