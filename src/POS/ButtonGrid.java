package POS;

import javax.swing.JFrame; //imports JFrame library
import javax.swing.JButton; //imports JButton library
import java.awt.GridLayout; //imports GridLayout library
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class ButtonGrid {

    JFrame frame = new JFrame(); //creates frame
    JButton[][] grid; //names the grid of buttons

    public ButtonGrid(int width, int length) { //constructor

        ButtonGrid.ClickTestListener clickTestListener = new ButtonGrid.ClickTestListener();
        frame.setLayout(new GridLayout(width, length)); //set layout
        grid = new JButton[width][length]; //allocate the size of grid
        for (int y = 0; y < length; y++) {
            for (int x = 0; x < width; x++) {
                if (x != 1 && y != 0) {
                    grid[x][y] = new JButton("(" + x + "," + y + ")");
                } else {
                    ImageIcon chicken = new ImageIcon("Chicken.jpg");
                    grid[x][y] = new JButton(chicken);
                }
                //creates new button     
                frame.add(grid[x][y]); //adds button to grid
                grid[x][y].addActionListener((ActionListener) clickTestListener);
            }
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); //sets appropriate size for frame
        frame.setVisible(true); //makes frame visible

        //frame.add(button);
    }

    public static void main(String[] args) {
        new ButtonGrid(3, 3);//makes new ButtonGrid with 2 parameters
    }

    class ClickTestListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == grid[1][0]) {
                System.out.println("Chicken");
                
            }
        }
    }
}