import javax.swing.*;

public class JOptionMain {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Alert something", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Alert something", "title", JOptionPane.INFORMATION_MESSAGE);
////        JOptionPane.showMessageDialog(null, "Really", "title", JOptionPane.QUESTION_MESSAGE);
//        while(true) {
//            JOptionPane.showMessageDialog(null, "Alert something", "title", JOptionPane.WARNING_MESSAGE);
//        }
//        JOptionPane.showMessageDialog(null, "Alert something", "title", JOptionPane.ERROR_MESSAGE);

//        int answer = JOptionPane.showConfirmDialog(null,"bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);

//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println(name);

        String[] responses = {"No, you're awesome!", "thank you!", "blush"};
        ImageIcon icon = new ImageIcon("dude.jpeg");

        JOptionPane.showOptionDialog(null, "You are awesome", "Secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }
}
