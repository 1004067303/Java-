package com.Jha.Obj.ATM;

public class Account {
    private String cardId;
    private String userName;
    private String passWord;
    private char Sex;
    private double money;
    private double xianE;

    public Account() {
    }

    public Account(String cardId, String userName, String passWord, char sex, double money, double xianE) {
        this.cardId = cardId;
        this.userName = userName;
        this.passWord = passWord;
        Sex = sex;
        this.money = money;
        this.xianE = xianE;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public char getSex() {
        return Sex;
    }

    public void setSex(char sex) {
        Sex = sex;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getXianE() {
        return xianE;
    }

    public void setXianE(double xianE) {
        this.xianE = xianE;
    }
}
