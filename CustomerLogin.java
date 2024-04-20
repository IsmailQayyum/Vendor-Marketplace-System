
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.event.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

public class CustomerLogin extends JFrame implements ActionListener {
    JPanel topPanel, centerPanel, leftPanel, rightPanel, bottomPanel, cartpane;
    JLabel customerlabel, customerimagelabel;
    JButton back, cartbutton, Update;
    ImageIcon customericon;
    JLabel sellerLabel, sellerimagelabel, p_idLabel, categoryLabel, productnameLabel, quantityLabel, HeadLabel,
            pricelabel, ProductsList;
    JTextField p_idfield, categoryField, productnamefield, quantityfield, pricefield;
    JComboBox categoriesComboBox;
    JButton add, delete, clear, edit;
    JTable stock, table;
    DefaultTableModel dt;
    String price, category, quantity, name, id;
    JScrollPane scrollpane;
    ImageIcon sellericon;

    public CustomerLogin() {
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

        customerlabel = new JLabel();
        customerlabel.setText("<html> <p>CUSTOMER<br/>SECTION</p> </html>");
        customerlabel.setFont(new FontUIResource("MV Boli", Font.ITALIC, 30));
        customerlabel.setBounds(40, 15, 300, 100);
        customerlabel.setForeground(Color.WHITE);

        customerimagelabel = new JLabel();
        customericon = new ImageIcon("customerimage.png");
        customerimagelabel.setIcon(customericon);
        customerimagelabel.setBounds(50, 115, 410, 400);

        back = new JButton();
        back.addActionListener(this);
        back.setBounds(0, 5, 35, 35);
        ImageIcon backimg = new ImageIcon("backimage.png");
        Image bgimg = backimg.getImage();
        Image newimg = bgimg.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
        backimg = new ImageIcon(newimg);
        back.setIcon(backimg);

        cartbutton = new JButton();
        cartbutton.setBounds(10, 507, 44, 45);
        cartbutton.addActionListener(this);
        ImageIcon cartlogo = new ImageIcon("cart2.jpeg");
        cartbutton.setIcon(cartlogo);
        System.out.println(cartlogo.getIconWidth());
        System.out.println(cartlogo.getIconHeight());
        // ImageIcon cartlogo = new ImageIcon("backimage.png");
        Image iconimg = cartlogo.getImage();
        Image newimgs = iconimg.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
        cartlogo = new ImageIcon(newimgs);

        cartbutton.setIcon(cartlogo);

        System.out.println(customericon.getIconWidth());
        System.out.println(customericon.getIconHeight());

        Image image = customericon.getImage(); // transform it
        Image newimgg = image.getScaledInstance(114, 380, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        customericon = new ImageIcon(newimgg); // transform it back

        customerimagelabel.setIcon(customericon);

        // =================CODE FOR RESIZING IMAGEICON=================================

        // ImageIcon imageIcon = new ImageIcon("./img/imageName.png"); // load the image
        // to a imageIcon
        // Image image = customericon.getImage(); // transform it
        // Image newimg = image.getScaledInstance(250, 400,
        // java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        // customericon = new ImageIcon(newimg); // transform it back

        // customerlabel.setIcon(customericon);

        // customerimagelabel.setBackground(Color.GREEN);
        // customerimagelabel.setOpaque(true);

        HeadLabel = new JLabel();
        HeadLabel.setText("ITEMS IN SHOP");
        HeadLabel.setFont(new FontUIResource("MV Noli", Font.ITALIC, 15));
        HeadLabel.setBounds(220, -5, 200, 50);

        p_idLabel = new JLabel();
        categoryLabel = new JLabel("Category");
        p_idfield = new JTextField("ID");
        p_idfield.setForeground(Color.gray);
        // categoryField = new JTextField("Categoddddry");
        // categoryField.setForeground(Color.gray);
        productnameLabel = new JLabel();
        productnamefield = new JTextField("Name");
        productnamefield.setForeground(Color.gray);
        quantityLabel = new JLabel();
        quantityfield = new JTextField("Qty");
        quantityfield.setForeground(Color.gray);

        p_idLabel.setText("Product ID");
        p_idLabel.setBounds(20, 50, 100, 20);
        // p_idfield.setBackground(Color.yellow);

        p_idfield.setBounds(100, 45, 150, 30);

        productnameLabel.setText("Name");
        productnameLabel.setBounds(20, 100, 100, 20);
        // productnamefield.setBackground(Color.CYAN);
        productnamefield.setBounds(100, 95, 150, 30);

        quantityLabel.setText("Quantity");
        quantityLabel.setBounds(380, 50, 100, 20);
        // quantityfield.setBackground(Color.CYAN);
        quantityfield.setBounds(450, 45, 150, 30);

        pricelabel = new JLabel();
        pricelabel.setText("Price");
        pricelabel.setBounds(380, 100, 100, 20);

        pricefield = new JTextField("$");
        pricefield.setForeground(Color.gray);
        // pricefield.setBackground(Color.CYAN);
        pricefield.setBounds(450, 95, 150, 30);

        String categories[] = { "Cosmetics", "Dairy", "Kids", "Clothing", "Food", "Toy", "Drink", "Gadgets  " };
        categoriesComboBox = new JComboBox<>(categories);
        categoriesComboBox.setBounds(100, 145, 150, 30);
        categoryLabel.setBounds(20, 150, 100, 20);

        add = new JButton();
        add.setText("Add");
        add.setBackground(Color.black);
        add.setForeground(Color.BLACK);
        add.setBounds(70, 200, 80, 40);
        add.addActionListener(this);

        edit = new JButton();
        edit.setText("Edit");
        edit.setBackground(Color.black);
        edit.setForeground(Color.BLACK);
        edit.setBounds(190, 200, 80, 40);

        delete = new JButton();
        delete.setText("Delete");
        delete.setBackground(Color.black);
        delete.setForeground(Color.BLACK);
        delete.setBounds(360, 200, 80, 40);
        // hello

        clear = new JButton();
        clear.setText("Clear");
        clear.setBackground(Color.black);
        clear.setForeground(Color.BLACK);
        clear.setBounds(480, 200, 80, 40);
        clear.addActionListener(this);

        ProductsList = new JLabel();
        ProductsList.setFont(new FontUIResource("MV Boli", Font.ITALIC, 15));
        ProductsList.setText("Ordered List");
        ProductsList.setBounds(250, 240, 200, 50);

        table = new JTable();
        dt = new DefaultTableModel(0, 0);
        String[] columns = { "ID", "Name", "Category", "Quantity", "Price Rs." };
        dt.setColumnIdentifiers(columns);
        table.setRowHeight(35);
        // table.setBackground(Color.lightGray);
        table.setModel(dt);
        scrollpane = new JScrollPane(table);
        scrollpane.setBounds(0, 50, 640, 460);

        // dt.addRow(new Object[] { "0001", "Milk", "Dairy", "0", "22" });
        // dt.addRow(new Object[] { "0002", "Small Shirt", "Kids", "20", "50" });
        // dt.addRow(new Object[] { "0001", "Milk", "Dairy", "0", "22" });
        // dt.addRow(new Object[] { "0002", "Small Shirt", "Kids", "20", "50" });
        // dt.addRow(new Object[] { "0001", "Milk", "Dairy", "0", "22" });
        // dt.addRow(new Object[] { "0002", "Small Shirt", "Kids", "20", "50" });
        // dt.addRow(new Object[] { "0001", "Milk", "Dairy", "0", "22" });
        // dt.addRow(new Object[] { "0002", "Small Shirt", "Kids", "20", "50" });
        // dt.addRow(new Object[] { "0001", "Milk", "Dairy", "0", "22" });
        // dt.addRow(new Object[] { "0002", "Small Shirt", "Kids", "20", "50" });
        // dt.addRow(new Object[] { "0001", "Milk", "Dairy", "0", "22" });
        // dt.addRow(new Object[] { "0002", "Small Shirt", "Kids", "20", "50" });
        // dt.addRow(new Object[] { "0001", "Milk", "Dairy", "0", "22" });
        // dt.addRow(new Object[] { "0002", "Small Shirt", "Kids", "20", "50" });

        Update = new JButton();
        Update.setText("Update");
        Update.setBackground(Color.black);
        Update.setForeground(Color.BLACK);
        Update.setBounds(430, 10, 80, 30);
        Update.addActionListener(this);

        centerPanel.setBackground(Color.ORANGE);
        this.add(cartbutton);
        centerPanel.add(Update);
        table.setBackground(Color.LIGHT_GRAY);
        centerPanel.add(HeadLabel);
        // centerPanel.add(edit);
        // // centerPanel.add(add);
        // centerPanel.add(ProductsList);
        // centerPanel.add(categoriesComboBox);
        // centerPanel.add(categoryLabel);
        centerPanel.add(scrollpane);
        // centerPanel.add(quantityLabel);
        // centerPanel.add(quantityfield);
        // centerPanel.add(productnameLabel);
        // centerPanel.add(productnamefield);
        // centerPanel.add(p_idLabel);
        // centerPanel.add(p_idfield);
        // centerPanel.add(pricelabel);
        // centerPanel.add(pricefield);
        // centerPanel.add(delete);
        // centerPanel.add(clear);
        topPanel.add(back);
        leftPanel.add(customerimagelabel);
        leftPanel.add(customerlabel);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel, BorderLayout.EAST);
        this.add(bottomPanel, BorderLayout.SOUTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(topPanel, BorderLayout.NORTH);
        this.setVisible(true);
    }

    public void AddTableAfterRead(String a, String b, String c, String d, String e) {
        dt.addRow(new Object[] { a, b, c, d, e });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            new Myframe();
            this.dispose();

        } else if (e.getSource() == cartbutton) {
            new cartpage();
            this.dispose();
        } else if (e.getSource() == Update) {
            credentials c3 = new credentials();
            c3.ReadTheStockFile(1, 2);
            this.dispose();
        }
    }

}
