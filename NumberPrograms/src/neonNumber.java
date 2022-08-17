import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class neonNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        while(true) {
            System.out.println("Enter the number to be checked:");
            int n = sc.nextInt(), sum = 0;
            int sqr = n * n;
            while (sqr > 0) {
                int last = sqr % 10;
                sum += last;
                sqr = sqr / 10;
            }
            if (sum == n) {
                System.out.println("The number is a neon number");
            } else {
                System.out.println("Not a neon number");
            }
            System.out.println("\n");
        }
    }
}
