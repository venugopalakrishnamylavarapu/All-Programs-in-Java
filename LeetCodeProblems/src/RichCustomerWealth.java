//https://leetcode.com/problems/richest-customer-wealth/

import java.util.Scanner;

import static java.lang.System.in;

public class RichCustomerWealth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);

        int[][] arr = {{1, 2, 3}, {3, 2, 1},{3, 3, 3},{1, 2, 5}};
       
        System.out.println( new RichCustomerWealth().maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int maxwealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > maxwealth) {
                maxwealth = sum;
            }
        }
        return maxwealth;
    }
}
