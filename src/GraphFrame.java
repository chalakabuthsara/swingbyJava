import javax.swing.*;
import java.awt.*;

public class GraphFrame extends JFrame {
    PaintPanel paintPanel;
    GraphFrame(){
        paintPanel = new PaintPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(paintPanel);
        this.pack();
        this.setVisible(true);
    }


}
