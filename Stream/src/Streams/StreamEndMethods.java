package Streams;

import com.Jha.Obj.Obj.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StreamEndMethods {
    public static void main(String[] args) {
        List<Student> stu=new ArrayList<>();
        stu.add(new Student("1号学生",63,78));
        stu.add(new Student("2号学生",98,78));
        stu.add(new Student("3号学生",69,78));
        stu.add(new Student("4号学生",34,78));
        stu.add(new Student("5号学生",78.0,78));
        stu.add(new Student("5号学生",78.0,78));
        System.out.println(stu);
        // 找出语文成绩80分以上的有几人
        System.out.println("大于80分的有："+stu.stream().filter(s -> s.getChinese() >= 80).count()+"人");
        //找出语文成绩最高的学生对象，并输出,=
        Student max = stu.stream().max(Comparator.comparingDouble(Student::getChinese)).get();
        System.out.println("语文成绩最高的学生："+max);
        //找出语文成绩最低的学生对象，并输出
        Student min = stu.stream().min(Comparator.comparingDouble(Student::getChinese)).get();
        System.out.println("语文成绩最低的学生："+min);
        //找出语文成绩超过70的学生对象，并放到一个新的集合中去返回
        List<Student> list=new ArrayList<>();
        list= stu.stream().filter(s->s.getChinese()>=70).collect(Collectors.toList());
        System.out.println(list);
        //找出语文成绩超过70的学生对象，并把学生对象的名字和成绩，存入到一个Map集合中返回
        Set<Student> set = stu.stream().filter(s -> s.getChinese() >= 70).collect(Collectors.toSet());//返回成Set集合
        System.out.println(set);
        Map<String, Double> map = stu.stream().filter(s -> s.getChinese() >= 70).distinct()
                .collect(Collectors.toMap(s -> s.getName(), a -> a.getChinese()));//返回成Set集合
        System.out.println(map);

        //找出语文成绩超过70的学生对象，并把学生对象的名字和成绩，存入到一个数组中返回
        Object[] objects = stu.stream().filter(s -> s.getChinese() >= 70).toArray();
        System.out.println(Arrays.toString( objects));
    }
}
