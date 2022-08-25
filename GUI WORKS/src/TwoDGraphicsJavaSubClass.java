import javax.swing.*;
import java.awt.*;

public class TwoDGraphicsJavaSubClass extends JFrame
{    MyPanel panel;

    TwoDGraphicsJavaSubClass(){

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}

