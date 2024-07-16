package Search.BinarySearch;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] list=new int[]{1,2,3,4,5,6,7,8};
        int i = BinarySearch(list, 2);
    }

    public static int BinarySearch(int[] list, int num){
        int left=0;//左边界
        int right=list.length-1;//右边界
        int mid=-1;//中间位置
        int ref=-1;
       while (left<=right){//循环停止条件，即最坏情况，走到最后一步才找到
           mid=(left+right)/2;//每次循环都更新一下中间位置
           if(num<list[mid]){
               right=mid-1;//中间值大于查找值，更新右边界，为中间值-1
           } else if (num>list[mid]) {
               left=mid+1;//中间值小于查找值，更新左边界，为中间值+1
           } else if (num==list[mid]) {
               ref=list[mid];
               break;
           }
       }
        if(ref!=-1){
            System.out.println("找到了数据"+num+"位置在："+mid);
        }else {
            System.out.println("数据未找到！");
        }
        return ref;
    }
}
