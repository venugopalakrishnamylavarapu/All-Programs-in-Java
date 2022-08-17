//https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        int reverse=0;
        int temp=x;
        while(temp>0)
        {
            int last=temp%10;
            reverse=reverse*10+last;
            temp=temp/10;
        }
        return (reverse==x);

    }
}
