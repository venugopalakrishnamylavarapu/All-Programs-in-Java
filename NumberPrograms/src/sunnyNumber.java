import java.util.Scanner;

import static java.lang.System.in;

public class sunnyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        while(true) {                   //prathi sari run kottakundha adey automatic ga run avuthundi
            System.out.println("Enter the number to be checked:");
            int n = sc.nextInt();
            n = n + 1;
                double a = Math.sqrt(n);            //perfect number code kuda same logic.variable double lo matramey untundi ex.1.414(sqrt of 2)
                double b = Math.floor(a);
                double diff = a - b;
                if (diff == 0) {
                    System.out.println("The number is sunny number");
                } else
                    System.out.println("the number is not a sunnny number");
            System.out.println("\n");
            }
            //System.out.println("-------------------------------------------------------------------------------");
    }
    }

