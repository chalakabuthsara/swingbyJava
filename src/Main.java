import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("dude.jpeg");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00ff00));
        label.setFont(new Font("Poppins",Font.PLAIN,64));
        label.setIconTextGap(60);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER );
//        label.setBounds(100, 50, 350, 350);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(420,420);
//        frame.setLayout(null);
        frame.add(label);
        frame.pack();
//
//        ImageIcon image = new ImageIcon("dude.png");
//        frame.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(new Color(0xF1F1F1));
        frame.setVisible(true);

//        MyFrame MyFrame = new MyFrame();
    }
}