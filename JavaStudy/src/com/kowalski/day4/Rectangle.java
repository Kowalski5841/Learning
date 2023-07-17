package com.kowalski.day4;

/**
 * @author Kowalski
 * @version 1.0
 * @Date 2023/7/17 15:28
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getCircum(){
        return (width + height) *2;
    }

    public double getArea(){
        return width * height;
    }

}
