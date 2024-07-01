package com.Jha.Obj.Obj;

public class ObjDemo1 {
    public static void main(String[] args) {
        Student s=new Student("JHA",68,54);
        StudentOper oper=new StudentOper(s);
        oper.print();
    }

}
