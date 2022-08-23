import javax.swing.*;
import java.awt.FlowLayout;

public class FlowLayoutProgram {
    //flow layout is used when the components in the frame adjust according to the size of the frame automatically.
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
        frame.setVisible(true);
        frame.setTitle("Flowlayout manager usage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());     //default flowlayout position is centre
        //in order to change the lay we can replace the above line with --> frame.setLayout(new FlowLayout(FLowLayout.LEADING));
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);



    }
}
