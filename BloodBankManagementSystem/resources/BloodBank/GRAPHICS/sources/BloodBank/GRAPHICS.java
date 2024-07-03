package BloodBank;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;
import javax.swing.JPanel;
/* loaded from: GRAPHICS.class */
public class GRAPHICS extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(new Color(250, 250, 250));
        g.setColor(new Color(35, 67, 156));
        g.setColor(new Color(200, 30, 220));
        int[] xValues = {400, 400, 450, 450, 510, 510};
        int[] yValues = {400, 258, 285, 380, 425, 480};
        g.drawPolygon(xValues, yValues, 6);
        g.fillPolygon(xValues, yValues, 6);
        g.setColor(Color.red);
        int[] xValue = {450, 520, 585, 510};
        int[] yValue = {380, 370, 405, 425};
        g.drawPolygon(xValue, yValue, 4);
        g.fillPolygon(xValue, yValue, 4);
        g.setColor(new Color(200, 30, 20));
        int[] xValues2 = {510, 585, 585};
        int[] yValues2 = {480, 455, 405};
        g.drawPolyline(xValues2, yValues2, 3);
        g.setColor(new Color(230, 30, 20));
        int[] xValues3 = {450, 520, 520};
        int[] yValues3 = {285, 275, 370};
        g.drawPolyline(xValues3, yValues3, 3);
        g.setColor(new Color(150, 180, 210));
        int[] xValues4 = {400, 470, 520, 450};
        int[] yValues4 = {258, 248, 275, 285};
        g.drawPolygon(xValues4, yValues4, 4);
        g.fillPolygon(xValues4, yValues4, 4);
        g.setColor(new Color(150, 220, 60));
        int[] xValues5 = {400, 410, 423, 430};
        int[] yValues5 = {400, 550, 550, 423};
        g.drawPolygon(xValues5, yValues5, 4);
        g.fillPolygon(xValues5, yValues5, 4);
        g.setColor(new Color(167, 230, 217));
        int[] xValues6 = {585, 579, 567, 559};
        int[] yValues6 = {455, 550, 550, 465};
        g.drawPolygon(xValues6, yValues6, 3);
        g.fillPolygon(xValues6, yValues6, 4);
        g.setColor(new Color(240, 130, 210));
        int[] xValues7 = {494, 502, 514, 526, 510};
        int[] yValues7 = {470, 550, 550, 475, 480};
        g.drawPolygon(xValues7, yValues7, 5);
        g.fillPolygon(xValues7, yValues7, 5);
        g.setColor(new Color(240, 130, 210));
        int[] xValues8 = {390, 600, 600, 390};
        int[] yValues8 = {550, 550, 565, 565};
        g.drawPolygon(xValues8, yValues8, 4);
        g.fillPolygon(xValues8, yValues8, 4);
        g.setColor(new Color(240, 70, 90));
        g.setFont(new Font("Serif", 3, 125));
        g.drawString("Java", 375, 295);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(new GradientPaint(5.0f, 30.0f, Color.blue, 35.0f, 100.0f, Color.YELLOW, true));
        g2d.fill(new Ellipse2D.Double(465.0d, 303.0d, 115.0d, 105.0d));
        SecureRandom random = new SecureRandom();
        int[] xPoints = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int[] yPoints = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
        GeneralPath star = new GeneralPath();
        star.moveTo(xPoints[0], yPoints[0]);
        for (int count = 1; count < xPoints.length; count++) {
            star.lineTo(xPoints[count], yPoints[count]);
        }
        star.closePath();
        g2d.translate(400, 100);
        for (int count2 = 1; count2 <= 60; count2++) {
            g2d.rotate(3.0d, 88.0d, 270.0d);
            g2d.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            g2d.fill(star);
        }
    }
}
