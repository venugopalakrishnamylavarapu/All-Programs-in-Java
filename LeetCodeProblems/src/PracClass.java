import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class PracClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
//        System.out.println("Enter the number of arrays: ");
//        int m = sc.nextInt();
        int[] arr = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(arr, 3));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        List<Boolean> b = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            b.add(candies[i] + extraCandies >= max);
        }
        return b;
    }
}

