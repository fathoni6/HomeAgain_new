package com.example.homeagain.item;

public class Item {

    private int imageResourseId;
    private String versionName;

    public Item(int imageResourseId, String versionName) {
        this.imageResourseId = imageResourseId;
        this.versionName = versionName;
    }

    public int getImageResourseId() {
        return imageResourseId;
    }


    public String getVersionName() {
        return versionName;
    }

}
