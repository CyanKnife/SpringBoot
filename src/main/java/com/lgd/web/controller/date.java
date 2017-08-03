package com.lgd.web.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Author : linguodong
 * Create : 2017/7/20
 * Update : 2017/7/20
 * Descriptions :
 */
public class date {
    public static void main(String[] args) {

//        new Thread(() -> new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                    System.out.println(LocalDateTime.now());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();

        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
