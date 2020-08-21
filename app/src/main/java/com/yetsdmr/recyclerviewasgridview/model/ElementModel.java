package com.yetsdmr.recyclerviewasgridview.model;

import java.util.List;

public class ElementModel {
    private String title;
    private Integer image;

    public ElementModel(String title, Integer image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
