import java.util.Scanner;

import static java.lang.System.in;

public class spyNumber {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(in);
            System.out.println("Enter the number to be checked");
            int n = sc.nextInt();
            int sum = 0, prod = 1;
            while (n > 0) {
                int last = n % 10;
                sum += last;
                prod *= last;
                n = n / 10;
            }
            if (sum == prod) {
                System.out.println("The number is a spy number");
            } else {
                System.out.println("Not a spy number");
            }
            System.out.println("\n");
        }
    }
}
