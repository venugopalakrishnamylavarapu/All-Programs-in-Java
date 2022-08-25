import javax.swing.*;

public class TwoDAnimationsSubClass extends JFrame {
    TwoDAnimationsJPanel panel;
    TwoDAnimationsSubClass(){
        panel = new TwoDAnimationsJPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
