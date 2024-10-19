import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnotherMyFr extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    AnotherMyFr() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout((new FlowLayout()));

        JButton button = new JButton("Submit");
        button.addActionListener(this);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Times New Roman", Font.PLAIN,35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("username");
        textField.setEditable(false);

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("Welcome" + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
