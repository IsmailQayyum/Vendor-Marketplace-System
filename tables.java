import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class tables {

    private JFrame frame;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    tables window = new tables();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public tables() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        table = new JTable();

        DefaultTableModel daDefaultTableModel = new DefaultTableModel(0, 0);

        String[] columnNames = new String[] { "Column Header1", "Column Header2", "Column Header3" };

        daDefaultTableModel.setColumnIdentifiers(columnNames);

        // Dummy data for Table
        daDefaultTableModel.addRow(new Object[] { "Test1", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test2", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test3", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test4", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test5", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test6", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test7", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test8", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test9", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test10", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test11", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test12", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test13", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test14", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test15", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test16", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test17", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test18", "Test2", "Test3" });
        daDefaultTableModel.addRow(new Object[] { "Test19", "Test2", "Test3" });

        table.setModel(daDefaultTableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 38, 414, 212);
        frame.getContentPane().add(scrollPane);

    }

}
