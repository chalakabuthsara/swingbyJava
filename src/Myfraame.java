import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myfraame extends JFrame implements ActionListener {
//    JButton button;
//    JCheckBox checkBox;
//    JRadioButton pizzaButton;
//    JRadioButton hamburgerButton;
//    JRadioButton hotdogButton;
    JComboBox comboBox;

    Myfraame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = { "dog", "cat", "bird"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        comboBox.setEditable(true);
        comboBox.insertItemAt("pig",0);
        comboBox.setSelectedIndex(0);

        this.add(comboBox);

//        JButton button = new JButton();
//        button.setText("submit");
//        button.addActionListener(this);
//
//        JCheckBox checkBox = new JCheckBox();
//        checkBox.setText("I'm not a robot");
//        checkBox.setFont(new Font("Consolas", Font.PLAIN,35));

//        pizzaButton = new JRadioButton("pizza");
//        hamburgerButton = new JRadioButton("hamburger");
//        hotdogButton = new JRadioButton("hotdog");
//
//        ButtonGroup group = new ButtonGroup();
//        group.add(pizzaButton);
//        group.add(hamburgerButton);
//        group.add(hotdogButton);
//
//        pizzaButton.addActionListener(this);
//        hamburgerButton.addActionListener(this);
//        hotdogButton.addActionListener(this);

//        this.add(button);
//        this.add(checkBox);
//        this.add(pizzaButton);
//        this.add(hamburgerButton);
//        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==pizzaButton) {
//            System.out.println("You ordered Pizaa");
//        }
//        else if(e.getSource()==hamburgerButton) {
//            System.out.println("You ordered Hamburger");
//        }
//        else if(e.getSource()==hotdogButton) {
//            System.out.println("You ordered Hotdg");
//        }
        if(e.getSource()==comboBox) {
            System.out.println(comboBox.getSelectedItem());
//            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
