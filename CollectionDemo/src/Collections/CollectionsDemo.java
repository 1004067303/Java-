package Collections;

import com.Jha.Obj.Obj.Student;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<Student> stu=new ArrayList<>();
        Collections.addAll(list,"芜湖","起飞","小老板","赣神魔");
        System.out.println("添加元素后："+list);
        Collections.shuffle(list);
        System.out.println("打乱顺序后："+list);
        System.out.println("==================================");
        Collections.addAll(stu,new Student("芜湖",98,100),new Student("小老板",88,78),new Student("起飞",96,99),new Student("赣神魔",94,100));
        System.out.println("添加元素后："+stu);
        Collections.shuffle(stu);
        System.out.print("打乱顺序后：");
        System.out.println(stu);
    }
}
