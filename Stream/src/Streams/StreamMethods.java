package Streams;

import com.Jha.Obj.Obj.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        //找出语文分数大于等于60的数据，并升序，然后输出
        List<Double> score=new ArrayList<>();
        Collections.addAll(score,70.6,44.5,60.0,60.5,13.0,99.0,54.0);
        score.stream().filter(s->s>=60).sorted().forEach(s-> System.out.print(s+" "));
        List<Student> stu=new ArrayList<>();
        stu.add(new Student("1号学生",63,78));
        stu.add(new Student("2号学生",98,78));
        stu.add(new Student("3号学生",69,78));
        stu.add(new Student("4号学生",34,78));
        stu.add(new Student("5号学生",88.0,78));
        stu.add(new Student("5号学生",78.0,78));
        stu.add(new Student("5号学生",78.0,78));
        //找出语文成绩大于等于60小于等于80的学生，并降序输出
        stu.stream().filter(s->s.getChinese()>=60&&s.getChinese()<=80)
                .sorted(((o1, o2) -> Double.compare(o2.getChinese(),o1.getChinese())))
                .forEach(s-> System.out.println(s));
                //.sorted(Comparator.comparingDouble(Student::getChinese));//升序的最简写法
        System.out.println("--------------------------------------------------");
        //找出语文成绩最高的前三个学生，并输出
        stu.stream().sorted(((o1, o2) -> Double.compare(o2.getChinese(), o1.getChinese())))
                .limit(3).forEach(s-> System.out.println(s));
        System.out.println("--------------------------------------------------");
        //找出语文成绩倒数的两个学生，并输出
        stu.stream().sorted(((o1, o2) -> Double.compare(o2.getChinese(), o1.getChinese())))
                .skip(stu.size()-2).forEach(s-> System.out.println(s));
        System.out.println("--------------------------------------------------");
        //找出语文成绩超过70的学生叫什么名字，要求去除重复的名字在输出
        stu.stream().filter(s->s.getChinese()>=70).map(Student::getName).distinct().forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        //如果想要去重自定义类，则需要重写equals方法和hashCode方法
        stu.stream().filter(s->s.getChinese()>=70).distinct().forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        //合并流的方法  concat
        Stream<String> s1 = Stream.of("芜湖", "起飞");
        Stream<String> s2 = Stream.of("芜湖1", "起飞2", "小老板");
        Stream.concat(s1,s2).forEach(System.out::println);
    }
}
