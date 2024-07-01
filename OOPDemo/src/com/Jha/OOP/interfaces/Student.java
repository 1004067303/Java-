package com.Jha.OOP.interfaces;

public class Student  {
    private String userName;
    private char sex;
    private double score;

    public Student(String userName, char sex, double score) {
        this.userName = userName;
        this.sex = sex;
        this.score = score;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return
                "名字为：" + userName +
                " 性别为：" + sex +
                " 分数为：" + score;
    }
}
