package com.Jha.OOP.Class;

public class Outer {
    private String msg;
    private int num=77;

    public String getMsg() {
        return msg;
    }

    public Outer() {
    }

    public Outer(String msg, int num) {
        this.msg = msg;
        this.num = num;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public class Inner{
        private String msg;

        public String getMsg() {
            return msg;
        }

        public Inner(String msg) {
            this.msg = msg;
        }

        public Inner() {
        }
        int num=88;
        public void test(){
            int num=99;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
