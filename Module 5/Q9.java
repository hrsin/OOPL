import java.awt.*;
import javax.swing.*;

public class SimpleLogoCreator extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set background color
        g.setColor(Color.BLACK);

        // Draw a filled circle
        g.fillOval(100, 100, 200, 200);

        // Draw white lines across the circle
        g.setColor(Color.WHITE);
        g.drawLine(100, 200, 300, 200); // Horizontal line
        g.drawLine(200, 100, 200, 300); // Vertical line
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Logo");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SimpleLogoCreator());
        frame.setVisible(true);
    }
}
