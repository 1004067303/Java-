package Collections.Maps;

import java.util.*;

public class MapIteratorTest {
    public static void main(String[] args) {
        String[] View={"A","B","C","D"};// 初始化景点
        List<String> students=new ArrayList<>();//存储学生的投票信息
        for (int i = 0; i < 80; i++) {
            Random r=new Random();
            students.add(View[ r.nextInt(4)]);//随机生成80个投票信息
        }

        System.out.println(students);
        Map<String,Integer> count=new HashMap<>();//使用HashMap存储统计数据
        for (String student : students) {//逻辑判断，如果从来未统计过，则添加为1，否则+1
            if(count.containsKey(student)){
                count.put(student, count.get(student)+1);
            }else{
                count.put(student,1);
            }
        }
        count.forEach((k,v)-> System.out.println("选择"+k+"景点的有："+v+"人"));//lambda表达式打印信息
    }
}
