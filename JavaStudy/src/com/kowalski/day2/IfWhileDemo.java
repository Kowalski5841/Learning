package com.kowalski.day2;

import org.junit.Test;

import java.util.Scanner;

public class IfWhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score<60){
            System.out.println("不及格");
        }else if(score <=89){
            System.out.println("良好");
        }else if(score<=100){
            System.out.println("优秀");
        }
    }
    @Test
    public void stage(){
        Scanner sc1 = new Scanner(System.in);
        int score = sc1.nextInt();
        if(score<60){
            System.out.println("不及格");
        }else if(score <=89){
            System.out.println("良好");
        }else if(score<=100){
            System.out.println("优秀");
        }
    }
}
