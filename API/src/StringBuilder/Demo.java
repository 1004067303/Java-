package StringBuilder;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Demo {
    public static void main(String[] args) {

        System.out.print("输入整型数组的长度：");
        Scanner sc=new Scanner(System.in);
        int count = sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            System.out.print("输入第"+i+"个数据：");
            arr.add(sc.nextInt());
        }
        System.out.println(getString(arr));
        System.out.println(getStrings(arr));



    }
    public static String getString(ArrayList<Integer> arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.size(); i++) {
            if(i!=arr.size()-1) {
                sb.append(arr.get(i) + ",");
            }else {
                sb.append(arr.get(i));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static String getStrings(ArrayList<Integer> arr)
    {
        StringJoiner sj=new StringJoiner(",","[","]");
        for (Integer integer : arr) {
            sj.add(integer.toString());
        }
        return sj.toString();
    }
}
