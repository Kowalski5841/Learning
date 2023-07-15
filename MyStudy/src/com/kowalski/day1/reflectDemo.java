package com.kowalski.day1;

public class reflectDemo {
    public static void main(String[] args) throws IllegalAccessException,InstantiationException{
        Class<Temp> tempClass = Temp.class;
        Temp temp = tempClass.newInstance();
        temp.getName();
    }
}
class Temp{
    void getName(){
        System.out.println("反射创建对象成功");
    }
}
