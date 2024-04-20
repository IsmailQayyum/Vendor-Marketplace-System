import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import javax.swing.plaf.FontUIResource;

public class Loading extends JFrame {
    ImageIcon imageicon;
    JLabel label;
    JProgressBar progressBar;

    public Loading() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 300);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setTitle("Mart Managment System");
        this.getContentPane().setBackground(Color.BLACK);

        imageicon = new ImageIcon("SC2.png");
        label = new JLabel("EZ MART");
        label.setForeground(Color.WHITE);
        label.setBounds(170, 0, 200, 230);
        label.setIcon(imageicon);

        label.setFont(new FontUIResource("MV Boli", Font.ITALIC, 30));

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBackground(Color.WHITE);
        // label.setOpaque(true);

        progressBar = new JProgressBar();
        progressBar.setValue(0);
        // progressBar.setBounds(0, 200, 600, 50);
        // progressBar.setSize(600, 500);
        progressBar.setBounds(0, 235, 600, 10);
        // progressBar.setPreferredSize(new DimensionUIResource(600, 150));
        progressBar.setStringPainted(true);
        progressBar.setFont(new FontUIResource("MV Boli", Font.BOLD, 7));
        progressBar.setForeground(Color.WHITE);
        progressBar.setBackground(Color.BLUE);
        System.out.println(progressBar.getHeight());

        this.add(progressBar);
        this.add(label);
        this.setVisible(true);
        fill();
        new Myframe();
        this.dispose();
    }

    public void fill() {
        int counter = 0;
        while (counter <= 100) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter += 1;
        }
    }
}
