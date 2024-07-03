// package aau;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc extends JFrame implements ActionListener {
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

    public Calc() {
        String[] op = { "Add", "Subtract", "Divide", "Multiply" };
        layout = new GridBagLayout();
        setLayout(layout); // set frame layout
        constraints = new GridBagConstraints();
        lbln1 = new JLabel("Number 1:");
        lbln2 = new JLabel("Number 2:");
        lblresult = new JLabel("Result:");
        n1 = new JTextField("", 15);
        n2 = new JTextField("", 15);
        r = new JTextField("", 15);
        r.setEditable(false);
        result = new JButton("Calculate");
        result.addActionListener(this);
        clear = new JButton("Clear");
        clear.addActionListener(this);

        mb = new JMenuBar();
        menu = new JMenu("File");
        m1 = new JMenuItem("With Button");
        m2 = new JMenuItem("Without Button");
        setJMenuBar(mb);
        mb.add(menu);
        menu.add(m1);
        menu.add(m2);
        m1.addActionListener(this);
        m2.addActionListener(this);

        cb = new JComboBox<>(op);
        cb.addActionListener(this);

        constraints.weighty = 1; // can grow taller
        addComponent(lbln1, 0, 0, 1, 1);
        addComponent(n1, 0, 1, 1, 1);
        constraints.weighty = 1; // can grow taller
        addComponent(lbln2, 1, 0, 1, 1);
        addComponent(n2, 1, 1, 1, 1);

        constraints.weighty = 1; // can grow taller
        addComponent(lblresult, 2, 0, 1, 1);
        addComponent(r, 2, 1, 1, 1);

        constraints.weighty = 1; // can grow taller
        addComponent(cb, 3, 0, 1, 1);
        addComponent(result, 3, 1, 1, 1);
        addComponent(clear, 3, 2, 1, 1);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator");
        setSize(300, 300);
        setBackground(Color.GRAY);
        setLocationRelativeTo(null); // center the frame
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
        if (ae.getSource() == result) {
            double num1 = Double.parseDouble(n1.getText());
            double num2 = Double.parseDouble(n2.getText());
            String selectedOperation = (String)cb.getSelectedItem();

            double result;
            switch (selectedOperation) {
                case "Add":
                    result = num1 + num2;
                    break;
                case "Subtract":
                    result = num1 - num2;
                    break;
                case "Divide":
                    result = num1 / num2;
                    break;
                case "Multiply":
                    result = num1 * num2;
                    break;
                default:
                    result = 0;
            }

            r.setText(Double.toString(result));
        } else if (ae.getSource() == clear) {
            n1.setText("");
            n2.setText("");
            r.setText("");
        } else if (ae.getSource() == m1) {
            result.setVisible(true);
        } else if (ae.getSource() == m2) {
            result.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Calc trial = new Calc();
        trial.setVisible(true);
    }
}
