package ComparaAble;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String StuNo;

    public Student() {
    }

    public Student(String name, int age, String stuNo) {
        this.name = name;
        this.age = age;
        StuNo = stuNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", StuNo='" + StuNo + '\'' +
                '}';
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

    public String getStuNo() {
        return StuNo;
    }

    public void setStuNo(String stuNo) {
        StuNo = stuNo;
    }
    /*this 左边  o右边
      左边>右边  正整数
      左边=右边   0
      左边<右边  负整数
    */
    @Override
    public int compareTo(Student o) {
      /*  if(this.age>o.age)
        {
            return 1;
        }
        else if (this.age<o.age) {
            return  -1;
        }
        return 0;*/
        return  this.age-o.age; //升序
        //return  o.age-this.age; //降序
    }
}
