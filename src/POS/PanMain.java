package POS;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 


public class PanMain {

   
    // * @param args the command line arguments
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
*/
import javax.swing.*;
     import java.awt.*;
public class PanMain extends JPanel // panel definition
       {
   // PanCash panCash = new PanCash();
    PanButtons panButtons = new PanButtons();
    PanReceipt panReceipt = new PanReceipt(panButtons);
      //PanDisp panDisp = new PanDisp();
    //   PanLabelChange panLabelChange = new PanLabelChange(panDisp);
      // PanColour panColour = new PanColour(panDisp);
 public PanMain() {
     //add(panButtons, BorderLayout.CENTER);
       // this next line tells PanMain that it has a border layout.
      // setLayout(new BorderLayout());
       //add(panLabelChange, BorderLayout.SOUTH);
     add(panReceipt, BorderLayout.SOUTH);
       //add(panCash, BorderLayout.WEST);
       //add(panButtons, BorderLayout.WEST);
       
       //add(panColour, BorderLayout.WEST);
       }
       }