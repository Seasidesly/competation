package com.kunpeng.competition.util;

public enum Sex {

    MAN ("男人"), WOMEN("女人");


    private String desc;

    // 构造方法
    private Sex(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
