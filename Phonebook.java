import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class CustomerFrame implements ActionListener
{
    JFrame frame;
    JPanel panel;
    JButton btnSubmit,btnCancel;
   JLabel lblCusname,lblMobnum,lblCity,lblActdate;
   JTextField tfCusname,tfMobnum;
    JComboBox<String> cboCity;
    
    public CustomerFrame() {
         frame=new JFrame();
         panel=new JPanel();
         panel.setLayout(null);
         lblCusname=new JLabel("Customer Name");
         lblCusname.setBounds(50, 50, 100, 30);
         tfCusname=new JTextField(20);
         tfCusname.setBounds(150, 60, 100, 20);
         
         lblMobnum=new JLabel("Mobile Number");
         lblMobnum.setBounds(50, 100, 100, 30);
   
         tfMobnum=new JTextField(20);
         tfMobnum.setBounds(150, 100, 100, 20);
         
         lblCity=new JLabel("City");
         lblCity.setBounds(50, 150, 100, 30);
       
         cboCity=new JComboBox<>();
         cboCity.addItem("tiruvallur");
         cboCity.addItem("putlur");
         cboCity.addItem("tiruninravur");
         cboCity.setBounds(150, 150, 100, 20);
            
         btnSubmit=new JButton("submit");
         btnSubmit.setBounds(50, 200, 100, 20);
         btnSubmit.addActionListener(this);
         
         btnCancel=new JButton("cancel");
         btnCancel.setBounds(160, 200, 100, 20);
         btnCancel.addActionListener(this);
         
        panel.add(lblCusname);
        panel.add(tfCusname);
        
        panel.add(lblMobnum);
        panel.add(tfMobnum);
        
//        panel.add(lblCity);
//        panel.add(cboCity);
        panel.add(btnSubmit);
        panel.add(btnCancel);
         
        frame.add(panel);
        frame.setTitle("customer frame");
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource()==btnSubmit)
           {
               System.out.println("name is"+tfCusname.getText());
               System.out.println("mobile number is"+tfMobnum.getText());
           }
           else if(e.getSource()==btnCancel)
           {
               tfCusname.setText("");
               tfMobnum.setText("");
           }
    }
    
}
public class Phonebook {
    public static void main(String[] args) {
       
        CustomerFrame obj=new CustomerFrame();
        
    }
}
