import java.util.*;
import java.io.*;
import javax.sound.sampled.*;

import static java.lang.System.in;

public class AudioPlayer {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc=new Scanner(in);
        File file=new File("[iSongs.info] 01 - Follow Follow-1.wav");           //audio files only .wav format lo undali and File class ni vadam ikkada
         AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(file);      //inputstreeam audio ni tiskuntaniki,audiosystem.get ani undi kada adi file ni tiskuntaniki audio system loki
        Clip clip=AudioSystem.getClip();        //clip aney method lo clip ni open cheya tam close cheyatam and so on methods untai so danni manam call cheysam

        String str ="";
        while(!str.equals("Q"))
        {
            System.out.println("Enter the option:");
            System.out.print("option Q:-to exit ||option S:-to Start ||option R:-to Reset ||option H:-to stop:-");
            str=sc.next();
            switch (str)
            {
                case ("Q"):clip.close();
                break;
                case  ("S"):clip.open();
                break;
                case ("R"):clip.setMicrosecondPosition(0);
                break;
                case ("H"):clip.stop();
                break;
                default:
                    System.out.println("Not a valid Option");
                    break;
            }
            System.out.println("malli next pata lo kaludham");
        }
    }
}
