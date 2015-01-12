package POS;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import Panels2.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    /**
     * @param args the command line arguments
     */
    PanMain panMain = new PanMain();

    public FraMain() {
        setSize(400, 400);
        setTitle("Empty Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain);
        setVisible(true);
    }
}