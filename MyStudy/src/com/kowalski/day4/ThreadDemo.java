/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        for (int i = 0; i < 3; i++) {
            new Thread(() ->{
               try{
                   ticket.sell();
               }catch (InterruptedException e){
                   System.out.println("被打断");
               }
            },"售票员"+ i).start();
        }
    }
}
class Ticket{
    private int num=100;//总共100张票
    public synchronized void sell() throws InterruptedException {
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            while(num>0){
                System.out.println(Thread.currentThread().getName()+"卖票，票号为："+(num--));
                //为了创造一些异常，让线程到此处sleep阻塞一下1
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
