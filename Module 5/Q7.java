import java.awt.*;
import javax.swing.*;
public class Q7 {

    public static void main(String s[]){
        JFrame frame = new JFrame("Date Of Birth");
        JLabel yearLabel = new JLabel("Year: "); 
        Choice yearChoice = new Choice();
        yearChoice.add("2006");
        yearChoice.add("2007");
        yearChoice.add("2008");
        JLabel monthLabel = new JLabel("Month: ");
        Choice monthChoice = new Choice();
        monthChoice.add("January"); 
        monthChoice.add("Feb"); 
        monthChoice.add("Mar"); 
        monthChoice.add("Apr"); 
        monthChoice.add("May"); 
        monthChoice.add("Jun"); 
        monthChoice.add("Jul"); 
        monthChoice.add("Aug"); 
        monthChoice.add("Sep"); 
        monthChoice.add("Oct"); 
        monthChoice.add("Nov"); 
        monthChoice.add("Dec"); 
        JLabel dateLabel = new JLabel("Date: "); 
        Choice dateChoice = new Choice();
        dateChoice.add("1");
        dateChoice.add("2");
        dateChoice.add("3");
        dateChoice.add("4");
        dateChoice.add("5");
        JButton submit = new JButton("Submit");
        JLabel dobEntered = new JLabel("You DOB is: ");
        JPanel panel = new JPanel(new GridLayout(5,2));
        panel.add(yearLabel);
        panel.add(yearChoice);
        panel.add(monthLabel);
        panel.add(monthChoice);
        panel.add(dateLabel);
        panel.add(dateChoice);
        panel.add(submit);
        panel.add(dobEntered);
        frame.add(panel);
        
        submit.addActionListener((ActionEvent)-> {
            String yearSelected = yearChoice.getSelectedItem();
            String monthSelected = monthChoice.getSelectedItem();
            String dateSelected = dateChoice.getSelectedItem();
            dobEntered.setText("You DOB is: " + dateSelected + " " + monthSelected + " " + yearSelected);
        });
        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
