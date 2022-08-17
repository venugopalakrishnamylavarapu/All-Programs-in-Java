import java.util.Scanner;

import static java.lang.System.in;

public class bouncyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while (true) {
            System.out.println("Enter the number to be checked:");
            int n = sc.nextInt();
            if(n<100)
            {
                System.out.println("INVALID INPUT");
                System.out.println("Please enter a valid input");
                System.exit(0);
            }
            if (isDecreasing(n)==1)
                System.out.println("The number is a decreasing number");
            else if(isIncreasing(n)==1)
                System.out.println("The number is a increasing number");
            else
                System.out.println("The number is a bouncy number");
            System.out.println("\n");
        }
    }

    public static int isIncreasing(int n) {
        int temp = n;
       int flag=1;
        while (temp > 9) {
            int last = temp % 10;
            int seclast = (temp % 100) / 10;
            if (seclast > last) {
               flag=0;
                break;
            } else {
                temp = temp / 10;
            }
        }
        return flag;
    }

    public static int isDecreasing(int n) {
        int temp = n;
        int flag = 1;
        while (temp > 9) {
            int last = temp % 10;
            int seclast = (temp % 100) / 10;
            if (seclast < last) {
                flag = 0;
                break;
            } else {
                temp = temp / 10;
            }
        }
        return flag;
    }
}

