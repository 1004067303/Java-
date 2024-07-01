# **Java基础**



适用于已经学习过一遍的

## 基础语法

### 变量

变量用来记住程序要处理的数据，定义形式为 数据类型 变量名=具体数据

`int num =0;`

变量需要先声明，后使用

什么样的变量就存储什么类型的数据

变量定义时可以不赋值，但是要使用就必须赋值，即

```java
int num;

num=2;
```

### 关键字

Java中自己保留的一些词，具有特殊作用，如：public, static,abstract,int等等这些，我们不能将这些来作为类型，变量名

### 标识符

标识符就是名字，如类名，变量名等都是标识符

基本要求：由数字、下划线_、英文和美元符号$等组成

强制要求：不能以数字开头、不能使用关键字作为标识符、且大小写敏感，即大小写区分的

### 数据类型

数据类型分为两种：基本数据类型和引用数据类型

**基本数据类型**：四大类共八种

1. 整型：byte、short、int（默认）、long  ，默认值均为0
2. 浮点型：float、double（默认） ，默认值均为0.0
3. 字符型：char，默认值null
4. 布尔型：boolean ，默认值为false

**引用数据类型**：String、类、数组 ，默认值为null

### 类型转换

类型转换有自动类型转换以及强制类型转换

一般用于数据赋值时，如浮点变量想要获取整形数据，那么就会进行自动类型转换

**自动类型转换**：范围小的赋值给范围大的，就会进行自动类型转换

一般用于数据赋值时，如整形变量想要获取浮点数据，那么需要进行强制类型转换，但是这也会造成精度的损失

**强制类型转换**：将某一个类型转换为另一个类型，可能会造成精度损失

格式一般为：`int num =6.90;`

转换后不会进行四舍五入，只会将后面的小数位去掉

### 运算符

#### 基础运算符

+、-、*、/、% 一般就是这五个运算符

其中需要注意 除法（/）如果是两个整数做除法，那么他的结果一定是整数，此处就很好的体现了自动类型转换，因为这边的最大类型就是整数，所以结果就只能是整数

对于加法（+）如果是和字符串做+运算，那么就是连接字符串，得到的结果就是一串字符串

如果是和数字，即正常做加法，数据类型为最大数据类型（因为自动类型转换）

#### 自增、自减运算符

++、-- 这两种

这两个运算符只能用于变量

他们在使用时，既可以放在前面，也可以放在后面，根据位置的不同，所体现的意义也不相同

如果仅仅是单独使用，那么放在前面还是后面都没有什么区别

如果要对改变量进行使用，那么就存在区别，如下例子

```java
int num =1;
System.out.println(num++);
System.out.println(num);
```

如上例，输出的就会是1，2

那么放在前面呢

```java
int num =1;
System.out.println(++num);
System.out.println(num);
```

这样的话，输出的就是2,2

对于--也是同样的道理，因此

在前在后的区别在于：

在前面就先做运算，在做其他

在后面就先做其他，再做运算

#### 赋值运算符

基本赋值运算符（=）

将右边数据赋值给左边

扩展的赋值运算符：-=、+=、*=、/=、%=

```Java
a-=b;
a=a-b;
```

以上两个等同，即赋值运算符的意义

同时，扩展的赋值运算符自带强制类型转换，转a的类型

#### 关系运算符

逻辑运算符有：>、>=、==、<、<=、!=

在Java中，判断相等不能只用一个=，而是必须使用==，其他的则正常逻辑理解即可

#### 逻辑运算符

逻辑运算符有：&、&&、|、||、!、^

&、&&：逻辑与，条件之中有一个为假就返回false

|、||：逻辑或，条件中有一个为真久返回true

！：逻辑非，取反，真为假，假为真

^：逻辑异或，前后条件相同，返回false，条件不同则返回true

实际开发中使用&&和||，一般不使用&和|

#### 三元运算符

也称三元表达式、格式为： 条件表达式？值1：值2;

其意为：判断条件表达式，如果为true，则返回值1，否则返回值2

```Java
int num=2;     
int i = num > 1 ? num : -1;
System.out.println(i);
```

上述代码 输出2

#### 运算符优先级

| 优先级 | 运算符                                        | 结合性   |
| ------ | --------------------------------------------- | -------- |
| 1      | () [] .                                       | 从左到右 |
| 2      | ! +(正)  -(负) ~ ++ --                        | 从右向左 |
| 3      | * / %                                         | 从左向右 |
| 4      | +(加) -(减)                                   | 从左向右 |
| 5      | << >> >>>                                     | 从左向右 |
| 6      | < <= > >= instanceof                          | 从左向右 |
| 7      | ==  !=                                        | 从左向右 |
| 8      | &(按位与)                                     | 从左向右 |
| 9      | ^                                             | 从左向右 |
| 10     | \|                                            | 从左向右 |
| 11     | &&                                            | 从左向右 |
| 12     | \|\|                                          | 从左向右 |
| 13     | ?:                                            | 从右向左 |
| 14     | = += -= *= /= %= &= \|= ^=  ~=  <<= >>=  >>>= | 从右向左 |

## 流程控制

### if流程控制

一般格式为：

```
if(判断条件)

{ 语句块}
//
if()
{

}else 
{

}


if()
{

}
else if()
{

}

```

也可以多层嵌套

### Switch流程控制

```java
switch(表达式){
    case 值1:
        代码;
        break;
    case 值2:
         代码;
        break;
        ···
    default:
        代码;
}
```

break用于跳出分支，不往下执行，不使用break的情况下 适用于不同值，做相同操作

default是值都不匹配的情况下，执行的操作

多层的if-else if 建议使用Switch进行代替

注意表达式类型只能是byte、short、int、char、枚举（JDK5）、String（JDK7）

对于double、float、long并不支持

### 循环控制

对于需要多次运行的代码，就需要使用到循环来进行操作，如输出1-100的数据

#### for循环

for循环写法一般为

```
for(int i=1;i<=100;i++)
{
	System.out.println(i);
}
```

其中int i=1，为定义的临时变量，i<100此处为控制循环的条件，只要满足就进行循环执行{}里面的代码，i++代表每次执行完一次{}之后就对i进行自增，用来控制循环的退出

