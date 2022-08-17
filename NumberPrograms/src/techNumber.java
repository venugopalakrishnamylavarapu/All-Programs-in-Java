import java.util.Scanner;

import static java.lang.System.in;

public class techNumber {  //method type program kuda cheyochu same logic method lo cheystam dani main lo call cheystam antey
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while (true) {
            System.out.println("Enter the number to be reveresed:");
            int n = sc.nextInt(), digits = 0, sqr = 0;
            int temp = n;           //1st temp variable 1st while loop loki vellaka maripothundi
            while (temp > 0) {
                temp = temp / 10;
                digits++;
            }
            if (digits % 2 == 0) {
                temp = n;                //ikkada 2nd temp variable malli mana main input tiskuntundi
                while (temp > 0) {           // (ila while loop bayata enni sarlu tiskuntey anni sarlu main input tiskuntundi)
                    int a = temp % 100;
                    int b = temp / 100;
                    int sum = a + b;
                    sqr = sum * sum;
                    if (sqr == n) {
                        System.out.println("Is a tech number");
                        break;
                    } else
                        System.out.println("Not a tech number");
                    break;
                }
            } else
                System.out.println("Not a tech number");
            System.out.println("\n");
        }
    }
}

