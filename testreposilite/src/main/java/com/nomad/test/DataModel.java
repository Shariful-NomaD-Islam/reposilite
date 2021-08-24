package com.nomad.test;

import org.javatuples.Triplet;

public class DataModel {
    Triplet<String,String,Integer> info;
    String name;
    int val;

    public String getName() {
        return name;
    }

    public DataModel setName(String name) {
        this.name = name;
        return this;
    }

    public int getVal() {
        return val;
    }

    public DataModel setVal(int val) {
        this.val = val;
        return this;
    }
}
