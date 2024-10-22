import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class factorial {
    private JFrame frame;
    private JTextField n, factorial;
    private JButton next;

    factorial() {
        frame = new JFrame("Factorial");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(3);
        frame.setSize(400, 200);

        n = new JTextField();
        n.setPreferredSize(new Dimension(100, 30));
        factorial = new JTextField();
        factorial.setEditable(false);
        factorial.setPreferredSize(new Dimension(100, 30));
        next = new JButton("Next");

        JPanel mainPanel = new JPanel(new FlowLayout());
        mainPanel.add(new JLabel("n"));
        mainPanel.add(n);
        mainPanel.add(new JLabel("factorial(n)"));
        mainPanel.add(factorial);
        mainPanel.add(next);

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setVisible(true);

        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(n.getText());
                    factorial.setText(Integer.toString(calculate(num)));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Enter Valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }

    int calculate(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n < 0) {
            return Integer.parseInt("Invalid");
        } else {
            return n * calculate(n - 1);
        }
    }

    public static void main(String[] args) {
        new factorial();
    }
}
