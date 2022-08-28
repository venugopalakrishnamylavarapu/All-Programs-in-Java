import java.util.Scanner;

import static java.lang.System.in;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        String str=sc.nextLine();
        String str1=" ";
        for (int i=str.length()-1;i>=0;i--) {
            str1+=str.charAt(i);                    //we can also use String Builder class to do some operations
        }
        System.out.println(str1);
    }
}
