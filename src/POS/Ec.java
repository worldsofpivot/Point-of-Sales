package POS;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ec {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    public static JFrame frame = new JFrame();

    public static void main(String[] args) {
        //frame.setLayout(new FlowLayout());
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanCircle panCircle = new PanCircle();
        frame.add(panCircle);
        frame.setVisible(true);
    }
}

class PanCircle extends JPanel {
    //public static JTextField txtName = new JTextField(20);

    public static JTextField txtRadius = new JTextField(3);
    public static JButton btnCircumference = new JButton("Circumference");
    public static JButton btnArea = new JButton("Area");
    public static JLabel lblUnder = new JLabel();
    public static JLabel lblAns = new JLabel();

    public PanCircle() {
        //add(txtName);
        add(txtRadius);
        add(btnCircumference);
        add(btnArea);
        add(lblAns);
        PanCircle.ClickTestListener clickTestListener = new PanCircle.ClickTestListener(); // both lines work
        //PanCircle.ClickTestListener clickTestListener = new PanCircle.ClickTestListener();
        btnCircumference.addActionListener(clickTestListener);
        btnArea.addActionListener(clickTestListener);
    }

    class ClickTestListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == btnCircumference) {

                //String sName = txtName.getText();
                int nRadius = Integer.parseInt(txtRadius.getText());
                double dCircumference = Math.PI * 2 * nRadius;
                //lblAns.setText(sName);
                lblAns.setText("Circumference is " + dCircumference);
                revalidate(); // this refreshes the panel
            }
            if (event.getSource() == btnArea) {
                // String sName = txtName.getText();
                int nRadius = Integer.parseInt(txtRadius.getText());
                double dArea = Math.PI * nRadius * nRadius;
                //lblAns.setText(sName);
                lblAns.setText("Area is " + dArea);
            }
        }
    }
}
