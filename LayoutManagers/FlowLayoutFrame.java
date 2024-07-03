
package layout;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutFrame extends JFrame implements ActionListener{
    JButton leftJButton,centerJButton,rightJButton;
    FlowLayout layout;
    Container container;
    public  FlowLayoutFrame(){
        super("FlowLayout Demo");
        layout =new FlowLayout();
        container=getContentPane();
        setLayout(layout);
        leftJButton=new JButton("Left");
        add(leftJButton);
        leftJButton.addActionListener(this);
        centerJButton=new JButton("center");
 
    add(centerJButton);
        centerJButton.addActionListener(this);
        rightJButton=new JButton("Right");
        add(rightJButton);
        rightJButton.addActionListener(this);
     }
  public void actionPerformed(ActionEvent e) {
     if(e.getSource()==leftJButton){
         layout.setAlignment(FlowLayout.LEFT);
         layout.layoutContainer(container);
     }
     if(e.getSource()==centerJButton){
         layout.setAlignment(FlowLayout.CENTER);
         layout.layoutContainer(container);
     }
if(e.getSource()==rightJButton){
         layout.setAlignment(FlowLayout.RIGHT);
         layout.layoutContainer(container);
     } }
    public static void main (String args[]){
        FlowLayoutFrame flowlayoutframe=new FlowLayoutFrame();
        flowlayoutframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flowlayoutframe.setSize(300,70);
        flowlayoutframe.setVisible(true);
    }}
