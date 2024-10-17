import javax.swing.*;
import java.awt.*;

public class Q5 {
    public static void main(String[] args) {
        // Frame setup
        JFrame frame = new JFrame("Brown Color Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Table Data
        String[][] data = {
            {"1", "Alice", "85"},
            {"2", "Bob", "90"},
            {"3", "Charlie", "88"}
        };

        // Column Names
        String[] columnNames = {"ID", "Name", "Marks"};

        // Create table
        JTable table = new JTable(data, columnNames);
        table.setGridColor(Color.BLACK);
        table.setBackground(new Color(165, 69, 69));
        table.setForeground(Color.WHITE);
        // Add table to scroll pane
        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);

        // Frame sizing
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
