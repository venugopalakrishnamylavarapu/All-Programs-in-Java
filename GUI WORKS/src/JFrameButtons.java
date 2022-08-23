import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameButtons extends JFrame implements ActionListener {              //used inheritence here we inhereted the all the methods from JFrame Class
        JButton myButton;  //made it a global variable so the overriding action listner class can call it too.
                            //inko vishyam jbuttons veru jbutton veru be careful while implementing them.
        JFrameButtons()
        {
                myButton=new JButton();
                myButton.setBounds(100,150,200,50);
                myButton.setBackground(Color.YELLOW);
                myButton.setSize(250,150);
                myButton.addActionListener(this);       /*ikkada this enduku use cheysam antey e class ActionListner
                 ni access cheystundi so this antey this(current) class ani ardham
                 we can also use a lambda expression(without using the action listner)
                 i.e:->  e->System.out.println("Message u want to display")*/
            myButton.setText("Like and Subscribe");
            myButton.setFocusable(false); //white background lo button kanipinchataniki dabba la untundi ala avakudadantey false,leda true ani ivvali
            myButton.setBorder(BorderFactory.createLineBorder(Color.blue,15));       //to add the border for the button
            /*inka a buttons ki manam mustabulu cheyochu same frames lagey like
            * font styles,adding images in the button,font color,font size,data position in the button inka sana cheyochu mowa*/


                //ikkada frame ni create cheystunnam u know button undaliantey mundu frame undali ga
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(450,450);
            this.setResizable(true);
            this.setTitle("Buttons Program");
            this.getContentPane().setBackground(Color.gray);
            this.add(myButton);
        }

    @Override
    public void actionPerformed(ActionEvent e) {            //ActionListener class enduku antey user actions ni catch cheysi output istundi
        if(e.getSource()==myButton)             //manam button click cheysina prathi sari e block lo di run avudhi
        {
            System.out.println("Tq for the like and subscribe!!!");
        }
    }
}
