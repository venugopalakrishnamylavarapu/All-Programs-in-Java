import java.util.*;

import static java.lang.System.in;

public class happyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while (true) {
            System.out.println("Enter the number to be checked(number greater than 10):");
            int n = sc.nextInt();
            if(n>0)
            {
                while (n > 9) {
                    int sum = 0;
                    while (n != 0) {
                        int last = n % 10;
                        sum += (last*last);
                        n /= 10;
                    }
                    n = sum;
                }
                if (n == 1) {
                    System.out.println("The number is a happy number");
                } else
                    System.out.println("The number is not a happy number");
            }
            System.out.println("\n");
        }
        }
    }
