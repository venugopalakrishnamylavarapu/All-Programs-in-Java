import java.util.Scanner;

import static java.lang.System.in;

public class RemovingWhiteSpacesFromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        String string = sc.nextLine();
        string=string.replaceAll("\\s+","");
        System.out.println("The string after removing white spaces is:"+string);
    }
}
