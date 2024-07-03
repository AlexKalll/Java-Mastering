
package layout;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class BorderLayoutFrame extends JFrame implements ActionListener{
    JButton a=new JButton ("Hide North");
    JButton b=new JButton ("Hide South");
     JButton c=new JButton ("Hide West");
    JButton d=new JButton ("Hide East");
    JButton e=new JButton ("Center");
    BorderLayout layout;
    public BorderLayoutFrame(){
        super( "BorderLayout Demo" ); 
        layout = new BorderLayout();
        setLayout(layout);
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        add(a,BorderLayout.NORTH);
        add(b,BorderLayout.SOUTH);
        add(c,BorderLayout.EAST);
        add(d,BorderLayout.WEST);
        add(e,BorderLayout.CENTER);
    }
public void actionPerformed(ActionEvent m) {
       if(m.getSource()==a)
           a.setVisible(false);
      if(m.getSource()==b)
           b.setVisible(false);
        if(m.getSource()==c)
           c.setVisible(false);
        if(m.getSource()==d)
           d.setVisible(false);
       if(m.getSource()==e){
              e.setVisible(false);
         }
if(a.isVisible()==false&&b.isVisible()==false&&c.isVisible()==false&&d.isVisible()==false&&e.isVisible()==false)
      {
          a.setVisible(true);
          b.setVisible(true);
          c.setVisible(true);
          d.setVisible(true);
          e.setVisible(true);
  }
       layout.layoutContainer( getContentPane() ); 
    }
public static void main( String args[] )
 {
 BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
 borderLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 borderLayoutFrame.setSize( 300, 200 ); // set frame size
 borderLayoutFrame.setVisible( true ); // display frame
} 
    
}
