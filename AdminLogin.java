
import java.awt.Color;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

public class AdminLogin extends JFrame implements ActionListener {
    static ArrayList<String[]> owarr = new ArrayList<>();
    static ArrayList<String[]> delarr = new ArrayList<>();

    JPanel topPanel, centerPanel, leftPanel, rightPanel, bottomPanel;
    JLabel adminLabel, adminimagelabel, Username, Password;
    ImageIcon adminicon;
    ImageIcon backimg;
    JButton back, Update;
    JLabel sellerLabel, sellerimagelabel, p_idLabel, genderlabel, sellernameLabel, ageLabel, HeadLabel,
            cellNoLabel, sellerlist;
    JTextField p_idfield, categoryField, sellernameField, ageField, cellnoField, UsernameField, PassField;
    JComboBox categoriesComboBox;
    JButton add, delete, clear, edit;
    JTable stock, table;
    DefaultTableModel dt;
    String price, category, quantity, name, id;
    JScrollPane scrollpane;
    ImageIcon sellericon;

    public AdminLogin() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(900, 600);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setTitle("Mart Managment System");

        topPanel = new JPanel();
        topPanel.setBackground(Color.BLACK);
        topPanel.setPreferredSize(new DimensionUIResource(0, 30));
        topPanel.setLayout(null);

        centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        centerPanel.setPreferredSize(new DimensionUIResource(0, 100));
        centerPanel.setLayout(null);

        leftPanel = new JPanel();
        leftPanel.setBackground(Color.BLACK);
        leftPanel.setPreferredSize(new DimensionUIResource(250, 0));
        leftPanel.setLayout(null);

        rightPanel = new JPanel();
        rightPanel.setBackground(Color.BLACK);
        rightPanel.setPreferredSize(new DimensionUIResource(7, 0));
        rightPanel.setLayout(null);

        bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.BLACK);
        bottomPanel.setPreferredSize(new DimensionUIResource(0, 30));
        bottomPanel.setLayout(null);

        adminLabel = new JLabel();
        adminLabel.setText("<html> <p>ADMIN<br/>SECTION</p> </html>");
        adminLabel.setFont(new FontUIResource("MV Boli", Font.ITALIC, 30));
        adminLabel.setBounds(40, 15, 300, 100);
        adminLabel.setForeground(Color.WHITE);

        adminimagelabel = new JLabel();
        adminicon = new ImageIcon("adminimage3.png");
        adminimagelabel.setIcon(adminicon);
        adminimagelabel.setBounds(30, 115, 410, 400);
        // adminimagelabel.setBackground(Color.CYAN);
        // adminimagelabel.setOpaque(true);
        // ImageIcon imageIcon = new ImageIcon("./img/imageName.png"); // load the image
        // to a imageIcon
        Image image = adminicon.getImage(); // transform it
        Image newimg = image.getScaledInstance(174, 400, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        adminicon = new ImageIcon(newimg);
        adminimagelabel.setIcon(adminicon); // transform it back

        System.out.println(adminicon.getIconWidth());
        System.out.println(adminicon.getIconHeight());

        back = new JButton();
        back.addActionListener(this);
        back.setBounds(0, 5, 35, 35);
        backimg = new ImageIcon("backimage.png");
        Image bgimg = backimg.getImage();
        Image newimgg = bgimg.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
        backimg = new ImageIcon(newimgg);
        back.setIcon(backimg);

        HeadLabel = new JLabel();
        HeadLabel.setText("MANAGE SELLERS");
        HeadLabel.setFont(new FontUIResource("MV Noli", Font.ITALIC, 15));
        HeadLabel.setBounds(220, -5, 200, 50);

        genderlabel = new JLabel("Gender");
        genderlabel.setBounds(20, 200, 100, 20);

        p_idLabel = new JLabel();
        p_idfield = new JTextField("(Auto-Generated)");
        p_idfield.setEnabled(false);
        p_idfield.setForeground(Color.gray);
        // categoryField = new JTextField("Categoddddry");
        // categoryField.setForeground(Color.gray);
        sellernameLabel = new JLabel();
        sellernameField = new JTextField("Name");
        sellernameField.setForeground(Color.gray);
        ageLabel = new JLabel();
        ageField = new JTextField("Age");
        ageField.setForeground(Color.gray);

        p_idLabel.setText("Seller ID");
        p_idLabel.setBounds(20, 50, 100, 20);
        // p_idfield.setBackground(Color.yellow);

        p_idfield.setBounds(100, 45, 150, 30);

        sellernameLabel.setText("Name");
        sellernameLabel.setBounds(20, 100, 100, 20);
        // sellernameField.setBackground(Color.CYAN);
        sellernameField.setBounds(100, 95, 150, 30);

        ageLabel.setText("Age");
        ageLabel.setBounds(380, 50, 100, 20);
        // ageField.setBackground(Color.CYAN);
        ageField.setBounds(450, 45, 150, 30);

        cellNoLabel = new JLabel();
        cellNoLabel.setText("Cell No");
        cellNoLabel.setBounds(380, 100, 100, 20);

        cellnoField = new JTextField("xxx");
        cellnoField.setForeground(Color.gray);
        // cellnoField.setBackground(Color.CYAN);
        cellnoField.setBounds(450, 95, 150, 30);

        Username = new JLabel();
        Username.setText("Username");
        Username.setBounds(20, 150, 100, 20);

        UsernameField = new JTextField("***");
        UsernameField.setForeground(Color.gray);
        // cellnoField.setBackground(Color.CYAN);
        UsernameField.setBounds(100, 145, 150, 30);

        Password = new JLabel();
        Password.setText("Password");
        Password.setBounds(380, 150, 100, 20);

        PassField = new JTextField("****");
        PassField.setForeground(Color.gray);
        // cellnoField.setBackground(Color.CYAN);
        PassField.setBounds(450, 145, 150, 30);

        String categories[] = { "Male", "Female", "Other" };
        categoriesComboBox = new JComboBox<>(categories);
        categoriesComboBox.setBounds(100, 195, 150, 30);

        add = new JButton();
        add.setText("Add");
        add.setBackground(Color.black);
        add.setForeground(Color.BLACK);
        add.setBounds(20, 245, 80, 40);
        add.addActionListener(this);

        edit = new JButton();
        edit.setText("Edit");
        edit.setBackground(Color.black);
        edit.setForeground(Color.BLACK);
        edit.setBounds(140, 245, 80, 40);
        edit.addActionListener(this);

        delete = new JButton();
        delete.setText("Delete");
        delete.setBackground(Color.black);
        delete.setForeground(Color.BLACK);
        delete.setBounds(360, 200, 80, 40);
        delete.addActionListener(this);

        clear = new JButton();
        clear.setText("Clear");
        clear.setBackground(Color.black);
        clear.setForeground(Color.BLACK);
        clear.setBounds(480, 200, 80, 40);
        clear.addActionListener(this);

        sellerlist = new JLabel();
        sellerlist.setFont(new FontUIResource("MV Boli", Font.ITALIC, 15));
        sellerlist.setText("Sellers List");
        sellerlist.setBounds(250, 240, 200, 50);

        table = new JTable();
        dt = new DefaultTableModel(0, 0);
        String[] columns = { "ID", "Name", "Gender", "Age", "Cell No", "Username", "Password" };
        dt.setColumnIdentifiers(columns);
        table.setRowHeight(35);
        table.setModel(dt);
        scrollpane = new JScrollPane(table);
        scrollpane.setBounds(0, 290, 640, 222);

        // dt.addRow(new Object[] { "0001", "Zoobia", "Female", "21", "0334-020-1134"
        // });
        // dt.addRow(new Object[] { "0002", "Noufal", "Male", "20", "0334-020-1134" });

        Update = new JButton();
        Update.setText("Update");
        Update.setBounds(430, 260, 80, 30);
        Update.addActionListener(this);
        centerPanel.add(Password);
        centerPanel.add(PassField);
        centerPanel.add(Update);
        centerPanel.add(Username);
        centerPanel.add(UsernameField);
        centerPanel.setBackground(Color.CYAN);
        table.setBackground(Color.LIGHT_GRAY);
        centerPanel.add(HeadLabel);
        centerPanel.add(edit);
        centerPanel.add(add);
        centerPanel.add(sellerlist);
        centerPanel.add(categoriesComboBox);
        centerPanel.add(genderlabel);
        centerPanel.add(scrollpane);
        centerPanel.add(ageLabel);
        centerPanel.add(ageField);
        centerPanel.add(sellernameLabel);
        centerPanel.add(sellernameField);
        centerPanel.add(p_idLabel);
        centerPanel.add(p_idfield);
        centerPanel.add(cellNoLabel);
        centerPanel.add(cellnoField);
        centerPanel.add(delete);
        centerPanel.add(clear);

        topPanel.add(back);
        leftPanel.add(adminimagelabel);
        leftPanel.add(adminLabel);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel, BorderLayout.EAST);
        this.add(bottomPanel, BorderLayout.SOUTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(topPanel, BorderLayout.NORTH);
        this.setVisible(true);
    }

    public void OverWriteFile(int x, String a, String b, String c, String d, String e, String f) {
        credentials c3 = new credentials();
        c3.ReadTheSellerCredsFile(x, a, b, c, d, e, f);
    }

    public void OverWriteFile(int x) {
        credentials c3 = new credentials();
        c3.ReadTheSellerCredsFile(x);
    }

    public void AddTableAfterRead(String a, String b, String c, String d, String e, String f, String g) {
        dt.addRow(new Object[] { a, b, c, d, e, f, g });

    }

    public void addinTableaAndFile(int x) {
        dt.addRow(new Object[] { x, sellernameField.getText(),
                categoriesComboBox.getSelectedItem(),
                ageField.getText(), cellnoField.getText(), UsernameField.getText(), PassField.getText() });
        credentials c3 = new credentials();
        c3.writeSellerStockfile(x, sellernameField.getText(), categoriesComboBox.getSelectedItem(),
                Integer.valueOf(ageField.getText()), cellnoField.getText(), UsernameField.getText(),
                PassField.getText());
        System.out.println("I passed");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            new Myframe();
            this.dispose();

        } else if (e.getSource() == add) {
            Sellers s = new Sellers();
            int x = s.Give_ID();
            p_idfield.setText(String.valueOf(x));
            Sellers.Create_Product(x, sellernameField.getText(),
                    String.valueOf(categoriesComboBox.getSelectedItem()),
                    Integer.valueOf(ageField.getText()),
                    cellnoField.getText(), UsernameField.getText(), PassField.getText());
            addinTableaAndFile(x);
            System.out.println(Product.arrayProducts.get(0).Name);

            // dt.addRow(new Object[] { id, name, category, quantity, price });
            JOptionPane.showMessageDialog(null, "Product Added !", "List Updated !",
                    JOptionPane.INFORMATION_MESSAGE, null);

        } else if (e.getSource() == Update) {
            credentials c3 = new credentials();
            c3.ReadSellerFile();

            this.dispose();
        } else if (e.getSource() == clear) {
            ageField.setText("");
            sellernameField.setText("");
            cellnoField.setText("");
            UsernameField.setText("");
            PassField.setText("");

        } else if (e.getSource() == delete) {
            int x = Integer.valueOf(table.getValueAt(table.getSelectedRow(), 0).toString());
            p_idfield.setText(String.valueOf(x));
            OverWriteFile(x);
            credentials c3 = new credentials();
            c3.ReadSellerFile();
            // Product p = new Product();
            // p.display();
            this.dispose();

        } else if (e.getSource() == edit) {
            int x = Integer.valueOf(table.getValueAt(table.getSelectedRow(), 0).toString());
            p_idfield.setText(String.valueOf(x));
            // "ID", "Name", "Gender", "Age", "Cell No", "Username", "Password"
            OverWriteFile(x, sellernameField.getText(), String.valueOf(categoriesComboBox.getSelectedItem()),
                    ageField.getText(), cellnoField.getText(), UsernameField.getText(), PassField.getText());
            credentials c3 = new credentials();
            c3.ReadSellerFile();

            this.dispose();

        }

    }
}
