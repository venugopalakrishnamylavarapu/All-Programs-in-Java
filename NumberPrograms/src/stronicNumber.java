import java.util.Scanner;

import static java.lang.System.in;

public class stronicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        while(true) {
            System.out.println("Enter the number to be checked:");
            int n = sc.nextInt();
            n = n * 2;
            int tens = 0, hundrds = 0;
            if (n > 0) {
                tens = tens + ((n % 100) / 10);
                hundrds = hundrds + ((n % 1000) / 100);
                if (tens == hundrds) {
                    System.out.println("The number is a stronic number");
                } else
                    System.out.println("The number is not a stronic number");
            }
            System.out.println("\n");
        }
    }
}
