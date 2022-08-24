import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarSubClass extends JFrame  implements ActionListener {
    JMenuBar menuBar;
    JMenu menuObject1;
    JMenu menuObject2;
    JMenu menuObject3;
    JMenu menuObject4;

    JMenuItem form;
    JMenuItem open;
    JMenuItem save;
    JMenuItem exit;

    MenuBarSubClass()
    {      //here we created the menu bar
        menuBar =new JMenuBar();        //created a menu bar

        //here we created the contents in the menu bar
         menuObject1=new JMenu("File");       //creating some menu items to menu bar
         menuObject2=new JMenu("Edit");
         menuObject3=new JMenu("Navigate");
         menuObject4=new JMenu("Help");

        //here we added the contents to the menu bar
        menuBar.add(menuObject1);       //adding the objects to menuBar Object
        menuBar.add(menuObject2);
        menuBar.add(menuObject3);
        menuBar.add(menuObject4);

        //here we create the (MenuItems) sub contents in the contents of the menu bar
         form=new JMenuItem("developer forms");
         open=new JMenuItem("Open");
         save=new JMenuItem("Save");
         exit=new JMenuItem("Exit");
         /*We can also add icons to the above menu items*/

        //we are adding a ActionListener since we expect the actions to be done on menuitems
        form.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        //here we add the sub contents to the content(main content(Edit,File,Navigate etc))
        menuObject4.add(form);      //similarly we can also create some more contents and add them to different main content(components)
        menuObject1.add(open);
        menuObject1.add(save);
        menuObject1.add(exit);


        //frame creating
        this.setJMenuBar(menuBar);          //here adding the menu bar to the frame is different it is achieved by the method .setJMenuBar(object)
        this.setTitle("Menu Bar Program");
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
        if(e.getSource()==form)
        {
            System.out.println("The developer of this page is M.Venu Gopala Krishna");
        }
        if(e.getSource()==save)
        {
            System.out.println("File has been saved in the directory");
        }
        if (e.getSource()==open)
        {
            System.out.println("File is Opened");
        }
        if (e.getSource()==exit)
        {
            System.exit(0);
        }
    }
}
