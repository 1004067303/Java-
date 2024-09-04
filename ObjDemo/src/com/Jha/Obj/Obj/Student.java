package com.Jha.Obj.Obj;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.Chinese, Chinese) == 0 && Double.compare(student.Math, Math) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Chinese, Math);
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
