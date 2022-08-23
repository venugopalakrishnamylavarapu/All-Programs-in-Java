import javax.swing.*;
import java.awt.*;

public class LaunchingTheWindow {
    JLabel label=new JLabel("Hello Mowa!!ela iethey sadinchav!! (>w<) ");       //we created the contents in label here itself
    LaunchingTheWindow()  //calling a constructor
    {
        JFrame frame = new JFrame();
        label.setBounds(0,0,500,150);
        label.setFont(new Font(null,Font.PLAIN,25));        //parameters of font is font(Font Style,font type,size of the font)

        //frame has been created in the file
        frame.setTitle("Im the Window That Ur opening");
        frame.setSize(720,420);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setVisible(true);

    }
}
