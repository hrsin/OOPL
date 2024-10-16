import java.awt.event.*;
import javax.swing.*;

public class Q1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kilometers to Miles Converter");
        JLabel label = new JLabel("Enter kilometers:");
        JTextField kilometerField = new JTextField(10);
        JButton convertButton = new JButton("Convert to Miles");
        JLabel resultLabel = new JLabel("Result:");

        convertButton.addActionListener((ActionEvent e) -> {
            try {
                double kilometers = Double.parseDouble(kilometerField.getText());
                double miles = kilometers * 0.621371;
                resultLabel.setText("Result: " + miles + " miles");
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid number.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(kilometerField);
        panel.add(convertButton);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
// some content here
