/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package janken;

import java.util.Random;

/**
 *
 * @author marukawadaiki
 */
public class ComputerPlayer {
    // 属性　Randomクラス参照型フィールド変数
    private static int num = 0;
    private int id = 0;
    private Random randomGenerater = null;
    private String name = "";
    public ComputerPlayer(String n){
        num++;
        id = num;
        randomGenerater = new Random();
        name = n;
    }
    
   public String getNameId(){
       return(name + "("+id+")");
   }
   public void setter(String n){
       name = n;
   }
   
    public int pon(){
        int hand = randomGenerater.nextInt(3);
        return hand;
    }
    public static String toStringHand (int hand){
        switch(hand){
            case 0:
                return("ぐー");
            case 1:
                return("ちょき");
            case 2:
                return("ぱー");
            default:
                return("ありえません");
        }
    }
}
