import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ProgressBarSubClass extends JFrame {
    JLabel label = new JLabel();
    JFrame frame = new JFrame();
    JProgressBar pBar;

    ProgressBarSubClass() {
        pBar=new JProgressBar();
        pBar.setBounds(0,0,420,70);     //height main ikkada
        pBar.setStringPainted(true);
        pBar.setBackground(Color.cyan);
        pBar.setForeground(Color.BLACK);
        pBar.setFont(new Font(null,Font.BOLD,25));

        //label is created just for fun
        label.setText("Health");
        label.setFont(new Font(null,Font.ITALIC,25));
        label.setBounds(20,80,250,100);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);




        //frame creation
        this.setTitle("ProgressBar program");
        this.setSize(420,420);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(pBar);
        this.add(label);
        fill();
    }
    public void fill()
    {int count=100;
        while(count>0)
        {
            pBar.setValue(count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count--;
        }
        pBar.setString("Ipayee Chachav Po!!");

    }


}
