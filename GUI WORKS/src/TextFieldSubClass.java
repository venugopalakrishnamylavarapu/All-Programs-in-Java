import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldSubClass extends JFrame implements ActionListener {
    JButton myButton;
    JTextField tField;
    TextFieldSubClass() {
        tField=new JTextField();           //created a textfield
        tField.setVisible(true);
        tField.setPreferredSize(new Dimension(250,50));      //prefered size of the text field is taken here
        tField.setLayout(new FlowLayout());                 //layout mukyam bigiluu..
        tField.setBackground(Color.RED);        //set the background of the text field
        tField.setForeground(Color.YELLOW);     //set the color of the text in the text box
        tField.setCaretColor(Color.green);      //set the color of the inseting line("|") color
        myButton =new JButton("Log in");
        myButton.addActionListener(this);           //to invoke the the action listener to the button

        //created a frame so that we can add textfield to a frame
        this.setTitle("Java TextField Program");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.add(myButton);
        this.add(tField);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton)
        {
            System.out.println("Hello "+tField.getText()+" mowa");
            myButton.setEnabled(false);
            /*for above method:-so by using this method set enabled we can restrict the
             usage afteer the button is pressed once.after we cant press it to enable it set it true or dont use the above line at all lol.
            */
            tField.setEditable(false);
            /*for above method:-so by using this method set editable we can restrict the
            modification in the text field after the button is pressed once.
            after we cant press it to enable it set it true or dont use the above line at all lol.
            */
        }
    }
}
