//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class DiffOfProdNSum {
    public static void main(String[] args) {

    }
    public int subtractProductAndSum(int n) {
        int sum=0,pro=1;
        while(n!=0)
        {
            int last=n%10;
            sum+=last;
            pro*=last;
            n/=10;
        }
        return pro-sum;

    }
}
