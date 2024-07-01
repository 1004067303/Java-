package com.Jha.OOP.Extends;

public class Teacher extends People{
    private String skill;

    public Teacher(String name, String skill) {
        super(name);
        this.skill = skill;
    }

    public Teacher(String skill) {
        this.skill = skill;
    }

    public Teacher() {

    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    public void print()
    {
        System.out.println(getName()+"拥有的技能为："+getSkill());
    }

    public String RefString()
    {
        return skill;
    }
    @Override
    public void run()
    {
        System.out.println("老师方法运行");
    }
}
