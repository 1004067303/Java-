package Object;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s=new Student("Jha",25,'男', new Person("JHA"));

        Student sClone=(Student) s.clone();
        System.out.println("浅拷贝---------------");
        System.out.println(s);
        System.out.println(sClone);
        System.out.println(s.getSkill().equals(sClone.getSkill()));
        System.out.println("变更属性");
        s.getSkill().setName("JJJJJ");
        System.out.println(s);
        System.out.println(sClone);
        System.out.println(s.getSkill().equals(sClone.getSkill()));
        System.out.println("================================");
        System.out.println("深拷贝---------------");
        StuDeep stuDeep=new StuDeep("Jha",25,'男', new Person1("JHA"));
        System.out.println(stuDeep);
        StuDeep clone = (StuDeep) stuDeep.clone();
        System.out.println(clone);
        System.out.println(stuDeep.getSkill().equals(clone.getSkill()));
        System.out.println("================================");
        System.out.println("变更属性");
        stuDeep.getSkill().setName("WU");
        System.out.println(stuDeep);
        System.out.println(clone);
        System.out.println(stuDeep.getSkill().equals(clone.getSkill()));
    }
}
