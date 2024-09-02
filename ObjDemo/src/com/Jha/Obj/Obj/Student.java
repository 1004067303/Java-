package com.Jha.Obj.Obj;

public class Student {
    private String name;
    private double Chinese;
    private double Math;

    public Student() {
    }

    public Student(String name, double chinese, double math) {
        this.name = name;
        Chinese = chinese;
        Math = math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Chinese=" + Chinese +
                ", Math=" + Math +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return Chinese;
    }

    public void setChinese(double chinese) {
        Chinese = chinese;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double math) {
        Math = math;
    }
}
