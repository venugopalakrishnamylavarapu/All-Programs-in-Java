public class FrquencyOfOddNEvenMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {9, 8, 4},
                {2, 4, 8},
                {7, 3, 6}
        };
        int odd=0;
        int even=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
        }
        System.out.println("The Odd Numbers in the matrix are:"+odd);
        System.out.println("The Even Numbers in the matrix are:"+even);

    }
}
