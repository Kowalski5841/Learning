/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day3;

import org.junit.Test;

public class BubbleSort {
    @Test
    public void bubbleSort() {
        int[] arr = {123, 534, 55, 212};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == 0 ? arr[i] : " " + arr[i]);
        }
    }
}
