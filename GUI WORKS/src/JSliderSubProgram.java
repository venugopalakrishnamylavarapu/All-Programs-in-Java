import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderSubProgram extends JFrame implements ChangeListener { //creates a frame to contain all the data
    JLabel label;       //creates a label so we can add content to the frame through it
    JPanel panel;          //creates a panel(more like a sub frame inside the frame) and it contains the contents which can also be taken from labels
    JSlider slider;     //creates a slider(content)
    JSliderSubProgram()
    {
        //JSliderCreation
        slider=new JSlider(0,100,0);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        //Label Creation
        label =new JLabel();
        label.setLayout(new BorderLayout());
        label.setFont(new Font(null,Font.PLAIN,25));
        label.setVerticalTextPosition(JLabel.BOTTOM);




        //panel creation
        panel=new JPanel();
        panel.add(slider);
        panel.add(label);




        //frame creation
        this.setSize(420,420);
        this.setTitle("JSlider Program");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.add(panel);
        this.add(panel);
        this.setVisible(true);



    }

    /**
     * Invoked when the target of the listener has changed its state.
     *
     * @param e a ChangeEvent object
     */
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Degree of temp is :- "+slider.getValue());
    }
}
