package com.blueroofstudio.materialdesignapp.models;

public class Fruit {
    private String name;
    private Integer imgSource;

    public Fruit(String name, Integer imgSource) {
        this.name = name;
        this.imgSource = imgSource;
    }

    public String getName() {
        return name;
    }

    public Integer getImgSource() {
        return imgSource;
    }
}
