package POS;

 import java.awt.event.ActionEvent;
       import java.awt.event.ActionListener;
       import javax.swing.JButton;
       import javax.swing.JFrame;
       import javax.swing.JLabel;
       import javax.swing.JPanel;
     import javax.swing.JTextField;
public class Eb {
 private static final int FRAME_WIDTH = 400;
       private static final int FRAME_HEIGHT = 400;
       public static JFrame frame = new JFrame();
 public static void main(String[] args) {
       //frame.setLayout(new FlowLayout());
       frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       PanGb panGb = new PanGb();
       frame.add(panGb);
       frame.setVisible(true);
       }
       }
class PanGb extends JPanel {
 public static JTextField txtName = new JTextField(20);
       public static JTextField txtAge = new JTextField(3);
       public static JButton btnCont = new JButton("Continue");
       public static JLabel lblUnder = new JLabel();
       public static JLabel lblAns = new JLabel();
 public PanGb() {
       add(txtName);
       add(txtAge);
       add(btnCont);
       add(lblAns);
       ClickTestListener clickTestListener = new ClickTestListener(); // both lines work
       //PanGb.ClickTestListener clickTestListener = new PanGb.ClickTestListener();
       btnCont.addActionListener(clickTestListener);
 }
 class ClickTestListener implements ActionListener {
 public void actionPerformed(ActionEvent event) {
       String sName = txtName.getText();
       int nAge = Integer.parseInt(txtAge.getText());
       lblAns.setText(sName);
 if (nAge >= 18) {
       lblAns.setText("Step right up " + sName);
       } else if (nAge < 18) {
       lblAns.setText("Go home " + sName);
       } 
       revalidate(); // this refreshes the panel
       }
       }
       }