package com.kowalski.day1;

import java.io.*;
import java.time.Period;

import com.kowalski.day1.People;

public class serializableDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("people.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            People people = new People();
            objOut.writeObject(people);
            objOut.close();
            fileOut.close();


            FileInputStream fileInputStream = new FileInputStream("people.ser");
            ObjectInputStream objIn = new ObjectInputStream(fileInputStream);
            People people1= (People) objIn.readObject();
            System.out.println(people1.getGender());
            fileInputStream.close();
            objIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
