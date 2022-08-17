import java.util.Scanner;

import static java.lang.System.in;

public class duckNumber {
    public static boolean checkNumber(int number) {

        // use loop to repeat steps
        while(number != 0) {

            // check whether the last digit of the number is zero or not
            if(number%10 == 0)
                return true;    //return true if the number is Duck

            // divide the number by 10 to remove the last digit
            number = number / 10;
        }

        return false; //return false if the number is not Duck
    }
    // main() method start
    public static void main(String args[])
    {

        //create scanner class object to get input from user
        Scanner sc=new Scanner(System.in);
        while(true) {

            //show custom message
            System.out.println("Enter first number");

            //store user entered value into variable n1
            int n1 = sc.nextInt();

            if (checkNumber(n1))
                System.out.println(n1 + " is a Duck number");
            else
                System.out.println(n1 + " is not a Duck number");
            System.out.println("\n");
        }
    }
}
