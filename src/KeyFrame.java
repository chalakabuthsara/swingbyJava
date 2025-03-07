import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyFrame extends JFrame implements KeyListener {

    JLabel label;
    KeyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);


        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println(e.getKeyChar());
//        System.out.println(e.getKeyCode());
    }
}
