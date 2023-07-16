/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day3;

public class TestThread {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("Thread1");
        RunnableDemo R2 = new RunnableDemo("Thread2");
        R1.start();
        R2.start();
    }
}
