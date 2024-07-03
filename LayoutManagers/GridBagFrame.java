
package layout;

import java.awt.*;
import javax.swing.*;

public class GridBagFrame extends JFrame
{
private final GridBagLayout layout; // layout
private final GridBagConstraints constraints;

 // set up GUI
 public GridBagFrame()
 {
 super("GridBagLayout");
 layout = new GridBagLayout();
 setLayout(layout); // set frame layout
constraints = new GridBagConstraints(); 
 // create GUI components
 JTextArea textArea1 = new JTextArea("TextArea1", 5, 10);
 JTextArea textArea2 = new JTextArea("TextArea2", 2, 2);

String[] names = { "Iron", "Steel", "Brass" };
 JComboBox<String> comboBox = new JComboBox<String>(names);

 JTextField textField = new JTextField("TextField");
 JButton button1 = new JButton("Button 1");
 JButton button2 = new JButton("Button 2");
 JButton button3 = new JButton("Button 3");

 // weightx and weighty for textArea1 are both 0: the default
 // anchor for all components is CENTER: the default
 constraints.fill = GridBagConstraints. BOTH;
 
 
 
addComponent(textArea1, 0, 0, 1, 3);
constraints.fill = GridBagConstraints.HORIZONTAL;
addComponent(button1, 0, 1, 2, 1);
addComponent(comboBox, 2, 1, 2, 1);
constraints.weightx = 1000; // can grow wider
constraints.weighty = 1; // can grow taller
constraints.fill = GridBagConstraints.BOTH;
addComponent(button2, 1, 1, 1, 1);
constraints.weightx = 0;
constraints.weighty = 0;
addComponent(button3, 1, 2, 1, 1);
addComponent(textField, 3, 0, 2, 1);
addComponent(textArea2, 3, 2, 1, 1);
 }
 private void addComponent(Component component,
 int row, int column, int width, int height){
     constraints.gridx = column;
constraints.gridy = row;
constraints.gridwidth = width;
constraints.gridheight = height;
layout.setConstraints(component, constraints); // set constraints
add(component); // add component
 }
 public static void main(String[] args)
{
 GridBagFrame gridBagFrame = new GridBagFrame();
 gridBagFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
gridBagFrame.setSize(300, 150);
 gridBagFrame.setVisible(true);
}}