import javax.swing.*;
import java.awt.event.*;

public class PopupMenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Popup Menu Example");

        JPopupMenu popupMenu = new JPopupMenu();

        // Create menu items
        JMenuItem createItem = new JMenuItem("Create new file");
        JMenuItem openItem = new JMenuItem("Open new file");
        JMenuItem editItem = new JMenuItem("Edit new file");


        createItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Done: Create new file"));
        openItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Done: Open new file"));
        editItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Done: Edit new file"));

        // Add menu items to the pop-up menu
        popupMenu.add(createItem);
        popupMenu.add(openItem);
        popupMenu.add(editItem);

        // Add mouse listener to the frame to trigger the pop-up menu
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        // Frame settings
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
