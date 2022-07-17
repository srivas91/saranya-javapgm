

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class FrameApp2 implements MouseListener
{
    JFrame frame;
    JPanel panel;
    JButton btnSubmit,btnCancel;
   JLabel lblCusname;
   JTextField tfCusname;
    public FrameApp2() {
        System.out.println("constructor");
        frame=new JFrame();
         panel=new JPanel();
         panel.setLayout(null);
         lblCusname=new JLabel("Customer Name");
         lblCusname.setBounds(50, 50, 100, 30);
         tfCusname=new JTextField(20);
         tfCusname.setBounds(150, 60, 100, 20);
        
         panel.addMouseListener(this);
         
         panel.add(lblCusname);
        panel.add(tfCusname);
        frame.add(panel);
        frame.setTitle("customer frame");
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
          System.out.println("mouse position:"+e.getLocationOnScreen());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
   
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

   
}
    
public class MouseApp {

    public static void main(String[] args) {
        FrameApp2 obj=new FrameApp2();
    }
    
}
