
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
//import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

public class SellerLogin extends JFrame implements ActionListener {
        static ArrayList<String[]> owarr = new ArrayList<>();
        static ArrayList<String[]> delarr = new ArrayList<>();

        JPanel topPanel, centerPanel, leftPanel, rightPanel, bottomPanel;
        JLabel sellerLabel, sellerimagelabel, p_idLabel, categoryLabel, productnameLabel, quantityLabel, HeadLabel,
                        pricelabel, ProductsList;
        JTextField p_idfield, categoryField, productnamefield, quantityfield, pricefield;
        JComboBox categoriesComboBox;
        JButton add, delete, clear, edit, back, Update;
        public JTable stock, sellertTable;
        DefaultTableModel dt;
        String price, category, quantity, name, id;
        JScrollPane scrollpane;
        ImageIcon sellericon;

        public SellerLogin() {

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
                centerPanel.setLayout(null);
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

                sellerLabel = new JLabel();
                sellerLabel.setText("<html> <p>SELLER<br/>SECTION</p> </html>");
                sellerLabel.setFont(new FontUIResource("MV Boli", Font.ITALIC, 30));
                sellerLabel.setBounds(40, 15, 300, 100);
                sellerLabel.setForeground(Color.WHITE);

                sellerimagelabel = new JLabel();
                sellericon = new ImageIcon("sellerimage.png");
                sellerimagelabel.setIcon(sellericon);
                sellerimagelabel.setBounds(-160, 115, 410, 400);
                // =================CODE FOR RESIZING IMAGEICON=================================

                // ImageIcon imageIcon = new ImageIcon("./img/imageName.png"); // load the image
                // to a imageIcon
                // Image image = sellericon.getImage(); // transform it
                // Image newimg = image.getScaledInstance(250, 400,
                // java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
                // sellericon = new ImageIcon(newimg); // transform it back

                // sellerLabel.setIcon(sellericon);

                // sellerimagelabel.setBackground(Color.GREEN);
                // sellerimagelabel.setOpaque(true);

                // ==========CENTER PANEL WORK==============
                HeadLabel = new JLabel();
                HeadLabel.setText("MANAGE PRODUCTS");
                HeadLabel.setFont(new FontUIResource("MV Noli", Font.ITALIC, 15));
                HeadLabel.setBounds(220, -5, 200, 50);

                p_idLabel = new JLabel();
                categoryLabel = new JLabel("Category");
                p_idfield = new JTextField("(Auto-Generated)");
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
                p_idfield.setEnabled(false);

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

                Update = new JButton();
                Update.setText("Update");
                Update.setBackground(Color.black);
                Update.setForeground(Color.BLACK);
                Update.setBounds(550, 260, 80, 30);
                Update.addActionListener(this);

                back = new JButton();
                back.addActionListener(this);
                back.setBounds(0, 5, 35, 35);
                ImageIcon backimg = new ImageIcon("backimage.png");
                Image bgimg = backimg.getImage();
                Image newimg = bgimg.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
                backimg = new ImageIcon(newimg);
                back.setIcon(backimg);

                ProductsList = new JLabel();
                ProductsList.setFont(new FontUIResource("MV Boli", Font.ITALIC, 15));
                ProductsList.setText("Products List");
                ProductsList.setBounds(250, 240, 200, 50);

                sellertTable = new JTable();
                dt = new DefaultTableModel(0, 0);
                String[] columns = { "ID", "Name", "Category", "Quantity", "Price Rs." };
                dt.setColumnIdentifiers(columns);
                sellertTable.setRowHeight(35);

                sellertTable.setModel(dt);
                scrollpane = new JScrollPane(sellertTable);

                scrollpane.setBounds(0, 290, 640, 222);

                // dt.addRow(new Object[] { "0001", "Milk", "Dairy", "0", "22" });
                // dt.addRow(new Object[] { "0002", "Small Shirt", "Kids", "20", "50" });
                // dt.addRow(new Object[] { "0001", "Milk", "Dairy", "0", "22" });

                // ================FOR ACTIONS IN TABLE ANF FILE=====================
                id = p_idfield.getText();
                name = productnamefield.getText();
                quantity = quantityfield.getText();
                category = String.valueOf((categoriesComboBox.getSelectedItem()));
                price = pricefield.getText();
                // =========================================================================================

                // centerPanel.setBackground(Color.);
                centerPanel.add(scrollpane);
                topPanel.add(back);
                centerPanel.add(ProductsList);

                centerPanel.add(Update);
                centerPanel.add(clear);
                centerPanel.add(delete);
                centerPanel.add(edit);
                centerPanel.add(add);
                centerPanel.add(pricefield);
                centerPanel.add(pricelabel);
                centerPanel.add(quantityLabel);
                centerPanel.add(quantityfield);
                centerPanel.add(HeadLabel);
                centerPanel.add(categoryLabel);
                centerPanel.add(categoriesComboBox);
                centerPanel.add(productnameLabel);
                centerPanel.add(productnamefield);
                centerPanel.add(p_idLabel);
                centerPanel.add(p_idfield);
                // centerPanel.add(categoryField);
                centerPanel.add(categoryLabel);
                leftPanel.add(sellerimagelabel);
                leftPanel.add(sellerLabel);
                this.add(leftPanel, BorderLayout.WEST);
                this.add(rightPanel, BorderLayout.EAST);
                this.add(bottomPanel, BorderLayout.SOUTH);
                this.add(centerPanel, BorderLayout.CENTER);
                this.add(topPanel, BorderLayout.NORTH);

                this.setVisible(true);
        }

