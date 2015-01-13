/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POS;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jamab0467
 */
public class PanButtons extends JPanel {
    
double dSubtotal=0;
String sPick;
   // JFrame frame = new JFrame(); //creates frame
    JButton[][] grid; //names the grid of buttons

    public PanButtons() { //constructor
int nWidth = 1, nLength = 0;
        PanButtons.ClickTestListener clickTestListener;
        clickTestListener = new PanButtons.ClickTestListener();
       // frame.setLayout(new GridLayout(nWidth, nLength)); //set layout
        setLayout(new GridLayout(nWidth, nLength)); //set layout
        grid = new JButton[nWidth][nLength]; //allocate the size of grid
        for (int y = 0; y < nLength; y++) {
            for (int x = 0; x < nWidth; x++) {
                if (x != 1 && y != 0) {
                    grid[x][y] = new JButton("(" + x + "," + y + ")");
                } else {
                    ImageIcon chicken = new ImageIcon("Chicken.jpg");
                    grid[x][y] = new JButton(chicken);
                }
                //creates new button     
                //frame.add(grid[x][y]); //adds button to grid
                add(grid[x][y]); //adds button to grid
                grid[x][y].addActionListener((ActionListener) clickTestListener);
            }
        }
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.pack(); //sets appropriate size for frame
       // frame.setVisible(true); //makes frame visible
        new ButtonGrid(3, 3);//makes new ButtonGrid with 2 parameters
        //frame.add(button);
    }

   

   /* public static void main(String[] args) {
        new ButtonGrid(3, 3);//makes new ButtonGrid with 2 parameters
    }*/

    class ClickTestListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == grid[1][0]) {
                System.out.println("Chicken");
                sPick="Chicken";
                 dSubtotal = 10.99*1.13;
            }
        }
    }
}