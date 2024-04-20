import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class tableTest {
    JFrame frame;
    JTable table;

    public tableTest() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        table = new JTable();

        DefaultTableModel daDefaultTableModel = new DefaultTableModel(0, 0);

        String[] columnNames = new String[] { "Column Header1", "Column Header2", "Column Header3" };

        daDefaultTableModel.setColumnIdentifiers(columnNames);
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

        table.setModel(daDefaultTableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 0, 414, 212);
        frame.getContentPane().add(scrollPane);

        ReadTheFile();
    }

    public void ReadTheFile() {
        String file = "stock.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                lines = line.split(delimiter, 3);
                System.out.println(
                        "\n" + lines[0] + ",---" + lines[1] + ",--" + lines[2]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        tableTest t = new tableTest();
        t.frame.setVisible(true);
        // t.ReadTheFile();
    }
}
