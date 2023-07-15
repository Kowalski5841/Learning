/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day3;

public class Sheet {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j +"\t");
            }
            System.out.println();
        }
    }
}
