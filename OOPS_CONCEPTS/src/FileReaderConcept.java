import java.io.*;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.in;

public class FileReaderConcept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
      try
      {
          FileReader filereader=new FileReader("filereaderexample.txt");
          int data=filereader.read();
          while(data != -1){
              System.out.print((char) data);
              data=filereader.read();
          }
          filereader.close();
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
    }
}
