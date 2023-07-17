package com.kowalski.day4.calc;

/**
 * @author Kowalski
 * @version 1.0
 * @Date 2023/7/17 16:23
 */
public class Sub extends Calc{
    public Sub() {
    }

    public Sub(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int getResult() {
        return getNum1() - getNum2();
    }
}
