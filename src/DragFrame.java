import javax.swing.*;

public class DragFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();
    DragFrame(){
        this.add(dragPanel);
        this.setTitle("Demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
