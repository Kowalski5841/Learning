

package com.kowalski.day1;
import com.kowalski.day1.Parent;
import com.kowalski.day1.Child;
public class test1 {
    /**
     * 用来测试重写的相关知识点
     * 静态的方法不存在重写，形式上的重写只是隐藏父类方法
     */
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.display2();
        Parent p = new Child();
        p.display();
        p.display2();
        c.display3();
    }
}
