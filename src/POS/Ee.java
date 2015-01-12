package POS;


//import static Ed.frame;
//import static PanRectangle.txtNum2;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Ee {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    public static JFrame frame = new JFrame();

    public static void main(String[] args) {

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanRectangle panDifference = new PanRectangle();
        frame.add(panDifference);
        frame.setVisible(true);
    }
}

class PanRectangle extends JPanel {

    public static JTextField txtNum1 = new JTextField(5);
    public static JTextField txtNum2 = new JTextField(5);
    public static JTextField txtNum3 = new JTextField(5);
    public static JTextField txtNum4 = new JTextField(5);
    public static JButton btnCalc = new JButton("Calculate Difference");
    public static JLabel lblUnder = new JLabel();
    public static JLabel lblAns = new JLabel();
    int nDeltaX = 0, nDeltaY = 0, nX1 = 0, nX2 = 0, nY2 = 0, nY1 = 0;
    Rectangle rect= new Rectangle(nX1,nY1,nDeltaX,nDeltaY);

    public PanRectangle() {
        add(txtNum1);
        add(txtNum2);
        add(txtNum3);
        add(txtNum4);
        add(btnCalc);
        add(lblAns);
        ClickTestListener clickTestListener = new PanRectangle.ClickTestListener(); // both lines work
        btnCalc.addActionListener(clickTestListener);
    }

    class ClickTestListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            int nX1 = Integer.parseInt(txtNum1.getText());
            int nY1 = Integer.parseInt(txtNum2.getText());
            int nX2 = Integer.parseInt(txtNum3.getText());
            int nY2 = Integer.parseInt(txtNum4.getText());
            nDeltaX = nX2 - nX1;
            nDeltaY = nY2 - nY1;
            //rect = new Rectangle(nX1, nY1, nDeltaX, nDeltaY);

            revalidate(); // this refreshes the panel
        }

        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            //g2.fillRect(nX1, nY1, nDeltaX, nDeltaY);
            g2.draw(rect);
             g2.setColor(Color.BLUE);
            
        }
    }
}
  /*  class ClickTestListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            int nX1 = Integer.parseInt(txtNum1.getText());
            int nY1 = Integer.parseInt(txtNum2.getText());
            int nX2 = Integer.parseInt(txtNum3.getText());
            int nY2 = Integer.parseInt(txtNum4.getText());
            nDeltaX = nX2 - nX1;
            nDeltaY = nY2 - nY1;
            rect = new Rectangle(nX1, nY1, nDeltaX, nDeltaY);
            revalidate(); // this refreshes the panel


        }

        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
             g.drawRect (10, 10, 200, 200);
            g2.draw(rect);
        }
    }
}
/*
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

  public void paint(Graphics g) {
    g.drawRect (10, 10, 200, 200);  
  }
}

public class Ee {
  public static void main(String[] a) {
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(30, 30, 300, 300);
    window.getContentPane().add(new MyCanvas());
    window.setVisible(true);
  }
}*/