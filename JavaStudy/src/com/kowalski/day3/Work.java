/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day3;

import java.util.Random;
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int result = random.nextInt(1000)+1;
        System.out.println("生成了一个1000以内的随机正数，猜一猜");
        System.out.println("***输入-1结束游戏");
        int num = sc.nextInt();

        while (true) {

            if(result == num){
                System.out.println("猜对了！");
                break;
            }else {
                if(num == -1){
                    System.out.println("游戏结束，答案是" + result);
                    break;
                }else if(num > result){
                    System.out.println("太大了，猜吧");

                    num = sc.nextInt();
                }else{
                    System.out.println("太小了，猜吧");

                    num = sc.nextInt();
                }
            }
        }
    }
}
