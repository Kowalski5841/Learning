package com.kowalski.day1;

public class test2 {
    public static void main(String[] args) {
        int i =1;
        //Integer j = i;
        Integer j = Integer.valueOf(i);//手动装箱

        Integer a = new Integer(1);//装箱

//        int b = a;
        int b = a.intValue();//手动拆箱

    }
}
