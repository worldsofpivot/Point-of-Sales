/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POS;

/**
 *
 * @author jamab0467
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanReceipt extends JPanel {
    PanCash panCash;
    PanButtons panButtons;
    JButton btnCbk;
   JLabel lblSubtotal;
   JLabel lbl123 = new JLabel("Pen");;
  double dSum, dSubtotal;
    int nCbk1;
        String sPick;
   
    public PanReceipt(PanButtons _panButtons) {
       // panCash = _panCash;
        panButtons = _panButtons;
        //nCbk1 = panCash.nCbk;
        JButton btn1 = new JButton("Number 1");
        JButton btn2 = new JButton("Number 2");
        add(btn1);
        add(btn2);
        add(lbl123);
//public PanReceipt() {
  //  }
        
class LabelChangeListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                JButton btn = (JButton) event.getSource();
                System.out.println(dSum);
                if (sPick=="Chicken") {
                    lbl123.setText("Subtotal is ");
                }
               // sName = btn.getText(); // gets the text value of the button
               // panCash.UpdateLabel(sName);
            }
        }
        ActionListener labelChangeListener = new LabelChangeListener();
        btn1.addActionListener(labelChangeListener);
        btn2.addActionListener(labelChangeListener);
        
}

  



   
}