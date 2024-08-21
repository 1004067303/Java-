package Collections.Lists;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> queue=new LinkedList<>();//此处不要使用多态，因为后面要使用LinkedList特有的方法
        queue.addLast("芜湖");//尾插法  这里看个人理解 哪个数据算先进去，我是直接把插完之后的数据当成是生成的队列
        queue.addLast("起飞");
        queue.addLast("小老板");
        queue.addLast("赣神魔");
        System.out.println(queue);
        System.out.println("先进先出!!!!!!!!!!!!!!");
        System.out.println("出："+queue.removeLast());
        System.out.println("出："+queue.removeLast());
        System.out.println("出："+queue.removeLast());
        System.out.println(queue);
        LinkedList<String> stack=new LinkedList<>();//此处不要使用多态，因为后面要使用LinkedList特有的方法
        stack.addLast("芜湖");//尾插法  这里看个人理解 哪个数据算先进去，我是直接把插完之后的数据当成是生成的栈
        stack.addLast("起飞");
        stack.addLast("小老板");
        stack.addLast("赣神魔");
        System.out.println("先进后出!!!!!!!!!!!!!!");
        System.out.println(stack);
        System.out.println("出："+stack.removeFirst());
        System.out.println("出："+stack.removeFirst());
        System.out.println("出："+stack.removeFirst());
        System.out.println(stack);
    }
}
