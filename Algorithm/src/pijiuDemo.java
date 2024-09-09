public class pijiuDemo {

    public static Integer totalNumber=0;//买了多少瓶
    public static Integer totalBottles=0;//剩余瓶子
    public static Integer totalCovers=0;//剩余瓶盖
    //啤酒问题，一瓶啤酒2元，四个盖子换一瓶，两个空瓶换一瓶，10元能换多少瓶
    public static void main(String[] args) {
        buy(10);
        System.out.println("买了："+totalNumber+"瓶");
        System.out.println("剩余酒瓶："+totalBottles);
        System.out.println("剩余瓶盖："+totalCovers);
    }

    /**
     * 思路：重复买酒，先把所有的钱买酒，然后用瓶盖，瓶子换钱，再次买酒，形成递归
     * @param money
     */
    public static void buy(int money){
        int buyNumber=money/2;//获取买的啤酒数量
        totalNumber+=buyNumber;

        int allBottleNumber=buyNumber+totalBottles;//所有瓶子数
        int allCoverNumber=buyNumber+totalCovers;//所有瓶盖数
        int allMoney=0;
        if(allBottleNumber>=2) {
            allMoney += (allBottleNumber / 2)*2;
        }
        totalBottles=allBottleNumber%2;
        if(allCoverNumber>=4) {
            allMoney += (allCoverNumber / 4)*2;
        }
        totalCovers=allCoverNumber%4;
        if(allMoney>=2){
            buy(allMoney);
        }

    }
}
