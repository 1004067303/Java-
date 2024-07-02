package com.Jha.Base;

public class finalDemo {
    static final String msg="不可改变的变量";
    public static void main(String[] args) {
        final Person p1=new Person("Test",19);
        System.out.println(msg);
        System.out.println(p1);
        p1.setUserName("改变了");
        System.out.println(p1);
    }
}
class Person{
    String userName;
    int age;

    public Person() {
    }

    public Person(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
