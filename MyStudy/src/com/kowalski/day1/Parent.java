package com.kowalski.day1;

import lombok.Data;

@Data
public class Parent {
    private int id;
    private String name;
    public static void display(){
        System.out.println("父类的静态方法");
    }
    public void display2(){
        System.out.println("父类的非静态方法");
    }
    private void display3(){
        System.out.println("父类中一个私有方法");
    }
}
