package Collections.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    List<Card> cardsList=new ArrayList<>();
    public Room() {
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2",};
        String[] colors={"♠","♥","♦","♣"};

        int size =0;
        for (String number : numbers) {
            for (String color : colors) {
                cardsList.add(new Card(number,color,size));
                size++;
            }
        }
        cardsList.add(new Card("","🃏",++size));
        cardsList.add(new Card("","👨",++size));
        System.out.println("新牌："+cardsList);
    }
    public void start(){
        Collections.shuffle(cardsList);
        System.out.println("洗牌过后："+cardsList);
        List<Card> PlayA=new ArrayList<>();
        List<Card> PlayB=new ArrayList<>();
        List<Card> PlayC=new ArrayList<>();

        for (int i = 0; i < cardsList.size()-3; i++) {
            if(i%3==0){
                PlayA.add(cardsList.get(i));
            }
            else if(i%3==1){
                PlayB.add(cardsList.get(i));
            }
            else{
                PlayC.add(cardsList.get(i));
            }
        }
        sort(PlayA);
        sort(PlayB);
        sort(PlayC);
        System.out.println("玩家A的牌为："+PlayA);
        System.out.println("玩家B的牌为："+PlayB);
        System.out.println("玩家C的牌为："+PlayC);
        List<Card> lastCard = cardsList.subList(cardsList.size() - 3, cardsList.size());
        System.out.println("底牌为："+lastCard);
        PlayC.addAll(lastCard);
        sort(PlayC);
        System.out.println("玩家C为地主，牌为："+PlayC);
    }
    public void sort(List<Card> list){
        Collections.sort(list, Comparator.comparingInt(Card::getSize));
    }
}
