package com.kowalski.day1;

import java.io.*;
import java.time.Period;

import com.kowalski.day1.People;

public class serializableDemo {
    public static void main(String[] args) {
        try {
            //创建流对象
            FileOutputStream fileOut = new FileOutputStream("people.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            //创建实例
            People people = new People();
            //把实例序列化写入文件
            objOut.writeObject(people);
            //关闭流
            objOut.close();
            fileOut.close();


            //创建流对象
            FileInputStream fileInputStream = new FileInputStream("people.ser");
            //读取序列化文件
            ObjectInputStream objIn = new ObjectInputStream(fileInputStream);
            //反序列化创建对象
            People people1= (People) objIn.readObject();


            System.out.println(people1.getGender());
            //关闭流
            fileInputStream.close();
            objIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
