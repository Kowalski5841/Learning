package com.kowalski.day1;

import java.io.Serializable;

public class People implements Cloneable, Serializable {
    private String gender;

    public People() {

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public People(String gender) {
        this.gender = gender;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
