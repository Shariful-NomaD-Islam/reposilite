package com.test.nomad;

import org.javatuples.Triplet;

public class DataModel {
    Triplet<String,String,Integer> info;
    String name;
    int val;

    public Triplet<String, String, Integer> getInfo() {
        return info;
    }

    public String getInfoToString() {
        return "[" + info.getValue0() + ":" + info.getValue2() + "] " + info.getValue1();
    }

    public DataModel setInfo(String name, String desc, Integer priority) {
        Triplet<String,String,Integer> info = new Triplet<>(name,desc,priority);
        this.info = info;
        return this;
    }

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
