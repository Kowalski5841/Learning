package com.kowalski.day1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Child extends Parent{
    private String father;
    private String mother;
    public static void display(){
        System.out.println("子类的静态方法");
    }
    public void display2(){
        System.out.println("子类的非静态方法");
    }
    public void display3(){
        System.out.println("父类的方法是私有的，子类就不存在重写。这个方法被解释为一个新方法");
    }
}
