import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class JFileOpenerProgramSubClass extends JFrame implements ActionListener {
    JButton myButton;
    JFileOpenerProgramSubClass()
    {
        //created a button
        myButton=new JButton("Select");
        myButton.setBounds(75,100,200,125);
        myButton.addActionListener(this);

        //created a frame
        this.add(myButton);
        this.setTitle("File Choosing Program");
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(420,420);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.GRAY);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton)
        {
            JFileChooser fileChooser=new JFileChooser();        //created a java file chooser
            fileChooser.setCurrentDirectory(new File("C:\\Users\\Dell\\Desktop"));      //to start at the default as a desktop
          int response= fileChooser.showOpenDialog(null);       // since we dont have any parent object(of the parent class)
            //we can also save new files to the device by.showSaveDialog(parent method)
            if(response==JFileChooser.APPROVE_OPTION)       //aprove option antey manam yes leda ok kotidey true avuthundi
            {
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());    //created a new file so that we can shoe the path to command line
                System.out.println(file);
            }
        }

    }
}
