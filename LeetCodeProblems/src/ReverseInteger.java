//7.problem link https://leetcode.com/problems/reverse-integer/description/
public class ReverseInteger {
    public int reverse(int x) {
        long reverted=0,temp=x;
        while(temp!=0)
        {
            reverted=reverted*10+temp%10;
            temp/=10;
        }

        if(reverted>Integer.MAX_VALUE ||reverted<Integer.MIN_VALUE)
            return 0;
        return (int)reverted;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(-251));
    }
}
