import java.awt.*;
import javax.swing.*;

public class kal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Spiral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new SpiralPanel());
        frame.setVisible(true);
    }
}

class SpiralPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        int length = 0;

        for (int i = 0; i < 100; i++) {
            g2d.drawLine(x, y, x + length, y);
            x += length;
            g2d.drawLine(x, y, x, y + length);
            y += length;
            length += 5; // Adjust the increment as needed
            g2d.drawLine(x, y, x - length, y);
            x -= length;
            g2d.drawLine(x, y, x, y - length);
            y -= length;
            length += 5; // Adjust the increment as needed
        }
    }
}
