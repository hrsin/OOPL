import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingadder {
    private JFrame frame;
    private JTextField first, second, result;
    private JButton add, clear;

    public swingadder() {
        frame = new JFrame("Swing Adder");
        frame.setDefaultCloseOperation(3);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        first = new JTextField();
        second = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        add = new JButton("ADD");
        clear = new JButton("CLEAR");

        JPanel mainPanel = new JPanel(new GridLayout(3, 2));
        mainPanel.add(new JLabel("First Number"));
        mainPanel.add(first);
        mainPanel.add(new JLabel("Second Number"));
        mainPanel.add(second);
        mainPanel.add(new JLabel("Result"));
        mainPanel.add(result);

        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel1.add(add);
        frame.setVisible(true);

        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel2.add(clear);
        frame.setVisible(true);

        frame.add(mainPanel, BorderLayout.NORTH);
        frame.add(buttonPanel1, BorderLayout.WEST);
        frame.add(buttonPanel2, BorderLayout.EAST);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(first.getText());
                    int num2 = Integer.parseInt(second.getText());
                    int sum = num1 + num2;
                    result.setText(Integer.toString(sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Enter Valud number", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first.setText("");
                second.setText("");
                result.setText("");
            }
        });

    }

    public static void main(String[] args) {
        new swingadder();
    }
}
