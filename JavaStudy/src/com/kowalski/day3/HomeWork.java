/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day3;

import org.junit.Test;

import java.util.Scanner;

public class HomeWork {
    /*计算某年是不是闰年*/
    public static void main(String[] args) {

    }
    @Test
    public void year(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        while (sc.hasNextInt()) {
            int year = sc.nextInt();
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println("闰年");
            }else{
                System.out.println("不是闰年");
            }
        }
    }
    @Test
    public void swap(){
        int num1 = 5;
        int num2 = 1;

        System.out.println(num1+" "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+" "+num2);
    }
    @Test
    public void test(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入单价");
        double price = sc.nextDouble();
        System.out.println("请输入数量");
        int count = sc.nextInt();
        System.out.println("请输入付款金额");
        double money = sc.nextDouble();

        double totalPrice = price * count;
        if(totalPrice >80){
            totalPrice *=0.8;
            System.out.println("商品总价超过80，打8折了。");
        }
        double returnMoney = money - totalPrice;
        if(returnMoney >= 0){
            System.out.printf("应收%.0f元，找零%.0f元",totalPrice,returnMoney);
        }else{
            System.out.printf("应收%.0f元，付款不足",totalPrice);
        }
    }
}
