/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThreadDemo implements Callable<Integer> {
    public static void main(String[] args) {
        CallableThreadDemo ctd = new CallableThreadDemo();
        FutureTask<Integer> futureTask = new FutureTask<>(ctd);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "的循环变量i的值是" + i);
            if(i == 20){
                new Thread(futureTask,"有返回值的线程").start();
            }
        }
        try{
            System.out.println("子线程的返回值是" + futureTask.get());
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Integer call() throws Exception {
        int i = 0;
        for(;i < 100; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }
}
