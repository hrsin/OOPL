import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class paint extends JFrame {
    // Enum for tools
    enum Tool {
        LINE, RECTANGLE, CIRCLE
    }

    private Tool selectedTool = Tool.LINE;

    private Point startPoint, endPoint; // To store start and end points for drawing

    public paint() {
        setTitle("Simple Paint Program");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create buttons for tool selection
        JPanel toolPanel = new JPanel();
        JButton lineButton = new JButton("Line");
        JButton rectangleButton = new JButton("Rectangle");
        JButton circleButton = new JButton("Circle");
        toolPanel.add(lineButton);
        toolPanel.add(rectangleButton);
        toolPanel.add(circleButton);
        add(toolPanel, BorderLayout.NORTH);

        // Set up drawing canvas
        JPanel canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (startPoint != null && endPoint != null) {
                    switch (selectedTool) {
                        case LINE:
                            g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
                            break;
                        case RECTANGLE:
                            int x = Math.min(startPoint.x, endPoint.x);
                            int y = Math.min(startPoint.y, endPoint.y);
                            int width = Math.abs(startPoint.x - endPoint.x);
                            int height = Math.abs(startPoint.y - endPoint.y);
                            g.drawRect(x, y, width, height);
                            break;
                        case CIRCLE:
                            int radius = (int) startPoint.distance(endPoint);
                            g.drawOval(startPoint.x - radius, startPoint.y - radius, 2 * radius, 2 * radius);
                            break;
                    }
                }
            }
        };
        canvas.setBackground(Color.WHITE);
        add(canvas, BorderLayout.CENTER);

        // Mouse listener for drawing shapes
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                endPoint = e.getPoint();
                canvas.repaint(); // Trigger the paintComponent to draw the shape
            }
        });

        // Action listeners for tool selection
        lineButton.addActionListener(e -> selectedTool = Tool.LINE);
        rectangleButton.addActionListener(e -> selectedTool = Tool.RECTANGLE);
        circleButton.addActionListener(e -> selectedTool = Tool.CIRCLE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            paint app = new paint();
            app.setVisible(true);
        });
    }
}
//gpt
