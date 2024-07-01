package ComparaAble;

public class Person {

    private String name;
    private int age;
    private String StuNo;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", StuNo='" + StuNo + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age, String stuNo) {
        this.name = name;
        this.age = age;
        StuNo = stuNo;
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

    public String getStuNo() {
        return StuNo;
    }

    public void setStuNo(String stuNo) {
        StuNo = stuNo;
    }

}
