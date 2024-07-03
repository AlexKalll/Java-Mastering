
package layout;

import java.awt.*;
import javax.swing.*;

 
public class Layout extends JFrame{

    String[] names = { "Single", "Married" };
 JComboBox<String> comboBox ;
 JComboBox comboBox1;
 JPasswordField ps;
 JLabel lblstatus;
 JPanel p,p1;
 Layout(){
     comboBox = new JComboBox<String>(names);
     p=new JPanel();
     p1=new JPanel();
     lblstatus=new JLabel("Marital Status");
     comboBox1=new JComboBox();
     ps=new JPasswordField("",15);
     
     comboBox1.addItem("single");
     comboBox1.addItem("married");
     Container c=getContentPane();
     c.setLayout(new FlowLayout(FlowLayout.LEFT));
     p.setLayout(new FlowLayout(FlowLayout.LEFT));
     p.setBackground(Color.red);
     p1.setLayout(new FlowLayout(FlowLayout.LEFT));
     p1.setBackground(Color.yellow);
     p.add(lblstatus);
     p.add(comboBox);
     p1.add(comboBox1);
     p1.add(ps);
     c.add(p);
     c.add(p1);
     setSize(400,400);
    setTitle("First Form");
    setDefaultCloseOperation (EXIT_ON_CLOSE);
 }
 
    public static void main(String[] args) {
     Layout frm=new Layout();
     frm.setVisible(true);

    }
    
}
