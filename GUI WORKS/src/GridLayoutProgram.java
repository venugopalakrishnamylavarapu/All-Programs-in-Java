import javax.swing.*;
import java.awt.*;

public class GridLayoutProgram {
    public static void main(String[] args) {

        //GridLayout antey grid style lo components ni cheystam.see the below code for more clarity

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
        frame.setTitle("GridLayout manager usage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,3,10,10));     //default Gridlayout position is centre
        //in order to change the lay we can replace the above line with --> frame.setLayout(new FlowLayout(FLowLayout.LEADING));
        frame.add(button1);         //the two operations can be done in a single line it is --> frame.add(new JButton("name"));
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        /*we can also create a panel and store these buttons in that panel and add that panel to the frame,sounds cool ri8!!!*/
        frame.setVisible(true);

    }
}
