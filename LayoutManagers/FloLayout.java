
package gui;
import javax.swing.*;
import java.awt.*;
        
public class FloLayout extends JFrame {
  /*  JLabel lblname,lblstatus;
    JTextField txtname;
    JButton btnok,btnwest;
    JComboBox cb;*/
   JPanel p1;//,p2;         
   
    
    JButton btnt[]=new JButton[9];
    String caption[]={"O","","X","X","O","","X","","O"};
            
    public FloLayout(){
   Container c=getContentPane();
   c.setLayout(new GridLayout(3,3)) ;
   setDefaultCloseOperation (EXIT_ON_CLOSE);
   Font font=new Font("Arial",Font.BOLD, 48);
   for(int i=0;i<9;i++)
   {
      
       btnt[i]=new JButton(caption [i]);
        btnt[i].setFont(font );
       
   }
   //p1=new JPanel(new GridLayout(3,3));
     for(int i=0;i<9;i++)
   {
       add(btnt[i]);
   }
  // c.add(p1);
   /*lblname=new JLabel("Full Name");
  txtname=new JTextField("",15);
  btnok=new JButton ("Ok");
  btnwest=new JButton ("West");
  cb=new JComboBox();
  lblstatus=new JLabel("Marrital Status");
  cb.addItem("Single");
  cb.addItem("Married");
  p1=new JPanel(new FlowLayout());
  p1.setBackground(Color.red);
  p2=new JPanel(new FlowLayout());
    p2.setBackground(Color.blue);
  p1.add(lblname);
  p1.add(txtname);
  p1.add(btnok);
  p2.add(lblstatus);
  p2.add(cb);
  c.add(p1,BorderLayout.NORTH);
  c.add(p2,BorderLayout.CENTER);
  //c.add(btnwest,BorderLayout.WEST);*/
     setSize(500,500);
     setVisible(true);
     setTitle("Layout");
     }
    public static void main(String[] args){
        FloLayout frm=new FloLayout();
    }
}
