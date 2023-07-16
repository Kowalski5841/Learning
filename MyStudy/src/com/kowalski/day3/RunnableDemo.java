/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day3;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("创建了线程：" + threadName);
    }

    @Override
    public void run() {
        System.out.println("运行线程：" + threadName);
        try{
            for (int i = 0; i < 4; i++) {
                System.out.println("线程:" + threadName + "," + i);
                Thread.sleep(5000);
            }
        }catch (InterruptedException interruptedException){
            System.out.println("线程:" + threadName + "interrupted.");
        }
        System.out.println("线程:" + threadName + " 结束了.");
    }
    public void start(){
        System.out.println("Starting" + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

