package Entity;

public class TestClass {
    public String  name;
    public String sex;
    private int age;
    protected String address;

    public TestClass() {
        System.out.println("无参方法调用");
    }
    private TestClass(String name,String sex){
        this.name=name;
        this.sex=sex;
        System.out.println("私有有参方法调用");
    }
    public void myMethod(){
        System.out.println("这是测试方法！");
    }
    public TestClass(String name, String sex, Integer age, String address) {
        this.name = name;
        this.sex = sex;
        this.setAge(age);
        this.address = address;
        System.out.println("公开有参方法调用");
    }

    public void showMsg(){
        System.out.println(getName()+"今年"+getAge()+"岁");
    }
    private void showMsg(String msg){
        System.out.println(getName()+"今年"+getAge()+"岁,"+msg);
    }
    private int methodDemo(){
        return getAge();
    }
    @Override
    public String toString() {
        return "TestClass{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
