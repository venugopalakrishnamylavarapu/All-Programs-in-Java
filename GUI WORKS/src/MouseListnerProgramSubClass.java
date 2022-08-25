import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListnerProgramSubClass extends JFrame implements MouseListener {
    JLabel label;
    MouseListnerProgramSubClass()
    {
        label =new JLabel();
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        label.setBounds(0,0,150,150);
        label.addMouseListener(this);


        //frame creation
        this.add(label);
        this.setTitle("MouseListener Program");
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(420,520);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("MOuse clicked in the label");
        label.setBackground(Color.GREEN);
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse is pressed and on hold label");
        label.setBackground(Color.RED);
    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse is released in the label");

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered the label");
        label.setBackground(Color.MAGENTA);
    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited the label");
        label.setBackground(Color.BLUE);
    }
}
