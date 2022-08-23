import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchThePageProgram implements ActionListener {
    JButton myButton=new JButton("Click Here to open the window");
    JFrame frame=new JFrame();
    LaunchThePageProgram()  //calling a constructor
    {

        myButton.setSize(250,250);
        myButton.setBounds(150,150,250,250);
        myButton.addActionListener(this);

        //frame has been created in the file
        frame.setTitle("Opening the window interface");
        frame.setVisible(true);
        frame.setSize(520,720);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(myButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton)
        {
           LaunchingTheWindow oen= new LaunchingTheWindow();
           frame.dispose();

        }
    }
}
