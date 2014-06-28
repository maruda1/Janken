/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package janken;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;


/**
 *
 * @author marukawadaiki
 */
public class JCanvas extends javax.swing.JPanel {
    private Image[] handImage = null;
    private int hand = 0;
    
    /**
     * Creates new form JCanvas
     */
    public JCanvas() {
        initComponents();
        handImage = new Image[3];
        for ( int i= 0; i<=2; i++){
            //handImage[i]= getToolkit().getImage(i+".jpg").getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            URL url=getClass().getClassLoader().getResource(
            "janken/" + i + ".jpg");
            System.out.println( url );
            handImage[i] = getToolkit().getImage( url )
            .getScaledInstance(100,100,Image.SCALE_SMOOTH);
        }
        hand = 0;
    }
    public void setHand(int h){
        hand = h;
    }
    public void paintComponent(Graphics g){
        Image img = handImage[hand];
        if(img !=null){
            g.drawImage(img,0,0,this);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}