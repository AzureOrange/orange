package com.example.demo.domain.threads;

/**
 * descript
 *
 * @author orange
 * @Time 2017/12/27 0027
 */
public class Demo {

    public static void main(String[] args) {
        TalkThread talkThread = new TalkThread();
        talkThread.start();
        new TalkThread().start();

//        VideoThread videoThread = new VideoThread();
//        videoThread.start();
    }
}
