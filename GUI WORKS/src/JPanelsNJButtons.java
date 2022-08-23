import javax.swing.*;
import java.awt.*;

public class JPanelsNJButtons {
    public static void main(String[] args) {
        /* e program manam JPanels and JButtons gurinchi telsukuntam
        * Line 10 nundi Jpanel concept untundi.
        * Line 61 nundi JButtons Concept untundi */

        ImageIcon icon=new ImageIcon("download.png");       //image file has been taken


        JLabel label=new JLabel();          //label has been created to add stuff to panels.
        label.setIcon(icon);
        label.setHorizontalAlignment(JLabel.RIGHT);     //if we made modifications here the entire calls which called label will also change
                                                        //here we r aligning the data in the label



        /*declared some panels
        * new panels has been created and had different background which i created and their bounds are set(the boundarys which it occupies)
        * here we are taking the panels and adding them to the frame
        * the hierarchy is JFrame>JPanel>JLabel and so on
        * latter these panels are individually added to the frames
        * remember what we do in the frame will be in the whole window
        * and whatever we do in the panel stays in the panel where its adding a label in the panel or aligning of the text*/

        JPanel panel1=new JPanel();
        panel1.setBackground(Color.BLUE);
        panel1.setBounds(0,0,300,150);



        JPanel panel2=new JPanel();
        panel2.setBackground(Color.YELLOW);
        panel2.setBounds(250,0,350,150);


        JPanel panel3=new JPanel();
        panel3.setBackground(Color.RED);
        panel3.setBounds(0,150,600,750);
        panel3.setLayout(new BorderLayout());
        panel3.add(label);          //we called the label in the red panel(panel3).so,it only belongs to the panel3 now until if we called in other panels

        //here on wards is the JFrame part of the code

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle("Mowa Nuv Keka");
        frame.setIconImage(icon.getImage());
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
       /*Buttons concept lo manam buttons create cheystam so ikkada adi chala pedda concept la untundi so we will see in the next Program*/
    }
}
