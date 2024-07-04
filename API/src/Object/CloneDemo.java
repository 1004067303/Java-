package Object;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("类中没有引用类型时直接深拷贝");
        A a=new A();
        a.name="test";
        a.age=23;
        A clone = (A) a.clone();
        a.setAge(2);
        a.setName("wuhu");
        System.out.println(a);
        System.out.println(clone);
        System.out.println("===========");
        System.out.println("类中有引用类型时直接深拷贝");
        B b=new B();
        b.setA(a);
        b.setDesc("msg");
        B cloneb =(B) b.clone();
        System.out.println(b.a);
        System.out.println(cloneb.a);
        System.out.println(b);
        System.out.println(cloneb);

    }
}
class A implements Cloneable{
    String name;
    int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class B implements Cloneable{
    A a=new A();
    String Desc;

    public A getA() {
        return a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        B b=(B) super.clone();
        b.a=((A) b.a.clone());
        return b;
        //return super.clone();//输出地址值相同
    }

    public void setA(A a) {
        this.a = a;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", Desc='" + Desc + '\'' +
                '}';
    }
}
