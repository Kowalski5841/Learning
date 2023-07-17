package com.kowalski.day4.calc;

/**
 * @author Kowalski
 * @version 1.0
 * @Date 2023/7/17 16:18
 */
public class Calc {
    private int num1;
    private int num2;

    public Calc(){

    }
    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getResult(){
        return 0;
    }
}
