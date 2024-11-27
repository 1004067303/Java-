import Entity.TestClass;

public class ReflectionDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //方法一
        Class<TestClass> c1 = TestClass.class;
        System.out.println(c1);
        System.out.println(c1.getName());//获取全称，带包名路径
        System.out.println(c1.getSimpleName());//获取简单名字

        System.out.println("==============================================");
        //这里是我引用了我其他的模块
        //方法二
        Class<?> c2 = Class.forName("com.Jha.Obj.ATM.Account");
        System.out.println(c2);
        System.out.println(c2.getName());//获取全称，带包名路径
        System.out.println(c2.getSimpleName());//获取简单名字
        System.out.println("==============================================");
        //方法三
        TestClass test=new TestClass();
        Class<? extends TestClass> c3 = (Class<? extends TestClass>) test.getClass();
        System.out.println(c3);
        System.out.println(c3.getName());//获取全称，带包名路径
        System.out.println(c3.getSimpleName());//获取简单名字
        System.out.println(c3 == c1);//同一个类，获取到的是一样的对象，每个类只有一个对应的class对象
    }
}
