package MethodUse;

import java.util.Arrays;

public class MethodUseDemo {
    public static void main(String[] args) {
        Person[] list = new Person[]{
                new Person("t1", 1),
                new Person("t2", 4),
                new Person("t3", 2)
        };
        System.out.println("排序前：" + Arrays.toString(list));
     /*
     //正常使用这个即可
      Arrays.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();//升序
            }
        });
*/
        //Arrays.sort(list,(o1, o2) -> StaticUse.StaticCompare(o1,o2) );//这样子也可以引用，但是可以简化
        Arrays.sort(list, StaticUse::StaticCompare);//去掉入参，直接引用  这就是静态引用
        System.out.println("升序排序后：" + Arrays.toString(list));
        System.out.println("===========");
        StaticUse sta = new StaticUse();
        /*Arrays.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });*/
        Arrays.sort(list, ((o1, o2) -> sta.Compare(o1, o2)));//这样子也可以引用，但是可以简化
        Arrays.sort(list, sta::Compare);//这就是实例引用
        System.out.println("降序排序后：" + Arrays.toString(list));
        System.out.println("==================");
        String[] sList = new String[]{
                "Aas", "abs", "Zsa", "sda", "Sdaa", "qus", "Qas"
        };
        System.out.println("排序之前：" + Arrays.toString(sList));
       /* 忽略大小写进行比较
       Arrays.sort(sList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/
        //Arrays.sort(sList,(o1,o2)->o1.compareToIgnoreCase(o2));//这样的方法可以简化，满足条件
        Arrays.sort(sList, String::compareToIgnoreCase);//这就是特定方法的引用
        System.out.println("排序之后：" + Arrays.toString(sList));
        System.out.println("============");
        /*NewPerson p=new NewPerson() {
            @Override
            public Person GetPerson(String name, int age) {
                return new Person(name,age);
            }
        };*/
        //NewPerson p= (name,age)-> new Person(name,age);
        NewPerson p = Person::new;//这就是构造器引用，
        System.out.println(p.GetPerson("test", 23));
    }
}

class StaticUse {
    static int StaticCompare(Person t1, Person t2) {
        return t1.getAge() - t2.getAge();
    }

    int Compare(Person t1, Person t2) {
        return t2.getAge() - t1.getAge();
    }
}

interface NewPerson {
    Person GetPerson(String name, int age);
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

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
}
