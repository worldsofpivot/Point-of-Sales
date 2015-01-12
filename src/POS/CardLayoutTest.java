package POS;

import Panels2.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  // Packages used in this program imported    

public class CardLayoutTest extends JFrame implements ActionListener
{

    JPanel panMaster;
    JButton btnOne, btnTwo, btnThree;

    public CardLayoutTest() //This is the CONSTRUCTOR method
    {
        //The entry point into your program
        setLayout(new FlowLayout()); //Use this for now.
        setSize(810, 510); //Set the size of the JFrame
        setTitle("Generic Card Game"); //Put Title on top of JFrame
        setBackground(Color.yellow);
        setResizable(false);

        btnOne = new JButton("THIS IS BUTTON 1");
        btnTwo = new JButton("THIS IS BUTTON 2");
        btnThree = new JButton("THIS IS BUTTON 3");

        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);    

        //Create the panMaster

        JPanel panOne = new JPanel();
        panOne.add(btnOne);

        JPanel panTwo = new JPanel();
        panTwo.add(btnTwo);

        JPanel panThree = new JPanel();
        panThree.add(btnThree);

        //Create the panel that contains the "panMaster".

        panMaster = new JPanel(new CardLayout());
        //cl = CardLayout(panMaster);

        panMaster.add(panOne);
        panMaster.add(panTwo);
        panMaster.add(panThree);

        getContentPane().add(panMaster); 
        setVisible(true); //Make JFrame visible
    }

    public void actionPerformed(ActionEvent e)
    {  
        CardLayout cardLayout = (CardLayout) panMaster.getLayout();
        cardLayout.next(panMaster);
        //if (e.getSource() == btnOne){    
            //What do i put here to change to Panel panTwo or panThree and so on.
        //}
    }
    public static void main(String args[])
    {    
        CardLayoutTest cardLayoutTest = new CardLayoutTest(); // This calls the constructor and runs it    
    }
}