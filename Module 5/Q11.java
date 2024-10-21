import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TODO {
    private JFrame frame;
    private DefaultListModel<String> taskListModel;
    private JList<String> todoList;
    private JTextField todoInput;
    private JButton addButton;

    public TODO() {
        frame = new JFrame("To-do List");
        frame.setDefaultCloseOperation(3);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        taskListModel = new DefaultListModel<>();
        todoList = new JList<>(taskListModel);
        JScrollPane taskScroll = new JScrollPane(todoList);

        todoInput = new JTextField();
        todoInput.setPreferredSize(new Dimension(300, 30));

        addButton = new JButton("Add");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.add(todoInput);
        mainPanel.add(addButton);

        frame.add(taskScroll, BorderLayout.CENTER);
        frame.add(mainPanel, BorderLayout.NORTH);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = todoInput.getText();
                if (!task.isEmpty()) {
                    taskListModel.addElement(task);
                    todoInput.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        TODO obj = new TODO();
    }
}
