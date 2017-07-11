package com.example.android.myapplication;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by fatimazza on 7/11/17.
 */

public class MySerializableObject implements Serializable {

    private String name;
    private int age;
    public ArrayList<String> addresses;

    //createConstructor
    //getEachVariable

    public MySerializableObject(String name, int age, ArrayList<String> addresses) {
        this.name = name;
        this.age = age;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }
}
