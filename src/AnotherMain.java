import javax.swing.*;
import java.awt.*;

public class AnotherMain {
    public static void main(String[] args) {
         ImageIcon icon = new ImageIcon("fire.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
//        label.setHorizontalAlignment(JLabel.RIGHT);
//        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setBounds(100,100,75,75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null); // Use BorderLayout for proper alignment
        redPanel.add(label);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}