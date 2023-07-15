package com.kowalski.day2;

import org.junit.Test;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        char ch = 'a';  //97
        System.out.println(ch);
        System.out.println(ch+1); //从小到大自动类型转换
        System.out.println((char)(ch+1));

    }
    @Test
    public void test(){
        System.out.println("哈喽!!");
    }
}
