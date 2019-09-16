package com.mover.tugasdicodingapp.model;

public class Place {
    String name,detail;
    int image;

    public Place() {
    }

    public Place(String name, String detail, int image) {
        this.name = name;
        this.detail = detail;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
