import java.awt.*;
import javax.swing.*;

public class CounterGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter");
        frame.setLayout(new GridLayout(2, 1));
        JButton countButton = new JButton("Count");
        JLabel countLabel = new JLabel("0");
        
        countLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(countLabel);
        frame.add(countButton);
        
        
        final int[] count = {0};
        countButton.addActionListener(e -> {
            count[0]++;
            countLabel.setText(String.valueOf(count[0]));
        });
        
        frame.setSize(200, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
