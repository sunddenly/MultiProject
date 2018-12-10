package org.hebut.scse.algorithm.cases;

import java.util.Arrays;
import java.util.Random;

/**
 * 洗牌：每次都和随机数进行交换
 */
public class Poker {
    private Card[] cards;
    int[] faces={1,2,3,4,5,6,7,8,9,10,11,12,13};
    String[] suites={"方块","梅花","红桃","黑桃"};
    public Poker() {
        cards=new Card[52];
        for(int i=0;i<suites.length;i++)//每类13张
            for(int j=0;j<faces.length;j++){
                cards[i*13+j]=new Card(suites[i],faces[j]);
            }
    }
    public Poker(Card[] cards) {
        this.cards = cards;
    }
    public void shuffle(){
        Random random = new Random();
        for(int i=0,len=cards.length;i<len;i++){//52张牌有可能所有牌的位置可能不变
            int index= random.nextInt(52);
            Card t = cards[index];
            cards[index]=cards[i];
            cards[i]=t;
        }
    }
    public void getCards(){
        for(Card c:cards){
            System.out.print(c+",");
        }
    }

    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.getCards();
        poker.shuffle();
        System.out.println();
        poker.getCards();

    }
}
class Card{
    private String suite;//花色
    private int face; //面值
    public Card(String suite,int face){
        this.suite=suite;
        this.face=face;
    }

    @Override
    public String toString() {
        String s="";
        switch (face){
            case 1:
                s="A";
                break;
            case 11:
                s="J";
                break;
            case 12:
                s="Q";
                break;
            case 13:
                s="K";
                break;
            default:
                s=String.valueOf(face);
        }
        return suite+s;
    }
}