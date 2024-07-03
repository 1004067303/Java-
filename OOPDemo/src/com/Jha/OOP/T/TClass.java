package com.Jha.OOP.T;

public class TClass
{
    public static void main(String[] args) {
        Generic<String> g=new Generic<>("字符类");
        String key = g.getKey();
        System.out.println(key);
        System.out.println("=============");
        Generic<Person> p=new Generic<>(new Person("测试",24));
        System.out.println(p.getKey().toString());
    }
}
 class Generic <T> {
    // key 这个成员变量的数据类型为 T, T 的类型由外部传入
    private T key;

    // 泛型构造方法形参 key 的类型也为 T，T 的类型由外部传入
    public Generic (T key) {
        this.key = key;
    }

    // 泛型方法 getKey 的返回值类型为 T，T 的类型由外部指定
    public T getKey(){
        return key;
    }

}
class Person{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
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

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