        public void OverWriteFile(int x, String a, String b, String c, String d) {
                credentials c3 = new credentials();
                c3.ReadTheStockFile(x, a, b, c, d);
        }

        public void OverWriteFile(int x) {
                credentials c3 = new credentials();
                c3.ReadTheStockFile(x, 0, 0, 0);
        }

        public void UpdateStock2(String a, String b, String c, String d, String e) {

                dt.addRow(new Object[] { a, b, c, d, e });
        }

        public void addinTableaAndFile(int x) {
                dt.addRow(new Object[] { x, productnamefield.getText(),
                                categoriesComboBox.getSelectedItem(),
                                quantityfield.getText(), pricefield.getText() });
                credentials c3 = new credentials();
                c3.writeStockfile(String.valueOf(x), productnamefield.getText(), categoriesComboBox.getSelectedItem(),
                                quantityfield.getText(), pricefield.getText());
                System.out.println("I passed");

        }

        // public void AddinFile() {
        // credentials c3 = new credentials();

        // }

        public void AddTableAfterRead(String a, String b, String c, String d, String e) {
                dt.addRow(new Object[] { a, b, c, d, e });

        }

        @Override
        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == back) {
                        new Myframe();
                        this.dispose();

                } else if (e.getSource() == add) {
                        Product p = new Product();
                        int x = p.Give_ID();
                        p_idfield.setText(String.valueOf(x));
                        Product.Create_Product(x, productnamefield.getText(),
                                        String.valueOf(categoriesComboBox.getSelectedItem()),
                                        Integer.valueOf(quantityfield.getText()),
                                        Integer.valueOf(pricefield.getText()));
                        addinTableaAndFile(x);
                        System.out.println(Product.arrayProducts.get(0).Name);

                        // dt.addRow(new Object[] { id, name, category, quantity, price });
                        JOptionPane.showMessageDialog(null, "Product Added !", "Stock Updated !",
                                        JOptionPane.INFORMATION_MESSAGE, null);

                } else if (e.getSource() == clear) {

                        productnamefield.setText("");
                        quantityfield.setText("");
                        pricefield.setText("");
                } else if (e.getSource() == edit) {
                        int x = Integer.valueOf(sellertTable.getValueAt(sellertTable.getSelectedRow(), 0).toString());
                        p_idfield.setText(String.valueOf(x));
                        OverWriteFile(x, productnamefield.getText(),
                                        String.valueOf(categoriesComboBox.getSelectedItem()), quantityfield.getText(),
                                        pricefield.getText());

                } 
                else if (e.getSource() == delete) {
                        int x = Integer.valueOf(sellertTable.getValueAt(sellertTable.getSelectedRow(), 0).toString());
                        p_idfield.setText(String.valueOf(x));
                        OverWriteFile(x);

                        credentials c3 = new credentials();
                        c3.ReadTheStockFile();
                        JOptionPane.showMessageDialog(null, "Product Deleted !", "Stock Updated !",
                                        JOptionPane.INFORMATION_MESSAGE, null);
                } else if (e.getSource() == Update) {
                        credentials c3 = new credentials();
                        c3.ReadTheStockFile();
                        // Product p = new Product();
                        // p.display();
                        this.dispose();
                }

        }

}
