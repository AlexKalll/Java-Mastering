import javax.swing.*;

class GridDemo extends JFrame{
    JPanel p; 
    JButton[] btn = new JButton[9];
    String[] caption = {"0", "", "x", "", "x", "", "x", "", "0" };
    public GridDemo(){
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        for(int i = 0; i < 9; i ++){
            btn[i] = caption[i];
        }
        p = new JPanel(new GridLayot(3, 3));
        for(int i = 0; i < 9; i ++){
            p.add(btn[i]);
        }
        c.add(p);
        setSize(500, 500);
        setVisible(true);

    }
}

public class GridLayot {
    public static void main(String[] args) {
     GridDemo g = new GridDemo();
    }
}

// what is the error of the code above . My target was to create a board which has 9 buttons 
// Homework : which is creating a full grid container not just a panel just like that of the above . so I don't need to  use a panel....