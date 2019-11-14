package com.example.a210.myapplication;

import android.graphics.drawable.Drawable;

public class ListViewItem {
    private Drawable iconDrawable;
    private String titleStr;
    private String descStr;
    private String location;

    public void setIcon(Drawable icon){
        iconDrawable = icon;
    }
    public void setTitle(String title){
        titleStr=title;
    }
    public void setDesc(String desc){
        descStr=desc;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public Drawable getIcon(){
        return this.iconDrawable;
    }
    public String getTitle(){
        return this.titleStr;
    }
    public String getDesc(){
        return this.descStr;
    }

    public String getLocation(){
        return this.location;
    }
}
