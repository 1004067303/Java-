package Collections.Set;

import java.util.*;

public class SetDemos {
    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<>();
        hashSet.add("芜湖");
        hashSet.add("芜湖");
        hashSet.add("起飞！！");
        hashSet.add("芜湖");
        hashSet.add("小老板！");
        hashSet.add("芜湖");
        hashSet.add("芜湖");
        System.out.println("HashSet："+hashSet);//[小老板！, 芜湖, 起飞！！] 可以看出是无重复，无顺序的

        Set<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("芜湖");
        linkedHashSet.add("芜湖");
        linkedHashSet.add("起飞！！");
        linkedHashSet.add("芜湖");
        linkedHashSet.add("小老板！");
        linkedHashSet.add("芜湖");
        linkedHashSet.add("芜湖");
        System.out.println("linkedHashSet："+linkedHashSet);//[芜湖, 起飞！！, 小老板！] 可以看出是无重复，有序的，按照添加顺序

        Set<Integer> tree=new TreeSet<>();
        tree.add(23);
        tree.add(2312);
        tree.add(2);
        tree.add(4);
        tree.add(5);
        tree.add(55);
        tree.add(23);
        System.out.println("TreeSet："+tree);//[2, 4, 5, 23, 55, 2312] 可以看出同样是无重复，但是是有序的，默认升序排序
        Set<String> tree2=new TreeSet<>();
        tree2.add("we");
        tree2.add("qwe");
        tree2.add("asd");
        tree2.add("232");
        tree2.add("231");
        tree2.add("232");
        tree2.add("232");
        System.out.println("TreeSet："+tree2);//[231, 232, asd, qwe, we] 可以看出同样是无重复，但是是有序的，默认升序排序，非数字的话就是ascll码表排序

        Set<Person> tree3=new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getHeight()>=o2.getHeight()){
                    return 1;
                }
                else
                    return -1;
            }
        });

        tree3.add(new Person("JHA",22,189.3));
        tree3.add(new Person("QYM",22,178.3));
        tree3.add(new Person("CS",23,156));
        tree3.add(new Person("NM",19,176));
        tree3.add(new Person("WUHU",34,197));
        System.out.println(tree3);// 排序规则会采用最近原则，即TreeSet自己的排序规则，在上面定义的，根据身高来进行排序
    }
    static class Person implements Comparable<Person>{
        String name;
        double age;
        double height;

        public Person() {
        }

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

        public double getAge() {
            return age;
        }

        public void setAge(double age) {
            this.age = age;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public Person(String name, double age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        @Override
        public int compareTo(Person o) {
            // this  o
            //return (int)(this.getAge()-o.getAge());
           // return  Double.compare(this.getAge(),o.getAge());//这样的话 如果年龄相同就只会输出一个，会出现数据缺失
            if(this.getAge()>=o.getAge()){
                return 1;
            }
            else
                return -1;
        }
    }
}
