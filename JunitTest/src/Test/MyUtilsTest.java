package Test;

import JunitUtils.MyUtils;
import org.junit.*;


public class MyUtilsTest {
    @BeforeClass//在Junit5之后变成BeforeALL,一般用来释放资源
    public static void BeforeClass(){
        System.out.println("BeforeClass----->只执行一次，在所有之前！！");
    }
    @Before//在Junit5之后变成BeforeEach
    public void before(){
        System.out.println("before------->执行！！！");
    }
    @org.junit.Test
    public void getMaxIndex() {
        int index1 = MyUtils.getMaxIndex("芜湖起飞！！");
        System.out.println(index1);
        System.out.println(MyUtils.getMaxIndex(""));
        int index2 = MyUtils.getMaxIndex(null);
        System.out.println(index2);
        //断言机制
        Assert.assertEquals("getMaxIndex方法存在问题",5,index1);

    }

    @org.junit.Test
    public void getLength() {
        MyUtils.getLength("芜湖起飞！！！");
        MyUtils.getLength("");
       // MyUtils.getLength(null);

    }
    @AfterClass//在Junit5之后变成AfterALL
    public static void AfterClass(){
        System.out.println("AfterClass----->只执行一次，在所有之后！！");
    }
    @After//在Junit5之后变成AfterEach
    public void After(){
        System.out.println("After------>执行");
    }
}
