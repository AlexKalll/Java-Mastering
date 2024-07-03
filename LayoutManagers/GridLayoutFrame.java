
package layout;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
        
public class GridLayoutFrame extends JFrame implements ActionListener{
    JButton a=new JButton ("One");
    JButton b=new JButton ("Two");
    JButton c=new JButton ("Three");
    JButton d=new JButton ("Four");
    JButton e=new JButton ("Five");
    JButton f=new JButton ("Six");
    boolean toggle=false ;
    Container container;
    GridLayout gridlayout1,gridlayout2;
public GridLayoutFrame(){
        super("GridLayout Demo");
        gridlayout1=new GridLayout(2,3,5,5);
        gridlayout2=new GridLayout(3,2);
        container=getContentPane();
        setLayout(gridlayout1);
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        f.addActionListener(this);
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
    }
@Override
    public void actionPerformed(ActionEvent e) {
        if(toggle)
            container.setLayout(gridlayout1);
        else
            container.setLayout(gridlayout2);
        toggle=!toggle;
        container.validate();//validate recomputes the container’s layout based on the current layout manager for the Container and the current set of displayed GUI components.
    }
    public static void main( String args[] )
 {
 GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();
 gridLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 gridLayoutFrame.setSize( 300, 200 ); // set frame size
 gridLayoutFrame.setVisible( true ); // display frame 
 } 

}
