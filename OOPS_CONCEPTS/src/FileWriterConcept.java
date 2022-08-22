import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class FileWriterConcept
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        try {
            FileWriter fileWriter=new FileWriter("jaihind.txt");
            fileWriter.write("vandey maataram\n");
            fileWriter.append("\nMowa nenu edo experimenting cheystunna!!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
