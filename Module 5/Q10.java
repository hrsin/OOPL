import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SimpleTileGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Tile Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3));
        
        // Create random winning position
        Random rand = new Random();
        int winningNumber = rand.nextInt(9);
        
        // Create 9 buttons
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton("0");
            final int buttonIndex = i;
            
            button.addActionListener(e -> {
                if (buttonIndex == winningNumber) {
                    button.setText("1");
                    button.setBackground(Color.GREEN);
                } else {
                    button.setBackground(Color.RED);
                }
            });
            
            frame.add(button);
        }
        
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
