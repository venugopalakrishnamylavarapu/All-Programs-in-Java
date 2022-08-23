import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {//concept of inheritence is used which used the direct JFrame class From the java Library
    MyFrame() {
        this.setVisible(true); //makes the window visible(i mean frame).
        this.setTitle("Example Frame of java(title goes here)");//ikkada frame pina title vastundi
        this.setResizable(true); //false icham kabbati manam mouse tho frame size ni penchalenmu and maxiimize kuda cheyalemu.true istey size penchukovachu
        this.setSize(720, 720);//here we provide the size of the framein terms of x dimension and y dimension
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application(by default its hide on close)

        ImageIcon imageIcon = new ImageIcon("vlcsnap-2022-07-31-08h38m55s877.png"); //image file name
        this.setIconImage(imageIcon.getImage()); //to get the image as icon of the frame
        this.getContentPane().setBackground(new Color(14, 67, 32));//to set color the background.we can also use (Color.Green) or (new Color(0,0,0)) to create our own colors.
    }
}
