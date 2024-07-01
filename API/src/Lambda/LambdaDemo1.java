package Lambda;
/*
lambda 表达式如果用于简化匿名内部类，只能简化函数式接口， 即接口内只有一个抽象方法
lambda中 参数类型可以省略不写，仅仅只有一行代码 则{}不需要，且如果是return语句 则return也不需要写
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        Action a=()-> System.out.println("游泳！");
        a.swim();
    }
}
@FunctionalInterface//函数式接口的注解
interface Action{
    void swim();
   // void test();
}
