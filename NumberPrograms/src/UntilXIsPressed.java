import java.util.Scanner;

import static java.lang.System.in;

public class UntilXIsPressed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int sum = 0;
        while (true) {
            if (sc.hasNextInt()) {
                sum = sum + sc.nextInt();//do something with the integer
            } else if (sc.hasNextLine()) {
                if (sc.next().toLowerCase().equals("x")) {
                    System.out.println(sum);
                    break;
                }
            }
        }
    }
}
