package Collections;

import UtilsDemo.UtlisDemo;
import com.Jha.Obj.Obj.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        Collections.addAll(list,45,451,555,1);
        System.out.println("添加元素后："+list);
        Collections.shuffle(list);
        System.out.println("打乱顺序后："+list);
        Collections.sort(list);
        System.out.println("升序排序："+list);
        System.out.println("==================================");
        ArrayList<Student> stu=new ArrayList<>();
        Collections.addAll(stu,new Student("芜湖",98,100),new Student("小老板",88,78),new Student("起飞",96,99),new Student("赣神魔",94,100));
        System.out.println("添加元素后："+stu);
        Collections.shuffle(stu);
        System.out.print("打乱顺序后：");
        System.out.println(stu);
        //Collections.sort(stu); 会报错 因为Student类没有自定义排序规则，想要排序 一个方法是重写Comparable接口  另一个是有参构造器声明规则
        //Collections.sort(stu, (o1,o2)->Double.compare(o1.getChinese(), o2.getChinese()));
        Collections.sort(stu, Comparator.comparingDouble(Student::getChinese));//通过有参构造器声明规则来进行比较 升序，最简化的形式了 前面的lambda表达式知识
        System.out.println("升序排序："+stu);
        System.out.println("=======================");
        System.out.println(UtlisDemo.GetYzm(6));
    }
}
