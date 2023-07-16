/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;


//九九乘法表
public class Sheet {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j +"\t");
            }
            System.out.println();
        }
    }

    //作业1
    @Test
    public void work1(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //work2
    //打印正三角形
    @Test
    public void printTriangle() {
        for (int i = 0; i < 6; i++) {
            for(int j = 5; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= 1 + 2 * i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //打印倒三角形

    @Test
    public void printInTri(){
        for(int i = 0; i < 6 ; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j < (6-i)*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //work3
    @Test
    public void work3(){
        int odd = 0, even = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0) odd += i;
            if(i % 2 == 0) even += i;
        }
        System.out.printf("所有奇数和是%d，所有偶数和是%d",odd,even);
    }

    //work4
    @Test
    public void work4(){
        int count = 1;
        for (int i = 1; i <= 1000; i++) {
            if(i % 5 == 0 ){
                {
                    if(count++ % 3 != 0){
                        System.out.print(i+"\t");
                    }
                    else System.out.println(i);
                }
            }
        }
    }
    //work5
    @Test
    public void work5(){
       int result = 1;
        for (int i = 1; i <= 9; i++) {
            result *= i;
        }
        System.out.println(result);
    }
    //找素数
    //work6
    @Test
    public void prime(){
        for (int i = 100; i <= 200; i++) {
            int flag = 0;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(i + " ");
            }
        }
    }

    //找奇数偶数
    //work2
    @Test
    public void test(){
        int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
        int odd = 0, even = 0;
        for (int i = 0; i < scores.length; i++) {
            if ((scores[i] % 2 == 0)) {
                odd++;
            } else {
                even++;
            }
//            (scores[i] % 2 == 0) ? odd++ : even++;
        }
        System.out.println(odd+ " " +even);
        HashMap<Integer,Double> hashMap = new HashMap<>();
        ConcurrentHashMap<Integer,Double> concurrentHashMap = new ConcurrentHashMap<>();
        Hashtable<Integer,Double> hashtable = new Hashtable<>();
    }

    @Test
    public void testOut(){

    }
}
