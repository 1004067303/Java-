package com.Jha.Obj.Obj;

public class StudentOper {
    private Student s;

    public StudentOper(Student s) {
        this.s = s;
    }

    public StudentOper() {
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public void print()
    {
        if(s.getChinese()>=60)
        {
            System.out.println("语文成绩及格");
        }
        else
        {
            System.out.println("语文成绩不及格");
        }
    }
}
