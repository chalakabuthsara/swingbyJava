import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    Game(){
        frame = new JFrame("Keybinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.CYAN);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new  RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAct");
        label.getActionMap().put("upAct", upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAct");
        label.getActionMap().put("downAct", downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAct");
        label.getActionMap().put("leftAct", leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAct");
        label.getActionMap().put("rightAct", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public  class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }
}
