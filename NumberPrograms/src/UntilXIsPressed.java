import java.util.Scanner;

import static java.lang.System.in;

public class UntilXIsPressed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        int sum=0;
        while(true) {
            if (sc.hasNextInt()) {
                sum += sc.nextInt();
            } else if (sc.hasNextLine())
            {
                if(sc.next().equalsIgnoreCase("x"))
                {
                    System.out.println("The sum is:"+sum);
                    break;
                }
            }
        }
    }
}
