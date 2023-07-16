/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day3;

public class StackOverFlowErrorDemo {

    int depth = 0;

    public void sofMethod(){
        depth ++ ;
        sofMethod();
    }

    public static void main(String[] args) {
        StackOverFlowErrorDemo test = null;
        try {
            test = new StackOverFlowErrorDemo();
            test.sofMethod();
        } finally {
            System.out.println("递归次数："+test.depth);
        }
    }
}
