import java.util.Scanner;

import static java.lang.System.in;
//so in this method its more like a one line answer lol lets check the method
public class TotalCharsInString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        String str=sc.nextLine();
        long n=str.chars().filter(ch -> ch != ' ').count();     //here we used lambda expression(->)
        System.out.println("The number of characters in the string are:"+n);
    }
}
