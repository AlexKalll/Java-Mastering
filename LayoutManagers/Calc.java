//package aau;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc extends JFrame implements ActionListener, ItemListener {
    JTextField n1, n2, r;
    JButton result, clear;
    JMenuBar mb;
    JMenu menu;
    JMenuItem m1, m2;
    JLabel lbln1, lbln2, lblresult;
    JPanel p1, p2, p3;
    JComboBox<String> cb;
    private final GridBagLayout layout; // layout
    private final GridBagConstraints constraints;
    private boolean withButton; // with or without button menu selection helper variable

    public Calc() {
        String[] op = { "add", "sub", "div", "mul" };
        withButton = true;
        layout = new GridBagLayout();
        setLayout(layout); // set frame layout
        constraints = new GridBagConstraints();
        lbln1 = new JLabel("Num1:");
        lbln2 = new JLabel("Num2:");
        lblresult = new JLabel("Result");
        n1 = new JTextField("", 15);
        n2 = new JTextField("", 15);
        r = new JTextField("", 15);
        r.setEditable(false);
        result = new JButton("Result");
        result.addActionListener(this);
        clear = new JButton("Clear");
        clear.addActionListener(this);

        mb = new JMenuBar();
        menu = new JMenu("Calculate");
        m1 = new JMenuItem("With Button");
        m2 = new JMenuItem("Without Button");
        m1.addActionListener(this);
        m2.addActionListener(this);
        setJMenuBar(mb);
        mb.add(menu);
        menu.add(m1);
        menu.add(m2);

        cb = new JComboBox<String>(op);
        cb.addItemListener(this);

        constraints.weighty = 1; // can grow taller
        addComponent(lbln1, 0, 1, 1, 1);
        addComponent(n1, 0, 2, 1, 1);
        constraints.weighty = 1; 
        addComponent(lbln2, 1, 1, 1, 1);
        addComponent(n2, 1, 2, 1, 1);

        constraints.weighty = 1; 
        addComponent(lblresult, 2, 1, 1, 1);
        addComponent(r, 2, 2, 1, 1);

        constraints.weighty = 1; 
        addComponent(cb, 3, 1, 1, 1);
        addComponent(result, 3, 2, 1, 1);
        addComponent(clear, 3, 3, 1, 1);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Simple Calculator");     
        setSize(300, 300);
        setBackground(Color.PINK);
    }

    private void addComponent(Component component, int row, int column, int width, int height) {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); // set constraints
        add(component); // add component
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == m1) {
            withButton = true;
            result.setVisible(true);
        } else if (ae.getSource() == m2) {
            withButton = false;
            result.setVisible(false);
        } else if (withButton == true && ae.getSource() == result) {
            performCalculation();
        } else if (ae.getSource() == clear) {
            n1.setText("");
            n2.setText("");
            r.setText("");
        }
    }

    private void performCalculation() {
        String selectedOperation = (String) cb.getSelectedItem();
        double num1 = Double.parseDouble(n1.getText());
        double num2 = Double.parseDouble(n2.getText());
        double result = 0;

        switch (selectedOperation) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "mul":
                result = num1 * num2;
                break;
            case "div":
                result = num1 / num2;
                break;          
        }
        if(result == 0){
            r.setText("");
        }
        
        r.setText(Double.toString(result));
    }

    public void itemStateChanged(ItemEvent e) {
        if (withButton == false) {
            performCalculation();
        }
    }

    public static void main(String[] args) {
        Calc trial = new Calc();
        trial.setVisible(true);
    }
}
