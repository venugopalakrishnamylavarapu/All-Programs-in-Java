import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameButtons extends JFrame  {              //used inheritence here we inhereted the all the methods from JFrame Class
        Button myButton;  //made it a global variable so the overridden action listner class can call it too.
        FrameButtons()
        {
                myButton=new Button();
                myButton.setBounds(100,150,200,50);
                myButton.setBackground(Color.YELLOW);
                //ikkada frame ni create cheystunnam u know button undaliantey mundu frame undali ga
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(450,450);
            this.setResizable(true);
            this.setTitle("Buttons Program");
            this.add(myButton);
//            this.setBackground(Color.black);
            this.getContentPane().setBackground(Color.black);
        }
}
