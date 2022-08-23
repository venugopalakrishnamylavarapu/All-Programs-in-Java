import javax.swing.*;
import java.awt.*;

public class JavaFrames {
    public static void main(String[] args) {
        // we can use the below steps for every time we create a jframe or we can create a child class which does the same with inheritence
        //when we call the instance of that class

        //here the below is raw code

        JFrame tab=new JFrame();
//        tab.setVisible(true); //makes the window visible(i mean frame).
//        tab.setTitle("Example Frame of java(title goes here)");//ikkada frame pina title vastundi
//        tab.setResizable(false); //false icham kabbati manam mouse tho frame size ni penchalenmu and maxiimize kuda cheyalemu.true istey size penchukovachu
//        tab.setSize(720,720);//here we provide the size of the framein terms of x dimension and y dimension
//        tab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application(by default its hide on close)
//
//        ImageIcon imageIcon=new ImageIcon("vlcsnap-2022-07-31-08h38m55s877.png"); //image file name
//        tab.setIconImage(imageIcon.getImage()); //to get the image as icon of the frame
//        tab.getContentPane().setBackground(new Color(14,67,32));//to set color the background.we can also use (Color.Green) or (new Color(0,0,0)) to create our own colors.

        //so here we can call the child class instance to get the whole process in one step
         MyFrame hello=new MyFrame();
    }
}
