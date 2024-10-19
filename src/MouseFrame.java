import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseFrame extends JFrame implements MouseListener {

    JLabel label;
    MouseFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.blue);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        System.out.println("You clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        System.out.println("released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entered");
        label.setBackground(Color.CYAN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exited ");
        label.setBackground(Color.red);
    }
}
