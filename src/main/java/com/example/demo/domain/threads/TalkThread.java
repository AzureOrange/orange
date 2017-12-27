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
        while (true){
            System.out.println("TalkThread");
        }
    }
}
