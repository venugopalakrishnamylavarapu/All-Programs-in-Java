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
        clip.open(audioInputStream);
        String str ="";
        while(!str.equals("Q"))
        {
            System.out.println("Enter the option:");
            System.out.println("option S:-to Start ||option R:-to Reset ||option H:-to stop ||option Q:-to exit:-");
            str=sc.nextLine();
            str=str.toUpperCase();
            switch (str) {
                case ("Q") -> {
                    clip.close();
                    System.out.println("malli next pata lo kaludham");
                    break;
                }
                case ("S") -> clip.start();
                case ("R") -> clip.setMicrosecondPosition(0);
                case ("H") -> clip.stop();
                default -> System.out.println("Not a valid Option");
            }
        }
    }
}
