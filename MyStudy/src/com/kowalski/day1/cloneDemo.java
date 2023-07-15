package com.kowalski.day1;

public class cloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student(1,22,"lisi");
        Student clone = (Student) student.clone();
        System.out.println(clone.getName());
    }
}
