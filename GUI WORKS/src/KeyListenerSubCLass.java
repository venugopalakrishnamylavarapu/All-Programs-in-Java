import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerSubCLass extends JFrame  implements KeyListener {
    ImageIcon icon;
    JLabel label;
    KeyListenerSubCLass()
    {
        //created a icon;
        icon =new ImageIcon("Images.png");

        //created a label
        label =new JLabel();
        label.setIcon(icon);
        label.setBounds(0,0,242,208);



        //created a frame
        this.add(label);
        this.setTitle("KeyListener Program");
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(720,720);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.addKeyListener(this);
    }

    /**
     * Invoked when a key has been typed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key typed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode())
        {
            case 37: label.setLocation(label.getX()-10,label.getY());
                break;
            case 38: label.setLocation(label.getX(),label.getY()-10);
                break;
            case 40: label.setLocation(label.getX(),label.getY()+10);
                break;
            case 39: label.setLocation(label.getX()+10,label.getY());
                break;
        }

    }

    /**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of
     * a key released event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
