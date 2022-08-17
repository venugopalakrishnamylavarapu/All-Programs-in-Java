import java.util.*;


import static java.lang.System.in;

public class isbnNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        while(true)
        {
            System.out.println("enter the number to be checked:");
            long n=sc.nextLong(),digits=0,last,sum=0,temp;
                    temp=n;             //temp varible loki mana n(input) tiskunam
           while(n!=0) {
               last = n % 10;
               digits++;
               n = n / 10;
           }                                //e loop end ki n=0 avuthundi so manaki tarwatha-
            if(digits!=10)                  // -n ni call cheytey 0 tiskuntundi so manam temp ni call cheystam
            {
                System.out.println("INVALID INPUT");
                System.out.println("please enter a 10 digit number");
                break;
            }
            else
                for (int i = 10; i>=0 ; i--) {
                    last=temp%10;                       //idhigo ikkada e loop lo temp call cheysam.because it contains the original value of input
                    sum+=(last*i);
                    temp=temp/10;
                }
                if(sum%11==0)
                {
                    System.out.println("The given number is isbn number");
                }
                else
                    System.out.println("not an isbn number");

        }
    }
}
