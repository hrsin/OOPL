import javax.swing.*;
import java.awt.*;

public class UserForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Information Form");
        
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(10);
        
        JLabel stateLabel = new JLabel("State:");
        Choice stateChoice = new Choice();
        stateChoice.add("State 1");
        stateChoice.add("State 2");
        stateChoice.add("State 3");
        
        JLabel districtLabel = new JLabel("District:");
        Choice districtChoice = new Choice();
        districtChoice.add("District 1");
        districtChoice.add("District 2");
        districtChoice.add("District 3");
        
        JLabel pincodeLabel = new JLabel("Pincode:");
        JTextField pincodeField = new JTextField(10);
        
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JButton submitButton = new JButton("Submit");
        
        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(stateLabel);
        panel.add(stateChoice);
        panel.add(districtLabel);
        panel.add(districtChoice);
        panel.add(pincodeLabel);
        panel.add(pincodeField);
        panel.add(genderLabel);
        panel.add(male);
        panel.add(female);
        panel.add(submitButton);
        
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
