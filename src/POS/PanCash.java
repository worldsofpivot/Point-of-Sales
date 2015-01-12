package POS;


//import static Ed.frame;
//import static PanCash.txtNum2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*public class Cash {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    public static JFrame frame = new JFrame();

    public static void main(String[] args) {

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanCash panDifference = new PanCash();
        frame.add(panDifference);
        frame.setVisible(true);
    }
}*/

class PanCash extends JPanel {

    private boolean bRefund = false;
    double dSum = 0;
    int nCbk = 0;
    public static JTextField txtNum1 = new JTextField(5);
    public static JTextField txtNum2 = new JTextField(5);
    public static JButton btnCbk = new JButton("Chicken Breast");
    public static JButton btnEp = new JButton("Eggplant");
    public static JButton btnRefund = new JButton("Refund");
    public static JLabel lblUnder = new JLabel();
    public static JLabel lblSubtotal = new JLabel();

    public PanCash() {
        add(txtNum1);
        add(txtNum2);
        add(btnCbk);
        add(btnEp);
        add(btnRefund);
        add(lblSubtotal);
        PanCash.ClickTestListener clickTestListener = new PanCash.ClickTestListener(); // both lines work
        btnCbk.addActionListener(clickTestListener);
        btnRefund.addActionListener(clickTestListener);
    }

    class ClickTestListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == btnCbk) {

                if (bRefund==true) {
                    dSum -= (10.99 * 1.13);
                   nCbk-=1;
                    lblSubtotal.setText("Subtotal is " + dSum);
                    bRefund = false;
                    System.out.println("refund");
                } else {
                    nCbk+=1;
                    dSum += 10.99 * 1.13;
                    lblSubtotal.setText("Subtotal is " + dSum);
                    System.out.println("no refund");
                    revalidate(); // this refreshes the panel
                    
                    
                }
            }
            if (event.getSource() == btnRefund) {
              /*  if (event.getSource() == btnCbk) {
                    dSum -= (9.99 * 1.13) * 2;
                    lblSubtotal.setText("Subtotal is " + dSum);
                    revalidate(); // this refreshes the panel
                } else {
                    lblSubtotal.setText("Subtotal is " + dSum);
                }*/
                System.out.print("refund button clicked ");
                bRefund = true;
            }

            /*
             if (event.getSource() == btnCircumference) {

             //String sName = txtName.getText();
             int nRadius = Integer.parseInt(txtRadius.getText());
             double dCircumference = Math.PI * 2 * nRadius;
             //lblAns.setText(sName);
             lblAns.setText("Circumference is " + dCircumference);
             revalidate(); // this refreshes the panel
             }
             */

        }
    }
}
