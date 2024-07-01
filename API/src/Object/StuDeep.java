package Object;

public class StuDeep implements Cloneable{
    private String name;
    private int age;
    private char sex;
    private Person1 skill;

    public StuDeep() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        StuDeep clone = (StuDeep)super.clone();
        clone.skill  = (Person1) clone.skill.clone();
        return clone;
    }

    public StuDeep(String name, int age, char sex, Person1 skill) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", skill=" + skill +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Person1 getSkill() {
        return skill;
    }

    public void setSkill(Person1 skill) {
        this.skill = skill;
    }
}
