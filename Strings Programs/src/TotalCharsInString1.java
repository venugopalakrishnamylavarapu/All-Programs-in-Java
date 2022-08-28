import java.util.Scanner;

import static java.lang.System.in;

public class TotalCharsInString1 {
    public static void main(String[] args) {
        //to count the total number of characters in the string we can use 2 methods
        //i'll show u the first one this program
        Scanner sc=new Scanner(in);
        String str=sc.nextLine();
         //iterate throught the array of the string and ignore the space(" ") and count them
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println("The no of characters in the string are:"+count);

    }
}
