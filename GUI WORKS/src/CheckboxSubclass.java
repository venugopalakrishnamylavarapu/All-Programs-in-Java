import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//JRadioButtons also follow the same process so im not programming it in the repository.Try it Yourself!!(it will be fun)
//HINT:-  in the JRadioButton we use ButtonGroup Class to group the radio button so that we can select one at a time
public class CheckboxSubclass extends JFrame implements ActionListener {
    JButton myButton;
    JCheckBox cBox;
 CheckboxSubclass()
 {
     myButton =new JButton("Submit!");
     myButton.setSize(100,50);
     myButton.addActionListener(this);

     cBox =new JCheckBox("i'm not subscribed");     //created a check box
     cBox.setSize(200,100);     //u can add more methods in checkbox like fontcolor,bg color,icon to the check box etc.
     cBox.setFocusable(false);
//     cBox.setEnabled();

     this.setTitle("CheckBox Program");
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.setLayout(new FlowLayout());
     this.add(myButton);
     this.add(cBox);
     this.setVisible(true);
     this.pack();

 }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==myButton)
     {
         if(cBox.isSelected())
         System.out.println("Welcome to Gamester Youtube Channel");
         else {
             System.out.println("Sorry only Subcribers are accessable to this channel");
         }
     }

    }
}
