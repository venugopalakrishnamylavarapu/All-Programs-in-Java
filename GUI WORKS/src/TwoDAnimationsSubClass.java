import javax.swing.*;

public class TwoDAnimationsSubClass extends JFrame {
    TwoDAnimationsJPanel panel;
    TwoDAnimationsSubClass(){
        panel = new TwoDAnimationsJPanel();

        this.setTitle("2D Animations Program");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
