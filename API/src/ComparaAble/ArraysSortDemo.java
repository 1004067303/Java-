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
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println("===================");
        System.out.println(Arrays.toString(list2));
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
        System.out.println(Arrays.toString(list2));

    }
}
class Sort   {
    public static int SortByData(Person t1,Person t2)
    {
        return t1.getAge()- t2.getAge();
    }
}
