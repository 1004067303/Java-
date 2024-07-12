package ComparaAble;

import java.util.Arrays;

public class ArraysSortDemo {
    public static void main(String[] args) {
        //List<Student> list=new ArrayList<>();
        Student[] list=new Student[3];
        list[0]=new Student("学生1",12,"J12935");
        list[1]=new Student("学生2",19,"J12934");
        list[2]=new Student("学生3",10,"J12932");


        Person[] list2=new Person[3];
        list2[0]=new Person("Person1",12,"J12935");
        list2[1]=new Person("Person2",19,"J12934");
        list2[2]=new Person("Person3",10,"J12932");
        System.out.println("list1未排序顺序："+Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("list1排序后顺序："+Arrays.toString(list));
        System.out.println("===================");
        System.out.println("list2未排序顺序："+Arrays.toString(list2));
   /*     Arrays.sort(list2, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                //return Integer.compare(o1.getAge(),o2.getAge());
                return o1.getAge()-o2.getAge();
            }
        });*/
        Arrays.sort(list2, (Person o1,Person o2)-> {
            return o1.getAge()-o2.getAge();
        });
        Arrays.sort(list2, (o1, o2)-> {
            return o1.getAge()-o2.getAge();
        });
        //静态方法引用简化lambda
        Arrays.sort(list2, Sort::SortByData);
        System.out.println("list2排序后："+Arrays.toString(list2));

    }
}

class Sort   {
    public static int SortByData(Person t1,Person t2)
    {
        return t1.getAge()- t2.getAge();
    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String StuNo;

    public Student() {
    }

    public Student(String name, int age, String stuNo) {
        this.name = name;
        this.age = age;
        StuNo = stuNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", StuNo='" + StuNo + '\'' +
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

    public String getStuNo() {
        return StuNo;
    }

    public void setStuNo(String stuNo) {
        StuNo = stuNo;
    }
    /*this 左边  o右边
      左边>右边  正整数
      左边=右边   0
      左边<右边  负整数
    */
    @Override
    public int compareTo(Student o) {
      /*  if(this.age>o.age)
        {
            return 1;
        }
        else if (this.age<o.age) {
            return  -1;
        }
        return 0;*/
        return  this.age-o.age; //升序
        //return  o.age-this.age; //降序
    }
}

class Person {

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
