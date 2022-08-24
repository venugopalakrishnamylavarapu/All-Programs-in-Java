import javax.swing.*;

public class JavaOptionPane {
    public static void main(String[] args) {
        JOptionPane opane=new JOptionPane();            //opane is the component here
     JOptionPane.showConfirmDialog(opane,"Hello cheppava?",
             "Greetings", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
     /*there are some ways in the optionpane like warning,information,question and many types
     * we can directly call the Joption pane without creating a component,its not mandatory
     * we can also add icons and custom messages in the windows like
     * (Hello! inplace of Yes,NotInteressted inplace of No,Goaway in place of cancel)*/

    }
}
