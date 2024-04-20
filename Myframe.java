
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;

//import com.opencsv.CSVReader;

import javax.swing.plaf.FontUIResource;

public class Myframe extends JFrame implements ActionListener {
    JPanel panel, rightPanel;
    ImageIcon imageicon;
    public JButton Loginbutton;
    JTextField loginfield;
    JPasswordField passwordField;
    JButton resetbutton, signupbutton;
    JComboBox Role_combobox;
    String adminid = "admin", sellerid = "seller", customerid = "customer";
    static String s;
    String adminpass = "admin", sellerpass = "seller", customerpass = "customer";

    Myframe() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(900, 600);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setTitle("Mart Managment System");

        panel = new JPanel();
        rightPanel = new JPanel(); // RIGHT PANEL
        rightPanel.setLayout(null);
        rightPanel.setBounds(450, 0, 450, 600);
        rightPanel.setBackground(Color.WHITE);
        imageicon = new ImageIcon("SC2.png");
        // this.setIconImage(imageicon.getImage());
        panel.setLayout(null);
        JLabel welcomeLabel = new JLabel("WELCOME TO");
        JLabel label = new JLabel("   EZ MART");
        label.setIcon(imageicon);

        welcomeLabel.setBounds(0, 130, 400, 100);
        label.setBounds(50, 200, 350, 230);

        welcomeLabel.setAlignmentX(JLabel.CENTER);
        // label.setSize(50, 30);
        // label.setBackground(Color.BLACK);
        label.setForeground(Color.white);
        welcomeLabel.setForeground(Color.white);

        label.setFont(new FontUIResource("MV Boli", Font.ITALIC, 30));
        welcomeLabel.setFont(new FontUIResource("Playfair", Font.ITALIC, 30));
        welcomeLabel.setHorizontalTextPosition(JLabel.CENTER);
        welcomeLabel.setVerticalTextPosition(JLabel.TOP);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        // // label.setBackground(Color.BLACK);
        // label.setOpaque(true);
        // // welcomeLabel.setBackground(Color.BLACK);
        // welcomeLabel.setOpaque(true);

        // label.setHorizontalTextPosition(JLabel.CENTER);
        // label.setVerticalTextPosition(JLabel.CENTER);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);

        // setup for login--------------------------------
        JLabel roleLabel = new JLabel("Role");
        roleLabel.setBounds(100, 205, 100, 100);
        roleLabel.setFont(new FontUIResource("MV Boli", Font.PLAIN, 16));

        String[] roles = { "Admin", "Seller", "Customer" };
        Role_combobox = new JComboBox(roles);
        Role_combobox.setBounds(200, 235, 150, 40);
        // Role_combobox.setBackground(Color.CYAN);

        JLabel loginlabel = new JLabel("Username ");
        loginlabel.setBounds(100, 170, 300, 300);
        loginlabel.setFont(new FontUIResource("MV Boli", Font.PLAIN, 16));
        loginlabel.setBackground(Color.GREEN);

        loginfield = new JTextField("Ismail");
        loginfield.setForeground(Color.GRAY);
        loginfield.setBounds(200, 300, 150, 40);
        loginfield.setBackground(Color.CYAN);

        JLabel passwordlLabel = new JLabel("Password ");
        passwordlLabel.setBounds(100, 223, 300, 300);
        passwordlLabel.setFont(new FontUIResource("MV Boli", Font.PLAIN, 16));
        passwordlLabel.setBackground(Color.GREEN);

        passwordField = new JPasswordField("done");
        passwordField.setEchoChar(('*'));
        passwordField.setForeground(Color.GRAY);
        passwordField.setBounds(200, 350, 150, 40);
        passwordField.setBackground(Color.CYAN);

        Loginbutton = new JButton("Login");
        Loginbutton.addActionListener(this);
        Loginbutton.setBounds(100, 410, 100, 30);

        signupbutton = new JButton("Signup");
        signupbutton.addActionListener(this);
        signupbutton.setBounds(200, 410, 100, 30);

