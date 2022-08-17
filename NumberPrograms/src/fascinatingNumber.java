import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;

public class fascinatingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        while(true) {
            System.out.println("Enter the number to be checked:");
            int n = sc.nextInt();
            if (n < 100) {
                System.out.println("INVALID INPUT");
                System.exit(0);
            }
            else
            {
                int a=n*2;
                int b=n*3;
                String concat=n+""+a+b;                    //concat ante kalapadam
                int count=1;
                for (char ch='1';ch<='9';ch++) {            //e loop ni 1 anukundam
                    count=0;
                    for (int i = 0; i < concat.length(); i++) {
                        if(concat.charAt(i)==ch) {
                            count++;
                        }
                    }
                    if(count!=1)                //compare 1 tho cheysey tappudu digit
                    {
                        count=0;
                        break;
                    }
                }
                if (count==1) {
                    System.out.println("is a fascinating number");
                }
                else
                    System.out.println("Not a fascinating number");
            }
        }
    }
}
