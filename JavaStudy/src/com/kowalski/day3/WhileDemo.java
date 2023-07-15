/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day3;

import org.junit.Test;

public class WhileDemo {
    @Test
    public void test1(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello World!");
        }
    }
    @Test
    public void test2(){
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
            if(sum % 7 == 0){
                System.out.println(sum+"是7的倍数");
                count++;
            }
        }
        System.out.println("总和是"+sum);
    }
    @Test
    public void test3(){
        for (int i = 0; i < 5; i++) {
            System.out.println("i:" + i);
            for (int j = 0; j < 5; j++) {
                if (j == 3){
                    break;
                }
                System.out.println("j:"+ j);
            }
        }
    }
}
