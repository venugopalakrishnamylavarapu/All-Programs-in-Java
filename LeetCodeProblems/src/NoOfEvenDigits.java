//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class NoOfEvenDigits {
    public static void main(String[] args) {

    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(digits(nums[i])%2==0)
            {
                count++;
            }
        }
        return count;
    }
    static int digits(int number)
    {int count=0;
        while(number!=0)
        {
            number=number/10;
            count++;
        }
        return count;
    }
}
