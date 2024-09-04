package Collections.Maps;

import com.Jha.Obj.Obj.Student;

import java.util.HashMap;
import java.util.Map;

public class HashSource {
    public static void main(String[] args) {
        Map<Student,String> map=new HashMap<>();
        map.put(new Student("JHA",100,98),"贵州");
        map.put(new Student("JHA",100,98),"杭州");
        map.put(new Student("QYM",100,98),"贵州");
        System.out.println(map);//如果没有对Student类的hashCode方法和equals方法进行重写，那么就会认为这两个数据不相等，因为二者哈希值不一样
    }
}
