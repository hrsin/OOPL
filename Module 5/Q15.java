import java.awt.*;
import javax.swing.*;

public class Q15 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
   
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));

        JLabel label = new JLabel("Enter Amount in INR: ");
        JTextField textField = new JTextField(10); 
        JLabel label2 = new JLabel("Convert to: ");
        Choice choice = new Choice();
        choice.add("USD");
        choice.add("EUR");
        choice.add("GBP");
        JButton button = new JButton("Convert");
        JButton resultButton = new JButton("Value");

        panel.add(label);
        panel.add(textField);
        panel.add(label2);
        panel.add(choice);
        panel.add(button);
        panel.add(resultButton);

        frame.add(panel);
        frame.setSize(300, 200); // Reduced frame size
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener((ActionEvent) -> {
            double amount = Double.parseDouble(textField.getText());
            switch(choice.getSelectedItem()) {
                case "USD" -> {amount *= 84; resultButton.setText(amount + " USD");}
                case "EUR" -> {amount *= 92; resultButton.setText(amount + " EUR");}
                case "GBP" -> {amount *= 90; resultButton.setText(amount + " GBP");}
            }
        });
    }
}
