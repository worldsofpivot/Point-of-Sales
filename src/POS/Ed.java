package POS;


//import static Ed.frame;
//import static PanDifference.txtNum2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ed {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    public static JFrame frame = new JFrame();

    public static void main(String[] args) {
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanDifference panDifference = new PanDifference();
        frame.add(panDifference);
        frame.setVisible(true);
    }
}

class PanDifference extends JPanel {
    public static JTextField txtNum1 = new JTextField(5);
    public static JTextField txtNum2 = new JTextField(5);
    public static JButton btnCalc = new JButton("Calculate Difference");
    public static JLabel lblUnder = new JLabel();
    public static JLabel lblAns = new JLabel();

    public PanDifference() {
        add(txtNum1);
        add(txtNum2);
        add(btnCalc);
        add(lblAns);
        PanDifference.ClickTestListener clickTestListener = new PanDifference.ClickTestListener(); // both lines work
        btnCalc.addActionListener(clickTestListener);
    }

    class ClickTestListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
                int nNum1 = Integer.parseInt(txtNum1.getText());
                int nNum2 = Integer.parseInt(txtNum2.getText());
                if (nNum1>nNum2) {
                double dDifference = nNum1-nNum2;
                lblAns.setText("Positive Difference is " + dDifference);
                }
                if (nNum1<nNum2) {
                double dDifference = nNum2-nNum1;
                lblAns.setText("Positive Difference is " + dDifference);
                }
                revalidate(); // this refreshes the panel
            
            
        }
    }
}
