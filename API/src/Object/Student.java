package Object;

public class Student implements Cloneable{
    private String name;
    private int age;
    private char sex;
    private Person skill;

    public Student() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student(String name, int age, char sex, Person skill) {
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

    public Person getSkill() {
        return skill;
    }

    public void setSkill(Person skill) {
        this.skill = skill;
    }
}
