import java.util.Scanner;

import static java.lang.System.in;


public class Reverseofnumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(in);
      int reverse=0;
        System.out.println("Enter the number to be reveresed:");
      int a=sc.nextInt();
      if(a<=10)
      {
          System.out.println("the reverse of the number is:"+a);
      }
      else {
          while(a != 0)
          {
              int remainder = a % 10;
              reverse = reverse * 10 + remainder;
              a = a/10;
          }
          System.out.println("The reverse of the given number is: " + reverse);
      }
    }
}
