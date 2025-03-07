import javax.swing.*;
import java.awt.*;


public class ProgressBarDemo  {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    public ProgressBarDemo(){

        bar.setValue(0);
        bar.setBounds(0,100,380,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD, 16));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 100;

        while(counter > 0) {

            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter-=1;
        }
        bar.setString("Done! :)");
    }
}
