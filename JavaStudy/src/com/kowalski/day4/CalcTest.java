package com.kowalski.day4;

import com.kowalski.day4.calc.Add;
import com.kowalski.day4.calc.Div;

/**
 * @author Kowalski
 * @version 1.0
 * @Date 2023/7/17 16:06
 */
public class CalcTest {
    public static void main(String[] args) {
        Number n = new Number(10, 5);

        Div d = new Div(2,1);
        System.out.println(d.getResult());
    }
}
