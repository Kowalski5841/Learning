package com.kowalski.day1;

import java.util.HashMap;
import java.util.HashSet;

public class classDemo {
    public static void main(String[] args) {
        Student s = new Student(1,23,"zhangsan");
        HashMap<Integer,Student> hashMap = new HashMap<>();
        hashMap.put(1,s);
//        hashMap.put(2,s);
        System.out.println(hashMap.get(1).getAge());

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(s);

    }
}
