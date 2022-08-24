import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxSubClass extends JFrame implements ActionListener {
    JComboBox comboBox;
    ComboBoxSubClass()
    {
        String[] str={"option 1","option 2","option 3","option 4"};
        /*The intitialization must be done with Wrraper class like(String,Integer,Double,Character etc..)*/
     comboBox =new JComboBox(str);              //created a JComboBox.a jcombobox only stores reference warriable(shud be defined with a Wrapper Classes)
//     comboBox.setLayout(new FlowLayout());      //we created a layout to it
        comboBox.setBounds(150,100,250,100);
        comboBox.addActionListener(this);      //invokes the action listener when action occurs by user.
        comboBox.setBackground(Color.BLUE);     //konchem rangulu yesam antey
        comboBox.setForeground(Color.YELLOW);
        //the below methods are some useful ones
//        comboBox.setEditable(true);          // //we can search the item in the box
//        comboBox.addItem("option 5");
//        comboBox.setSelectedIndex(3);
//       comboBox.removeItem("option 2");
//        comboBox.removeItem(2);           ////takes the index
//        comboBox.removeAll();
//        comboBox.insertItemAt("option 6",4);




        //frame section
        this.setTitle("Combo Box Window");
        this.setLayout(null);
        this.setSize(750,750);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(comboBox);

        this.getContentPane().setBackground(Color.GRAY);
//        this.pack();
        this.setVisible(true);

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        System.out.println(comboBox.getSelectedItem());
    }
}
