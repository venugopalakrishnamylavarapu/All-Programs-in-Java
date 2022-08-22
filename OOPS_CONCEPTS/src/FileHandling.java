import java.io.File;
import java.util.Scanner;

import static java.lang.System.in;

public class FileHandling
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        File file=new File("ANJALI RESUME.docx");
        if(file.exists())
        {
            System.out.println("File undi ra mowa ni computer lo!!");
            System.out.println("Path is:"+file.getAbsolutePath());
        }
        else
            System.out.println("File ledu mowa sry!!");
    }
}
