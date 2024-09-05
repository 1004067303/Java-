package Collections.Maps;

import com.Jha.Obj.Obj.Student;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSource {
    public static void main(String[] args) {
        //Map<Student,String> map=new HashMap<>();//无序
        Map<Student,String> map=new LinkedHashMap<>();//有序
        map.put(new Student("JHA",100,98),"贵州");
        map.put(new Student("JHA",23,98),"杭州");
        map.put(new Student("QYM",41,98),"贵州");
        map.put(new Student("qwe",53,98),"四川");
        map.put(new Student("ret",155,98),"南京");
        System.out.println(map);//如果没有对Student类的hashCode方法和equals方法进行重写，那么就会认为这两个数据不相等，因为二者哈希值不一样
        System.out.println("===========================");
        //Map<Student,String> tree=new TreeMap<>();//因为会默认进行排序，如果不重写排序规则，就会报错Student cannot be cast to class java.lang.Comparable
        Map<Student,String> tree=new TreeMap<>(Comparator.comparingDouble(Student::getChinese));
        tree.put(new Student("JHA",100,98),"贵州");
        tree.put(new Student("JHA",12,98),"杭州");
        tree.put(new Student("QYM",41,98),"贵州");
        tree.put(new Student("qwe",455,98),"四川");
        tree.put(new Student("ret",156,98),"南京");
        System.out.println(tree);
    }
}