#### while循环

while循环写法一般为

```java
/*while(条件){
    
}*/
int i=1
while(i<=100){
    System.out.println(i);
    i++;
}
```

和上面的for循环效果一样，只不过写法不同，二者可进行转换

while一般用来做死循环，达到某种条件，退出循环

#### do-while循环

do-while循环写法一般为

```
int i=1
do{
 System.out.println(i++);
}while(i<=100);
```

这种循环的好处是，必定会执行一次代码块，其后根据条件来进行判断是否继续执行，真循环，假结束

循环是可以进行嵌套的，但是套的太多了会影响性能

#### 跳转关键字

跳转关键字有 break；continue；

break：跳出并结束当前所在循环的执行，用于结束当前循环或者结束break分支

continue：用于跳出当前循环的当次执行，直接进入下一次执行，只能在循环之中使用

## Java数组

数组：用来存储多个**数据类型相同**的数据的一种数据结构，通过下标进行访问，下标从0开始，依次递增

数组的定义： 数据类型[] 数组名; 如`int[] numArray;`也可以使用 数据类型 数组名[] ，两种都可以，推荐第一种

数组的初始化：静态初始化数组和动态初始化数组

### 静态初始化

在创建时就对数组的元素值进行赋值，

格式为 数据类型[] 数组名= new 数据类型[]{数组内容}，如下：

```java
int[] numArray=new int[]{1,2,3,4,5};
int[] numArray={1,2,3,4,5}//和上面等同
```

访问数组：在数组中想要获取其中的某个数据，通过其下标来进行获取，数组名[下标]

如想要获取上面数组中的数字3，则通过`int num=numArray[2];`即可获取到，如果数组下标超出，会报错数组下标越界

数组长度通过数组名.length 进行获取，一般用来做数组的循环处理

数组索引长度最大为 数组名.length-1

### 动态初始化

定义数组时先不存入具体的元素值，只声明数组所存储的数据类型以及长度

格式为：数据类型[] 数组名=new 数据类型[长度];  如`int[] numArray=new int[5];`

此处注意一点：静态初始化和动态初始化不能混用，即不能使用`int[] numArray=new int[5]{1,2,3,4,5};`这是不被允许的

**二者使用场景：**

动态初始化：适合开始不确定具体元素值，只知道元素个数的场景

静态初始化：适合一开始就知道要存入什么元素的场景

后续学了ArrayList之后，大概率不会用到它了，了解即可

### 数组小测试

要求：通过输入员工数，以及他们的工资 ，然后求他们的总工资，最高工资，最低工资，平均工资。然后反转数组，反转之后再对其进行随机排名。

在这里，我因为个人编码习惯，使用了方法还有Array的toString方法来进行简化代码，你现在可以不知道，他仅仅是让你少些一点代码而已，按照上面的知识照样能实现，下面就马上讲方法

```java
public class Demo {
    public static void main(String[] args) {

        System.out.print("请输入有多少员工：");
        Scanner sc=new Scanner(System.in);
        int nums = sc.nextInt();
        int numArray[]=new int[nums];
        for (int i = 0; i < nums; i++) {
            System.out.print("请输入员工"+(i+1)+"的工资：");
            numArray[i]=sc.nextInt();
        }
        int max=numArray[0];
        int min=numArray[0];
        int sum=numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if(numArray[i]>max){
                max=numArray[i];
            }
            if(numArray[i]<min){
                min=numArray[i];
            }
            sum+=numArray[i];
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
        System.out.println("总和为："+sum);
        System.out.println("反转前："+Arrays.toString(numArray));
        int[] ints = ResArray(numArray);
        System.out.println("反转后："+Arrays.toString(ints));
        System.out.println("随机排名后："+Arrays.toString(RandomOrder(ints)));
    }
    public static int[] ResArray(int[] arr)
    {
        int temp=0;
            for (int i = 0,j=arr.length-1; i < j; i++,j--) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        return  arr;
    }

    public static int[] RandomOrder(int[] arr){
        Random r=new Random();
        int index;
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            index = r.nextInt(arr.length);//生成[0,length)的数据，下标
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        return arr  ;
    }
}
```

### 数组在内存中的执行原理***

首先需要知道，我们所编写的Java代码会被编译成一个个的class文件，而class文件则是加载在JVM（Java虚拟机）的方法区中的，而后将其中的main方法放入栈中，变量也在栈中，基础变量在栈中，而凡是需要new的，则放在堆中，且在栈中存堆的对应数据的地址。

具体原理等推荐看这篇JAVA内存管理

