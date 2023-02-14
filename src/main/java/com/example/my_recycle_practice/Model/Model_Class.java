package com.example.my_recycle_practice.Model;

public class Model_Class {

    public int userImg;
    public String userName;
    public int uploadImg;

    public int getUserImg() {
        return userImg;
    }

    public void setUserImg(int userImg) {
        this.userImg = userImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUploadImg() {
        return uploadImg;
    }

    public void setUploadImg(int uploadImg) {
        this.uploadImg = uploadImg;
    }

    public Model_Class(int userImg, String userName, int uploadImg) {
        this.userImg = userImg;
        this.userName = userName;
        this.uploadImg = uploadImg;
    }
}
