package com.kowalski.day4;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author Kowalski
 * @version 1.0
 * @Date 2023/7/17 17:09
 * 这个类是判断回文串的。
 */
public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一段字符，程序将判断是否为回文串");
        while (sc.hasNext()) {
            String str = new String(sc.next());
            char[] chars = str.toCharArray();

            int left = 0;
            int right = chars.length-1;
            boolean isHuiwen = true;
            while (left < right){
                if(chars[left] != chars[right]){
                    isHuiwen = false;
                    break;
                }
                left++;
                right--;
            }
            System.out.println(isHuiwen ? "是回文串" : "不是回文串");
        }
    }
}
