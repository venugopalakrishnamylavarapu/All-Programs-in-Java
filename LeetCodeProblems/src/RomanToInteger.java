import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class RomanToInteger {
    public int romanToInteger(String s)
    {
       int result=0;
       for(int i=s.length()-1;i>=0;i--)
       {
           switch(s.charAt(i)) {
               case 'M':
                   result += 1000;
                   break;
               case 'D':
                   result += 500;
                   break;
               case 'C':
                   result += 100 * (result >= 500 ? -1 : 1);
                   break;
               case 'L':
                   result += 50;
                   break;
               case 'X':
                   result += 10 * (result >= 10 ? -1 : 1);
                   break;
               case 'V':
                   result += 5;
                   break;
               case 'I':
                   result +=1* (result >= 5 ? -1 : 1);
                   break;
               default:
                   break;
           }
       }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the Roman value");
        String str=sc.nextLine();
        System.out.println("The Integer value for the given Roman Digit is : "+new RomanToInteger().romanToInteger(str.toUpperCase()));
    }
}