[java内存管理（堆、栈、方法区）_java方法进栈内存分配-CSDN博客](https://blog.csdn.net/Liveor_Die/article/details/77895631)

## Java方法

方法是一种语法结构，是对一段代码将其封装成一个功能，通过名字就能够进行调用，便于代码复用

方法也是在栈中运行，同时这里说下栈是先进后出的

格式一般为：

```Java
/*
修饰符 (static看情况) 返回值类型 方法名(形参列表){
方法体代码(所需要执行的操作)
return 返回值;
}
当然 也可以设置为无返回类型
*/
 public static int[] RandomOrder(int[] arr){
        Random r=new Random();
        int index;
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            index = r.nextInt(arr.length);//生成[0,length)的数据，下标
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        return arr  ;
    }
```

形参可以有多个，使用逗号（,）进行分隔

方法调用 如用static修饰，那么直接类名.方法名()直接调用，否则需要new 改方法所在类 生成一个实例，然后再通过实例.方法名()进行调用

对于方法而言，其中形参列表以及对应返回值均可为空，如：

不需要返回值时，返回类型为void ，不写return语句。

不需要传入参数时，参数可为空直接写()

### Java方法的参数传递

在Java中，有两种参数传递方法：值传递和引用传递

#### 值传递

在调用函数时，将实际参数复制一份传递到函数中，这样在函数中对参数进行修改，就不会影响到原来的实际参数；

#### 引用传递

在调用函数时，将实际参数的地址直接传递到函数中。这样在函数中对参数进行的修改，就会影响到实际参数；

具体是值传递还是引用传递，主要看传入的参数的类型是否是引用类型，如果是，则是引用传递

#### 比较小案例

```Java
public class Demo {
    public static void main(String[] args) {
        int num=10;
        change(num);
        System.out.println("============");
        System.out.println(num);
        System.out.println("============");
        int[] numArray={1,2,34,5};
        changeArray(numArray);
        System.out.println("=============");
        System.out.println(Arrays.toString(numArray));
    }
    public static void change(int a ){
        System.out.println(a);
        a=20;
        System.out.println(a);
    }

    public static void changeArray(int[] num){
        System.out.println(Arrays.toString(num));
        num[0]=1099;
        System.out.println(Arrays.toString(num));
    }
}
```

运行后就会发现，引用传递如果在方法中改变了它的值，在方法结束后也会同步影响原来的值，而值传递则不会。原因是引用传递传参时传入的是地址。

### 方法重载

在一个类中，如果出现多个方法名称相同，但是它们的形参列表不同，那么这些方法就可以称为方法重载。

需要注意的是，其他的如（返回值类型，修饰符）这些相同或者不相同不影响是否是方法重载

而形参列表不同指的是，参数个数不同，参数类型不同，参数顺序不同（需两个或以上的参数，且这两个参数类型不相同），不包括参数名字

### Java方法测试

需求：求1-n的和,并判断其奇偶性

```java
public class Demo {
    public static void main(String[] args) {
        int sum=SumCount(10);
        System.out.println(sum );
        IsOddNumber(sum);
    }
    //1-n之和
    public static int SumCount(int n){
        int sum =0;
        for (int i = 1; i <= n; i++ ){
            sum+=i;
        }
        return sum;
    }
    //是否是奇数
    public static boolean IsOddNumber(int n){
        if(n%2==0)
        {
            System.out.println(n+"是偶数");
            return false;
        }else {
            System.out.println(n+"是奇数");
            return true;
        }
        //return n % 2 == 0 ? true : false;//三元表达式等同上面的代码,除了输出语句
    }
}
```

需求2：购买机票，按照淡季，旺季，头等，经济进行相应的优惠，优惠方案为：5-10月为旺季，头等舱9折，经济舱8折，11-4为淡季，头等舱7折，经济舱6折，计算用户买票所需要的金额，月份、舱位等级、票数由用户输入。

```java
public class Demo {
    public static void main(String[] args) {
        System.out.print("请输入当前月份：");
        Scanner sc=new Scanner(System.in);
        int month = sc.nextInt();
        System.out.print("请输入想要购买的舱位等级(1:头等舱，2：经济舱)：");
        int level = sc.nextInt();
        System.out.print("请输入想要购买的票数：");
        int count = sc.nextInt();

        System.out.println("你的购票总价为："+Price(month, level, count)+"共"+count+"张");
    }
    public static boolean IsWang(int month){
        if(month>=5&&month<=10)
        {
            System.out.println("当前为："+month+"月， 为旺季");
            return true;
        }else
        {
            System.out.println("当前为："+month+"月， 为淡季");
            return false;
        }
        // return (month>=5&&month<=10)?true:false; 三元表达式 和上面相等
    }
    public static int Price(int month,int level,int count){
        if(IsWang(month)&&level==1){
            return (int) (1000*0.9*count);
        } else if (IsWang(month)&&level==2) {
            return (int) (1000*0.8*count);
        } else if (!IsWang(month)&&level==1) {
            return (int) (1000*0.7*count);
        } else if (!IsWang(month)&&level==2) {
            return (int) (1000*0.6*count);
        }else {
            System.out.println("您的输入有误");
            return -1;
        }
    }
}
```

# 面向对象基础

面向对象是相对面向过程而言的，这二者都是一直编程思想，面向过程强调的是功能、行为，暂时可以理解为一个个的方法函数，而面向对象是将功能封装进对象，强调的是具有了功能的对象

面向对象顾名思义就是把现实中的事务都抽象成为程序设计中的“对象”，其基本思想是一切皆对象，是一种“自下而上”的设计语言，先设计组件，再完成拼装。

**对象**：对象是类的一个实例（**对象不是女朋友**），有状态和行为。例如，一条狗是一个对象，它的状态有：颜色、名字、品种；行为有：摇尾巴、叫、吃等。 

**类**：类是一个模板，它描述一类对象的行为和状态。

面向对象的过程就是找对象、建立对象、使用对象、维护对象的关系的过程

类定义的一般格式：

```Java
/*
修饰符 class 类名{
1、成员变量，用来描述对象可以处理什么样数据 一般定义形式：修饰符 数据类型 变量名;
2、成员方法，用来描述对象拥有什么样的功能，对数据进行处理等 一般就是各种方法函数
}
*/
   public class Person{
        public String name;
        public int age;
        public void show(){
            System.out.println(name+": "+age);
        }
    }
```

**对象**

对象（Object）是系统中用来描述客观事物的一个实体，它是构成系统的一个基本单位。

创建对象：

```java
/*
类名 对象名=new 类名();
*/
Person p1=new Person();
```

使用对象：

```Java
/*
调用成员变量：对象名.成员变量
*/
p1.name="test";
/*
调用成员方法：对象名.成员方法
*/
p1.show();
```

**全局变量（成员变量）**

- 定义在方法的外部，类的内部。使用范围是整个类
- 不需要初始值
- 存储在**堆内存**中（对象存在时才在存在）

**局部变量（方法中的变量）**

- 定义在方法的内部或者某一个语句块的内部，适用范围仅限于方法内或者语句块内
- 必须有初始值
- 存储在**栈内存**中

成员变量可以直接在成员方法中使用，但是main方法中如果调用成员变量和方法必须通过对象.属性名\方法名(参数列表)的形式来调用

成员方法之间的调用，直接写方法名(参数列表)即可

**构造方法**
对象一建立就会调用构造方法，可以创建对象，给成员变量（属性）初始化。

方法名和类名相同
没有返回值和void，没有return
不能被static等关键字修饰
可以方法重载（定义多个参数列表不同的构造方法）
当一个类中没有写构造方法时，系统会默认给该类一个默认的无参构造方法。当自己定义构造方法后默认的构造方法就不存在了。（自己定义有参的构造方法后，如果还想使用无参的构造方法，就要自己再添加一个无参的构造方法）

**this关键字**

this代表它所在方法所属对象的引用。哪个对象调用的this所在的方法，this就代表哪个对象。

- 在没有static关键字修饰的方法中使用
- this关键的字用来区分成员变量和局部变量同名的情况：
- this关键字在构造方法中的第一行以 **this(参数列表)** 的形式出现时，就表示当前构造方法调用了该类中其他的构造方法（于参数列表相匹配的构造方法）：

```Java
 public  class Person{
        public String name;
        public int age;
        public void show(){
            System.out.println(name+": "+age);
        }

        public Person() {
            this("test",23);
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
```



### 面向对象的特性

#### 封装

两层含义：一层含义是把对象的属性和行为看成一个密不可分的整体，将这两者“封装”在一个不可分割的独立单元(即对象)中；

另一层含义指“信息隐藏”，把不需要让外界知道的信息隐藏起来，有些对象的属性及行为允许外界用户知道或使用，但不允许更改，而另一些属性或行为，则不允许外界知晓，或只允许使用对象的功能，而尽可能隐藏对象的功能实现细节。

封装有两种，属性的封装和方法的封装

**封装的优点**

良好的封装能够减少耦合，符合程序设计追求“高内聚，低耦合”。

类内部的结构可以自由修改。

可以对成员变量进行更精确的控制。

隐藏信息实现细节。

如上面的person类，封装之后应该为

```Java
public class Person{
        private String name;
        private int age;
        public void show(){
            System.out.println(name+": "+age);
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

        public Person() {
            this("test",23);
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
```

#### 继承

程序中的继承性是指子类拥有父类的全部特征和行为，这是类之间的一种关系。

**继承的特点**

- 子类继承了父类的所有属性和方法，但是不包括私有属性（private）和构造方法
- 子类继承父类的属性和方法同时也可以有自己的属性和方法
- Java 只支持单继承。 也就是说一个子类只能有一个父类，父类可以有多个子类，但是可以通过接口来实现多继承！

- 继承让类与类之间产生了关系，类的耦合性增强了，父类发生变化子类也会跟着改变

继承使用extends关键字，只能单继承

```Java
 public static class Student extends Person {
        public void show(){          
            super.show();
            System.out.println("我是学生,"+getName()+": "+getAge());
        }
    }
```

super关键字，表示当前类的父类的引用

super两种用法：

- super.属性名、super.方法名(参数列表)
  - 表示父类的属性和方法，和子类中的属性或方法重名时使用
- super(参数列表)
  - 出现在子类构造方法的第一句代码时
  - 就是通过参数列表匹配父类的构造方法来创建父类对象



#### 多态

多态就是同一函数在不同类中有不同的实现；

- 面向对象的多态性，即“一个接口，多个方法”。
- 多态性体现在父类中定义的属性和方法被子类继承后，可以具有不同的属性或表现方式。
- 多态性允许一个接口被多个同类使用，弥补了单继承的不足。
- 利用父类类型实例化，**子类覆写父类的方法后**，运行时，动态的再指向子类的实现，即为多态

如下示例：

```Java

public class Demo {
    public static void main(String[] args) {
        Person person=new Person();
        person.show();
        Person s=new Student();//多态的形式
        s.show();
        Person t=new Teacher();//多态的形式
        t.show();
    }

    public static class Person{
        private String name;
        private int age;
        public void show(){
            System.out.println(getName()+": "+getAge());
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

        public Person() {
            this("test",23);
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Student extends Person {
        public void show(){
            System.out.println("=============");
            System.out.println("我是学生,"+getName()+": "+getAge());
        }
    }

    public static class Teacher extends Person {
        public void show(){
            System.out.println("=============");
            System.out.println("我是老师,"+getName()+": "+getAge());
        }
    }
}

```

### 实体类Java Bean

一种思想，将实体和操作进行分开，实体中不进行任何操作，只在操作类中进行操作，如：

```Java

public class Demo {
    public static void main(String[] args) {
        Person person=new Person("test",23);
        PersonOperator p=new PersonOperator(person);
        p.showMsg(); 
    }

    public static class Person{
        private String name;
        private int age;


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

        public Person() {

        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class PersonOperator{
        private Person p;

        public PersonOperator() {
        }

        public PersonOperator(Person p) {
            this.p = p;
        }

        public Person getP() {
            return p;
        }

        public void setP(Person p) {
            this.p = p;
        }
        public  void showMsg(){
            System.out.println(p.getName()+":"+p.age);
        }
    }
}
```

实体类要求：

成员变量必须是私有的，且需要get,set方法；必须拥有无参构造函数。

实际开发中使用，目的是为了使得数据和数据的业务逻辑处理分离开来



## Java自带Api

### 键盘输入Scanner类

通过Scanner类中的next()方法来进行键盘的数据读入，示例如下：

```java
Scanner sc=new Scanner(System.in);
String next = sc.next();
System.out.println(next);
```

运行之后，回让你输入信息，输入完信息后，点击回车，就会将刚刚输入的信息输出出来

这里因为next()方法 获取到的是字符串，所以使用的是字符串来进行接收，也可以使用nextInt()、nextDouble()等这些方法，他们接受的是指定类型的数据。

当然，一般建议直接接受字符串，后续按照需要做强转即可

### 随机数生成类Random

Java中可以使用Random生成随机数

一般使用为

```
Random r=new Random();
r.nextInt(10)//这就是生成[0,10)之间的数，且是整数，同理改为nextDouble即为生成小数
```

Random r=new Random();

如果 Random()中不使用参数，那么就默认将使用默认的种子来生成随机数，默认种子数一般为当前系统时间的毫秒数

想要生成指定范围内的随机数，如[50,100)

```
Random r=new Random();
r.nextInt(50)+50
r.nextInt(14)+3//[3-16] //因为是整数，所以可以这样取
r.nextDouble(14)+3//[3-17) //浮点数就不一样了

//int randNumber = rand.nextInt(MAX - MIN + 1) + MIN; //这就是随机数的生成公式
```



随机数测试：猜数案例

随机生成一个1-100的数，进行猜数，最多猜10次，每次猜玩进行提示，成功退出，达到10次退出，并公布正确答案

示例代码

```Java


import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random random=new Random();
        double v = random.nextInt(100)%(100-1+1) + 1;
        //double v2 = random.nextInt(100) + 1;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        int count=1;
        while (flag)
        {
            System.out.print("请猜数字1-100 :");
            int i = sc.nextInt();
            System.out.println("你猜的数字是："+i);
            count++;
            if(i==v)
            {
                System.out.println("你猜对了,总共猜了"+count+"次");
                break;
            }else if(i>v)
            {
                System.out.println("你猜大了");
            }else
            {
                System.out.println("你猜小了");
            }
            if(count>=10)
            {
                System.out.println("猜了"+count+"次，未猜对，正确答案为："+v+"游戏结算！");
                break;
            }
        }

    }
}
```

### String

String对象是不可变字符串，通过""双引号来进行声明的，会放到堆内存中的字符串常量池中，且相同内容的字符串只会存储一份，

通过new生成的字符串，则直接进入堆内存中，及时相同内容，他们都会拥有不同的地址值。

连接是将两个字符组装起来，在堆里面生成一个新的字符串，然后再将这个地址返回给它

#### String创建对象封装字符串数据的方式

方式一：Java中的所有字符串文字都为此类的对象，如随意的一个字符串"asdasd"

方式二：调用String类的构造器初始化字符串对象

构造器：

public String()  创建一个空白字符串对象，不含有任何内容

public String(String str)   根据传入的字符串内容，创建字符串对象

public String(char[] ch)   根据传入的字符数组的内容，创建字符串对象

public String(byte[] byte) 根据传入的字节数组的内容，创建字符串对象

#### String的常用方法

public int length() 获取字符串长度

public char charAt(int index)  获取某个索引的字符返回，索引从0开始

public char[] toCharArray()  将当前字符串转换成字符数组并返回

public boolean equals(Object object)  判断当前字符和另一个字符内容是否相同

public boolean equalsIgnoreCase(String str) 忽略大小写进行判断

public String substring(int beginIndex,int endIndex)  按照索引进行截取，包前不包后

public String substring(int index)  按照索引进行截取，到末尾

public String replace(char old,char new)    使用新值替换旧值

public boolean contains(char s) 判断是否包含某个字符

public boolean startswith(string s)   判断是否以某个字符串开头

public String[] split(String r)   把字符串按照某个字符串进行分隔，并返回字符串数组

#### String小测试

需求：开发登录页面，提示用户输入用户名和密码，对登录进行验证，最多输错三次，密码长度不能超过8位

```Java

public class Demo {
    public static void main(String[] args) {
            UserOperator u=new UserOperator();
            u.start();
    }
    public static class User{
        private String userName;
        private String passWord;

        public User() {
        }

        public User(String userName, String passWord) {
            this.userName = userName;
            this.passWord = passWord;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassWord() {
            return passWord;
        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }
    }

    public static class UserOperator{
        private User user;

        public UserOperator() {
        }

        public UserOperator(User user) {
            this.user = user;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public boolean CheckLogin(){
            if(user.getUserName().equals("admin")&&user.getPassWord().equals("admin")){
                return true;
            }
            return false;
        }

        public  void start(){
            int count=1;
            Scanner s=new Scanner(System.in);
            String userName;
            String passWord;
            User user=new User();

            while (true){
                System.out.print("请输入账户：");
                userName=s.next();
                System.out.print("请输入密码：");
                passWord=s.next();
                user.setUserName(userName);
                user.setPassWord(passWord);
                setUser(user);
                if(CheckLogin()){
                    System.out.println("登录成功");
                    break;
                }else{
                    System.out.println("账号或密码错误，请重新登陆，您当前登陆失败次数："+count+",达到三次自动退出系统");
                }
                if(count<3) {
                    count++;
                }else {
                    break;
                }
            }
        }
    }
}

```

### ArrayList

ArrayList<T> 作为做常用的一种集合，必须会使用

首先，我们先了解什么是集合：集合是一种容器，用来装数据的，类似与数组，集合相对于数组，大小可变，先了解ArrayList

构造器 ArrayList()  创建一个空的集合

#### 常用方法：

public boolean add(E e) 将指定的元素添加到此集合的末尾

public void add(int index,E e)  将指定元素插入指定的位置，通过索引确定，索引从0开始

public E get(int index)  返回索引处的元素

public int size()  返回集合中元素的个数

public E remove(int  index) 移出指定位置的元素，返回被删除的元素

public boolean remove(Object o)  删除指定的元素，删除之后，后面的索引会自动减一

public E set(int  index ,E e)  修改索引处的元素，返回被修改的元素

附加： 想要删除包含某个字符的所有元素，配合String的contains方法使用，配合循环

#### ArrayList小测试

需求：货物展示系统，同时需要制作货物的上架，下架

```Java

public class Demo {
    public static void main(String[] args) {
        goodsOperator g=new goodsOperator();
        g.start();
    }
    public static class Goods{
       private String  name;
       private BigDecimal price;
       private String info;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }

    public static class goodsOperator{
        private List<Goods> goods=new ArrayList<Goods>();
        public void addGoods(){
            Goods g=new Goods();
            Scanner sc=new Scanner(System.in);
            System.out.print("请输入你想要添加的货物名：");
            String goodsName = sc.next();
            System.out.print("请输入你想要添加的货物价格：");
            BigDecimal price=sc.nextBigDecimal();
            System.out.print("请输入你想要添加的货物信息备注：");
            String info=sc.next();
            g.setName(goodsName);
            g.setPrice(price);
            g.setInfo(info);
            goods.add(g);
        }
        public void showGood(){
            if(goods.isEmpty()){
                System.out.println("当前还无货物！！！  请添加货物");
            }
            for (int i = 0; i < goods.size(); i++) {
                System.out.println("货物名："+goods.get(i).getName()+",价格："+goods.get(i).getPrice()+",备注信息："+goods.get(i).getInfo());
            }
        }
        public boolean removeGoods(){
            boolean flag=false;
            if(goods.isEmpty()){
                System.out.println("当前还无货物！！！  无法删除");
                return false;
            }
            Scanner sc=new Scanner(System.in);
            System.out.print("请输入要删除的货物名：");
            String name = sc.next();
            for (int i = 0; i < goods.size(); i++) {
                if(goods.get(i).getName().equals(name))
                {
                    goods.remove(i);
                    i--;
                    flag=true;

                }
                else{
                    System.out.println("货物名称有误！！删除"+name+"失败！！！");
                    flag=false;

                }
            }
            return flag;
        }

        public void start(){
            Scanner sc=new Scanner(System.in);
            while (true){
                System.out.println("==============欢迎来到货物管理系统==============");
                System.out.println("请选择你的操作：1、增加货物；2、删除货物，3、退出系统");
                showGood();
                int flag = sc.nextInt();
                switch (flag)
                {
                    case 1:
                        addGoods();
                        break;
                    case 2:
                        removeGoods();
                        break;
                    case 3:
                        System.out.println("退出系统！！！");
                        return;
                    default:
                        System.out.println("命令选择有误，请重新选择！！！！");
                        break;
                }
            }
        }
    }
}
```

# 小测验：ATM取款机系统

根据已学知识，已经可以制作一个ATM系统了

需求：功能为：登陆，开户、退出系统，开户之后回到功能选择，登陆后功能 查询账户、存款、取款、转账、修改密码、退出、注销账户，对每次的输入都进行校验

账户实体类 Account

```Java

public class Account {
    private String cardId;
    private String userName;
    private String passWord;
    private char Sex;
    private double money;
    private double xianE;

    public Account() {
    }

    public Account(String cardId, String userName, String passWord, char sex, double money, double xianE) {
        this.cardId = cardId;
        this.userName = userName;
        this.passWord = passWord;
        Sex = sex;
        this.money = money;
        this.xianE = xianE;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public char getSex() {
        return Sex;
    }

    public void setSex(char sex) {
        Sex = sex;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getXianE() {
        return xianE;
    }

    public void setXianE(double xianE) {
        this.xianE = xianE;
    }
}

```

账户操作类 ATM

```java

public class ATM {
    public static final Account a =new Account("11","test","111111",'男',100000,8000);
    ArrayList<Account> list=new ArrayList<>();

    Scanner sc=new Scanner(System.in);
    /*
    1、用户登陆
    2、用户开户
    3、退出
        1、查询账户
        2、存款
        3、取款
        4、转账
        5、修改密码
        6、退出
        7、注销账户
     */
    //启动方法
    public void start()
    {
        list.add(a);
        while (true)
        {
            System.out.println("======欢迎进入银行系统！！=======");
            System.out.println("请选择你想要的功能");
            System.out.println("1、用户登陆");
            System.out.println("2、用户开户");
            System.out.println("3、退出系统");
            switch (sc.next())
            {
                case "1":
                    if(this.list.isEmpty())
                    {
                        System.out.println("当前系统并无账户，不可登陆！请先开户");
                        break;
                    }
                    System.out.print("请输入用户名：");
                    String userName= sc.next();
                    System.out.print("请输入密码：");
                    String passWord= sc.next();
                    Account login = Login(userName, passWord);
                    if(login!=null)
                    {
                        System.out.println(userName+"登陆成功");
                        //查询等操作开始页面
                        boolean work = work(login);
                        if (!work)
                        {
                            return;
                        }
                    }

                    break;
                case "2":
                     CreateAccount();
                    break;
                case "3":
                    System.out.println("成功退出系统，下次再见！！!");
                    return;
                default:
                    System.out.println("输入命令有误！！！请重新输入！");
            }
        }
    }
    public Account Login(String userName,String passWord)
    {

        Account refAccount=null;
        for (Account account : this.list) {
            if(userName.equals(account.getUserName())&&passWord.equals(account.getPassWord()))
            {
                refAccount= account;
            }

        }
        return refAccount;
    }
    public void CreateAccount()
    {
        System.out.println("============欢迎进入开户页面===========");
        System.out.print("请输入卡号：");
        String cardId = sc.next();
        System.out.print("请输入用户名：");
        String userName = sc.next();
        System.out.print("请输入密码：");
        String passWord = sc.next();
        System.out.print("请输入性别：");

        char sex= 0;
        checkSex(sc,sex);
        System.out.print("请输入余额：");
        Double money=sc.nextDouble();
        System.out.print("请输入限额：");
        Double xianE=sc.nextDouble();
        Account account=new Account(cardId,userName,passWord,sex,money,xianE);
        boolean add = this.list.add(account);
        if(add)
        {
            System.out.println("用户开户成功！");
        }
        else
        {
            System.out.println("用户开户失败！");
            return;
        }

    }

    public void checkSex(Scanner sc,char sex)
    {
        while (true) {
            sex = sc.next().charAt(0);
            if(sex!='男' & sex!='女')
            {
                System.out.print("性别输入错误，请重新输入（男或女）：");
            }
            else {
                break;
            }
        }
    }
    public boolean work(Account login)
    {
        while (true){


          /*  1、查询账户
            2、存款
            3、取款
            4、转账
            5、修改密码
            6、退出
            7、注销账户*/
            System.out.println("=========="+login.getUserName() +"~欢迎进入银行系统！！=======");
            System.out.println("请选择你想要的功能");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销账户");
            switch (sc.next())
            {
                case "1":
                    System.out.println(login.getUserName()+"的余额为："+login.getMoney());
                    break;
                case "2":
                    CunKuan(login);
                    break;
                case "3":
                    System.out.print("请输入你想要取出的金额：");
                    double moneys= sc.nextDouble();
                   /* if(moneys>login.getXianE())
                    {
                        System.out.println("您的取款金额大于取款限额~");
                    }else {
                        if (moneys > login.getMoney()) {
                            System.out.println("您的余额不足~~");
                        }
                        login.setMoney(login.getMoney() - moneys);
                        System.out.println("您取款后余额为："+login.getMoney());
                    }*/
                    checkMoney(login,moneys);
                    break;
                case "4":
                    if(this.list.size()<2)
                    {
                        System.out.println("系统没有足够的用户进行转账操作~");
                    }
                    System.out.print("请输入对方账户卡号：");
                    String CardId= sc.next();
                    System.out.print("请输入转账金额：");
                    double m=sc.nextDouble();
                    for (Account account : this.list) {
                        if (CardId.equals(account.getCardId()))
                        {
                            checkMoney(login,m);
                            account.setMoney(account.getMoney()+m);
                            System.out.println("账户"+account.getUserName()+"的余额为："+account.getMoney());
                        }
                    }
                    //转账
                    break;
                case "5":
                    //修改密码
                    System.out.print("请输入原密码：");
                    String pass = sc.next();
                    if(pass.equals(login.getPassWord()))
                    {
                        System.out.print("请输入新密码：");
                        String newPassWord = sc.next();
                        System.out.print("请再次输入新密码：");
                        String RePassWord = sc.next();
                        if(newPassWord.equals(RePassWord))
                        {
                            login.setPassWord(newPassWord);
                            System.out.println("修改密码成功，请重新登陆");
                            return true;
                        }
                        else
                        {
                            System.out.println("两次密码不一致！！");
                        }
                    }
                    break;
                case "6":
                    //退出
                    System.out.println("成功退出系统，下次再见！！!");
                    return false;
                case "7":
                    //注销账户
                    System.out.print("您正在注销账户！！请确认是否真的注销！请输入（是：Y，否：N）：");
                    String s= sc.next();
                    if (s.equals("Y"))
                    {
                        if(list.remove(login))
                        {
                            System.out.println("您的账号注销成功！！！");
                            return false;
                        }else {
                            System.out.println("出现错误~请联系管理员");
                            return false;
                        }
                    } else if (s.equals("N")) {
                        System.out.println("取消注销~为您返回上一页面~");
                    }
                    break;
                default:
                    System.out.println("您输入的命令有误~ 请重新输入！");
                    break;
            }
        }
    }
    public void CunKuan(Account login)
    {
        while (true) {
            System.out.print("请输入你想要存入的金额：");
            double money = sc.nextDouble();
            if (money > 0) {
                login.setMoney(login.getMoney() + money);
                System.out.println("存入了" + money + "元，现在的余额为：" + login.getMoney());
                break;
            } else {
                System.out.println("您输入的金额不正确~请重新输入！！");
            }
        }
    }
    public void checkMoney(Account account,double moneys)
    {
        if(moneys>account.getXianE())
        {
            System.out.println("您的支出金额大于限额~");
        }else {
            if (moneys > account.getMoney()) {
                System.out.println("您的余额不足~~");
            }
            account.setMoney(account.getMoney() - moneys);
            System.out.println("您消费后余额为："+account.getMoney());
        }
    }
}

```

main方法调用

```java

public class ATMDemo {
    public static void main(String[] args) {
        ATM a=new ATM();
        a.start();
    }
}

```

至此，基础全部完结！！

# 扩展加强

## static修饰符

static  叫做静态，可以修饰成员变量，成员方法

### 修饰成员变量

成员变量按照有无static修饰，分为两种：

类变量：有static修饰，属于类，在计算机中只有一份，会被类的全部对象共享。其他对象如果做更改，那么它的值也会对应变化。可以直接使用类名.变量名来访问

实例变量（对象的变量）：无static修饰，即普通成员变量，属于每一个方法。

``` java
class Person{
    public static String name;//类变量
    private int age;//实例变量

    public Person() {
    }

    public Person(String name, int age) {
        this.name=name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Demo {
    public static void main(String[] args) {

        Person p1=new Person("测试",12);
        System.out.println("通过静态调用，静态变量名为："+Person.name);
        Person.name="芜湖";
        System.out.println("通过实例调用，静态变量名为："+p1.getName()+"  实例变量："+p1.getAge());
        Person p2=new Person("起飞",23);
        System.out.println("通过实例调用，静态变量名为："+p2.getName()+"  实例变量："+p2.getAge());
    }


}


```

类变量一般用于 在程序中只需要一份的数据。如：计数器

### 修饰成员方法

同样按照有无static修饰，分为两种

类方法：有static修饰，属于类，可以直接使用类名.方法名进行调用，类方法中不能使用this关键字

实例方法：无static修饰，属于对象

```java

public class Demo {
    public static void main(String[] args) {

        Person p1=new Person("测试",12);
        System.out.println("通过静态调用，静态变量名为："+Person.name);
        Person.name="芜湖";
        System.out.println("通过实例调用，静态变量名为："+p1.getName()+"  实例变量："+p1.getAge());
        Person p2=new Person("起飞",23);
        System.out.println("通过实例调用，静态变量名为："+p2.getName()+"  实例变量："+p2.getAge());
        System.out.println("============================");
        Person.showStatic();
        p1.showMethod();
    }


}
class Person{
    public static String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name=name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void showStatic(){
        System.out.println("类方法被调用！！！");
    }

    public  void showMethod(){
        System.out.println("实例方法被调用！！！");
    }
}

```

一般用于制作工具类

### 代码块

代码块是类的五大成分之一（成员变量、构造器、成员方法、代码块、内部类）

代码块分为两种：静态代码块和实例代码块

**实际开发基本不用**

#### 静态代码块

格式为： 

```java
static{}
```

特点：在类加载是自动执行，由于类只会加载一起，所以静态代码块的内容也只会执行一次

作用：完成类的初始化，如：对类变量的初始化赋值

#### 实例代码块

格式为：

```java	
{}
```

特点：每次创建对象时，执行实例代码块，并且在构造器之前执行

作用：和构造器一样，都是用来完成对象的初始化，如：对实例变量进行初始化赋值

例子：

```java

public class Demo {
    public static void main(String[] args) {

       Person p1=new Person();
       Person p2=new Person();
    }


}
class Person{
    public static String name;
    private int age;

    static {
        System.out.println("静态代码块执行");
    }
    {
        System.out.println("实例代码块执行");
    }

    public Person() {
        System.out.println("无参构造调用");
    }

    public Person(String name, int age) {
        this.name=name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void showStatic(){
        System.out.println("类方法被调用！！！");
    }

    public  void showMethod(){
        System.out.println("实例方法被调用！！！");
    }
}

```

可以由此看出：静态代码块只会执行一次，实例代码块每次创建对象都会执行，且代码块都在构造函数之前执行

### 单例设计模式

对于static应用场景，最为广泛的就是单例设计模式。这是一种编程思想：即某一个类，仅仅只需要创建一次他的对象，不需要反复的创建，确保一个类只有一个对象，例子就是游戏中，主角角色只有一个，不能够通过new创建对象

单例有两种，饿汉式单例和懒汉式单例

写法为：

类的构造器私有，定义一个类变量记住该类的一个对象，定义一个方法，用来返回这个对象

```java
class Person{
    private static Person person;
    private static String name;
    private int age;

    public static Person getInstance(){
        if(person==null){
            person=new Person();
        }
        return person;
    }
    private Person(){
        System.out.println("无参构造调用");
    }
    private Person(String name, int age) {
        this.name=name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

public class Demo {
    public static void main(String[] args) {
        Person p1= Person.getInstance();
        Person p2= Person.getInstance();
        System.out.println(p1);
        System.out.println(p2);
        p1.setName("测试");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }


}

```

这就是一种懒汉式单例，需要拿对象的时候再去创建对象，使用static final修饰

```java
class Person{
    private static final Person person=new Person();
    private static String name;
    private int age;

    public static Person getInstance(){
        return person;
    }
    private Person(){
        System.out.println("无参构造调用");
    }
    private Person(String name, int age) {
        this.name=name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Demo {
    public static void main(String[] args) {

        Person p1= Person.getInstance();
        Person p2= Person.getInstance();
        System.out.println(p1);
        System.out.println(p2);
        p1.setName("测试");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }


}
```

后续还会有线程安全的问题需要解决，这里暂时不讲

## 继承

集成是面向对象三大特性之一，使用extends关键字来实现继承，在Java中只能单继承，Java中，所有的类都直接或间接的继承Object类

继承的特点：子类能继承父类所有的非私有的成员和方法

集成后对象的创建：子类的对象是由子类、父类共同完成的

写法：

```java
public class B extends A{
    
}
```

其中A就称为B的父类（超类，基类），B就是A的子类（派生类）

继承可以对父类的方法进行重写，即父类的方法满足不了需求，可以对该方法进行重写

在子类中访问其他成员（成员方法，成员变量），依照就近原则，父类使用super，本类中使用this，方法中直接使用名称

```java

public class Demo {
    public static void main(String[] args) {
        B b=new B();
        b.show();

    }
}
class A {
    public String msg="父类名称";
    public A(){
        System.out.println("A的无参构造调用");
    }
    public A(String msg){
        this.msg=msg;
        System.out.println("A的有参构造调用");
    }
    public void show(){

        System.out.println("A:"+msg);
    }
}
class B extends A{
    String msg="子类名称";
    public B(){
        System.out.println("B无参构造调用");
    }
    public B(String msg){
        this.msg=msg;
        System.out.println("B的有参构造调用");
    }
    @Override
    public void show(){
        super.show();
        String msg="内部字段";
        System.out.println("B:"+msg);
        System.out.println("B:"+this.msg);
        System.out.println("B:"+super.msg);
    }
}

```

## 多态

多态是在继承/实现情况下的一种现象，表现为：对象多态，行为多态。

多态的前提：有实现/继承关系，存在方法重写

对象多态：即使用父类定义 子类实现，接口定义，实现类实现

行为多态：

```java

public class Demo {
    public static void main(String[] args) {
       A a=new B();//对象多态
       a.show();//行为多态
       System.out.println(a.msg);//成员变量不多态，输出A的msg
    }
}
class A {
    public String msg="父类名称";
    public A(){
        System.out.println("A的无参构造调用");
    }
    public A(String msg){
        this.msg=msg;
        System.out.println("A的有参构造调用");
    }
    public void show(){
        System.out.println("A:"+msg);
    }
}
class B extends A{
    String msg="子类名称";
    public B(){
        System.out.println("B无参构造调用");
    }
    public B(String msg){
        this.msg=msg;
        System.out.println("B的有参构造调用");
    }
    @Override
    public void show(){
        super.show();
        String msg="内部字段";
        System.out.println("B:"+msg);
        System.out.println("B:"+this.msg);
        System.out.println("B:"+super.msg);
    }
}

```

对于成员方法多态，编译看左，运行看有

对于成员变量，不存在多态，编译看左，运行看左

**多态的好处**

在多态形式下，右边是解耦合的，利于维护和扩展

定义方法时，使用父类型的形参，可以接收一切子类对象，扩展性更强，更加便利

**存在的问题**

多态不能够直接调用子类的独有方法，想要使用需要进行类型转换，转换前使用instanceof 进行判断类型，避免类型转换异常

```java

public class Demo {
    public static void main(String[] args) {
       A a=new B();
       go(a);
       System.out.println(a.msg);
        System.out.println("==================");
        A b=new B();
        go(b);
        System.out.println("==================");
        A c=new C();
        go(c);

    }
    public static void go(A a){
        a.show();
        if(a instanceof B){
            B b=(B) a;
            b.BMethod();
        } else if (a instanceof C) {
            C c=(C) a;
            c.CMethod();
        }
    }
}

class A {
    public String msg="父类名称";
    public A(){
        System.out.println("A的无参构造调用");
    }
    public A(String msg){
        this.msg=msg;
        System.out.println("A的有参构造调用");
    }
    public void show(){
        System.out.println("A:"+msg);
    }
}
class B extends A{
    String msg="子类名称";
    public B(){
        System.out.println("B无参构造调用");
    }
    public B(String msg){
        this.msg=msg;
        System.out.println("B的有参构造调用");
    }
    @Override
    public void show(){
        super.show();
        String msg="B内部字段";
        System.out.println("B:"+msg);
        System.out.println("B:"+this.msg);
        System.out.println("B:"+super.msg);
    }
    public void BMethod(){
        System.out.println("B独有方法！！");
    }
}


class C extends A{
    String msg="子类名称";
    public C(){
        System.out.println("B无参构造调用");
    }
    public C(String msg){
        this.msg=msg;
        System.out.println("B的有参构造调用");
    }
    @Override
    public void show(){
        super.show();
        String msg="C内部字段";
        System.out.println("C:"+msg);
        System.out.println("C:"+this.msg);
        System.out.println("C:"+super.msg);
    }
    public void CMethod(){
        System.out.println("C独有方法！！");
    }
}

```

