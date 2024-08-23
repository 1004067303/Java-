package Collections.Set;

import com.Jha.Obj.Obj.Student;

public class HashDemo {
    public static void main(String[] args) {
        Student st1=new Student("JHA",99,99);
        Student st2=new Student("QYM",99,99);
        System.out.println(st1.hashCode());
        System.out.println(st1.hashCode());
        System.out.println(st1.hashCode());
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println("=========================");
        String s1="abc";
        String s2="acD";
        System.out.println(s1.hashCode());//会输出相同的哈希值
        System.out.println(s2.hashCode());
    }
}
