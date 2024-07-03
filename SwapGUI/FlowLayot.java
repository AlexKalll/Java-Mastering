import javax.swing.*;
import java.awt.*;

class panell extends JFrame {
    private JPanel p1, p2, p0;
    private JTextField t1;
    private JButton btn;
    private JComboBox cb;
    private JLabel l0, l1, l2;

    public panell() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        l0 = new JLabel("Registration Form");
        l1 = new JLabel("Full Name:");
        l2 = new JLabel("Martial Status:");
        t1 = new JTextField(20);
        btn = new JButton("Submit");
        p0 = new JPanel();
        p1 = new JPanel(new FlowLayout());
        p2 = new JPanel(new BorderLayout());
        cb = new JComboBox(new String[] {"Single", "Married", "Divorced"});

        p0.add(l0);
        p1.add(l1);
        p1.add(t1);
        p1.add(btn);
        p2.add(l2, BorderLayout.WEST);
        p2.add(cb, BorderLayout.CENTER);
        c.add(p0);
        c.add(p1);
        c.add(p2);

        setSize(300, 300);
        setVisible(true);
    }
}  


public class FlowLayot{
    public static void main(String[] args) {
        panell p = new panell();
    }
}

// This is the one what out teacher works on may 23. for flowlayout and borderlayout 
// some notes for the border layout: if we put the north and the center border only, the cnter will take all the place of itself, west and east also but the are available ... and if we put only north and the south only the middle part will be emply so long as we add sth either in cneter, west or east.