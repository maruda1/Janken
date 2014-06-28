/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package janken;



/**
 *
 * @author marukawadaiki
 */
public class HumanPlayer {
    // 属性　Randomクラス参照型フィールド変数
    private static int num = 0;
    private int id = 0;
   
    private String name = "";
    public HumanPlayer(String n){
        num++;
        id = num;
        
        name = n;
    }
    
   public String getNameId(){
       return(name + "("+id+")");
   }
   public void setName(String n){
       name = n;
   }
   
    public int pon(int h){
        int hand = h ;
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
