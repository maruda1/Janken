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
public class Match {
    private HumanPlayer hp = null;
    private ComputerPlayer cp = null;
    
    public Match(HumanPlayer p1 ,ComputerPlayer p2){
        hp = p1;
        cp = p2;
    }
    public HumanPlayer getPlayer1(){
        return(hp);
    }
    public ComputerPlayer getPlayer2(){
        return(cp);
    }
}