        resetbutton = new JButton("Reset");
        resetbutton.addActionListener(this);
        resetbutton.setBounds(300, 410, 100, 30);
        // loginfield.setPreferredSize(new DimensionUIResource(150, 40));

        // passwordlLabel.setFont(new FontUIResource("MV Boli", Font.PLAIN, 20));

        JPasswordField passwordfield = new JPasswordField();
        passwordfield.setEchoChar('*');

        ImageIcon loginimage = new ImageIcon("Loginicon.png");
        JLabel loginiconlabel = new JLabel();
        loginiconlabel.setBounds(115, 20, 200, 200);
        loginiconlabel.setIcon(loginimage);

        // passwordfield.setPreferredSize(new DimensionUIResource(150, 40));

        // JLabel Loginheading = new JLabel("LOGIN ");

        // Loginheading.setFont(new FontUIResource("Playfair", Font.BOLD, 20));
        // Loginheading.setPreferredSize(new DimensionUIResource(100, 40));

        // rightPanel.add(Loginheading);
        rightPanel.add(signupbutton);
        rightPanel.add(roleLabel);
        rightPanel.add(Role_combobox);
        rightPanel.add(loginiconlabel);
        rightPanel.add(passwordlLabel);
        rightPanel.add(passwordField);
        rightPanel.add(loginlabel);
        rightPanel.add(loginfield);
        rightPanel.add(Loginbutton);
        rightPanel.add(resetbutton);
        rightPanel.add(passwordfield);
        panel.setBounds(0, 0, 450, 600);
        panel.setBackground(Color.BLACK);
        // panel.setLayout(null);
        this.add(rightPanel);
        panel.add(label);
        panel.add(welcomeLabel);
        this.add(panel);
        this.setVisible(true);
    }
    // Actions=======================================================

    @Override
    public void actionPerformed(ActionEvent e) {

        if ((e.getSource() == Loginbutton)) {

            if ((Role_combobox.getSelectedItem() == "Seller")) {
                String x = loginfield.getText();
                String y = String.valueOf(passwordField.getPassword());
                credentials c2 = new credentials();
                try {
                    if (c2.verifySeller(x, y) == true) {
                        JOptionPane.showMessageDialog(null, "Login Successfull !", "Access Granted",
                                JOptionPane.INFORMATION_MESSAGE);
                        new SellerLogin();
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Access Denied",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            } else if ((Role_combobox.getSelectedItem() == "Admin") && (loginfield.getText().equals(adminid))
                    && (String.valueOf(passwordField.getPassword()).equals(adminpass))) {
                JOptionPane.showMessageDialog(null, "Login Successfull !", "Access Granted",
                        JOptionPane.INFORMATION_MESSAGE);
                new AdminLogin();
                this.dispose();
            }

            else if (Role_combobox.getSelectedItem() == "Customer") {
                String u_name = loginfield.getText();
                String pass = String.valueOf(passwordField.getPassword());
                credentials c2 = new credentials();
                try {
                    boolean result = c2.verify(u_name, pass);
                    if (result == true) {
                        JOptionPane.showMessageDialog(null, "Login Successfull !", "Access Granted",
                                JOptionPane.INFORMATION_MESSAGE);
                        new CustomerLogin();
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Access Denied",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IOException e1) {

                    e1.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Access Denied",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else if (e.getSource() == resetbutton) {
            loginfield.setText("");
            passwordField.setText("");
        }

        else if (e.getSource() == signupbutton) {
            new signup();
            this.dispose();
        }

    }

    // public void SignUpWork() {
    // rightPanel = new JPanel(); // RIGHT PANEL
    // rightPanel.setLayout(null);
    // rightPanel.setBounds(450, 0, 450, 600);
    // rightPanel.setBackground(Color.GREEN);
    // this.add(rightPanel);

    // System.out.println("YESSSS");
    // }
    // public static void main(String[] args) {
    // new Myframe();
    // System.out.println(s);
    // }
}
