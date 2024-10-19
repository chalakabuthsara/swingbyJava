import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements  ActionListener{
    JButton button;
    JLabel label;
    MyFrame(){

        ImageIcon icon = new ImageIcon("fire.png");
        ImageIcon icon2 = new ImageIcon("dude.jpeg");


        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 150, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.blue);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

//        ImageIcon image = new ImageIcon("dude.png");
//        this.setIconImage(image.getImage());
//        this.getContentPane().setBackground(new Color(0xF1F1F1));
        }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
//            System.out.println("Poof");
            label.setVisible(true);
        }
    }
}

