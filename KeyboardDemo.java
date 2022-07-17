
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class FrameApp extends KeyAdapter
{
    JFrame frame;
    JPanel panel;
    JButton btnSubmit,btnCancel;
   JLabel lblCusname;
   JTextField tfCusname;
    public FrameApp() {
        System.out.println("constructor");
        frame=new JFrame();
         panel=new JPanel();
         panel.setLayout(null);
         lblCusname=new JLabel("Customer Name");
         lblCusname.setBounds(50, 50, 100, 30);
         tfCusname=new JTextField(20);
         tfCusname.setBounds(150, 60, 100, 20);
         tfCusname.addKeyListener(this);
         
         panel.add(lblCusname);
        panel.add(tfCusname);
        frame.add(panel);
        frame.setTitle("customer frame");
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        tfCusname.setText(tfCusname.getText().toUpperCase());
//        tfCusname.setText(tfCusname.getText().substring(0,1).toUpperCase()+tfCusname.getText().substring(1).toLowerCase());
    }

//    @Override
//    public void keyPressed(KeyEvent e) {
//        System.out.println("key pressed");
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//        System.out.println("key released");
//    }
    
}
    
public class KeyboardDemo {

    public static void main(String[] args) {
        FrameApp obj=new FrameApp();
    }
    
}
