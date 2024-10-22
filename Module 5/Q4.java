import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

public class userpwd {
    private JFrame frame;
    private JTextField userInput;
    private JPasswordField pwdInput;
    private JButton loginButton;
    private String userName = "Rishi";
    private String pwd = "1234";

    public userpwd() {
        frame = new JFrame("User Login");
        userInput = new JTextField(10);
        pwdInput = new JPasswordField(10);
        loginButton = new JButton("Login");

        frame.setDefaultCloseOperation(3);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 2, 5, 5));
        mainPanel.add(new JLabel("User"));
        mainPanel.add(userInput);
        mainPanel.add(new JLabel("Password"));
        mainPanel.add(pwdInput);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(loginButton);
        frame.setVisible(true);

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userinputName = userInput.getText();
                String password = new String(pwdInput.getPassword());
                if (!userinputName.equals(userName) || !password.equals(pwd)) {
                    showMessageDialog(null, "wrong Userame/Password");
                } else {
                    showMessageDialog(null, "Login Successful");
                }
            }
        });
    }

    public static void main(String[] args) {
        userpwd obj = new userpwd();
    }
}
