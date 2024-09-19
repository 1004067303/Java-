package IO.SerializableStream;

import java.io.*;

public class SerializableDemo {
    public static void main(String[] args) {
        Person p=new Person("测试",19,190);
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("FileAndIO/src/IO/SerializableStream/file.txt"));
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("FileAndIO/src/IO/SerializableStream/file.txt"))
        ) {
            out.writeObject(p);
            System.out.println("序列化成功！！！");
            Object o = in.readObject();
            Person p2=(Person) o;
            System.out.println(p2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class Person implements Serializable {
    String name;
    transient int age;//不序列化年龄
    double height;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
