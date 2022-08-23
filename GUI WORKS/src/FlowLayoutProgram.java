import javax.swing.*;
import java.awt.*;

public class FlowLayout {
    public static void main(String[] args) {

        JButton button1=new JButton("1");
        JButton button2=new JButton("2");
        JButton button3=new JButton("3");
        JButton button4=new JButton("4");
        JButton button5=new JButton("5");
        JButton button6=new JButton("6");
        JButton button7=new JButton("7");
        JButton button8=new JButton("8");
        JButton button9=new JButton("9");


        JFrame frame=new JFrame();
        frame.setSize(750,750);
        frame.setTitle("Flowlayout manager usage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());



    }
}
