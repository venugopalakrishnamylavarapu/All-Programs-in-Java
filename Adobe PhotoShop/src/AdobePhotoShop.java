//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class AdobePhotoShop {
//    public static void main(String[] args) {
//
//         new MyFrame();
//    }
//    public static class MyFrame extends JFrame implements ActionListener {
//        JLabel jLabel;
//        MyFrame()
//        {
//            ImageIcon imageIcon = new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\Adobe PhotoShop\\None.png");
//            jLabel=new JLabel(null,imageIcon,JLabel.CENTER);
//            jLabel.setBounds(0,0,1280,720);
//
//
//
//            //frame creation
//            this.add(jLabel);
//            this.setTitle("AdobePhotoshop version 7");
//            this.setVisible(true);
//            this.setLayout(null);
//            this.setSize(1280,720);
//            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//            this.pack();
//        }
//
//        private void add(OptionPane optionPane) {
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }
//
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdobePhotoShop extends JFrame  {
    public AdobePhotoShop(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("AdobePhotoShop Version 7");
        frame.setLayout(new BorderLayout());
        frame.setSize(1912,1011);

        JLabel background;
        setSize(1580,960);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\Adobe PhotoShop\\None.png");
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1580,960);
        frame.add(background);
        int n=JOptionPane.showConfirmDialog(null, "Can't Open PhotoShop Now Try Again Later", "WARNING", JOptionPane.WARNING_MESSAGE);
        System.out.println(n);
        if(n==0 || n==2)
        {
            frame.dispose();
        }
        frame.pack();
    }
    public static void main(String[] args){

        new AdobePhotoShop();
    }
}