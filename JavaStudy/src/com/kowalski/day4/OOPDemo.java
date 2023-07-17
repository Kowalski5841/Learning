/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day4;

public class OOPDemo {
    public static void main(String[] args) {
        Student s = null;
        try {
            s.setAge(1);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        Student s1 = new Student(1,"zhangSan",23,"男");
        s1.study();
        System.out.println(s1);
        System.out.println(s);
    }

}
