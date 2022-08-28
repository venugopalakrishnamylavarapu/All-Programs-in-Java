public class SparseMatrix {
    //A matrix is said to be sparse matrix if most of the elements of that matrix are 0. It implies that it contains very less non-zero elements.
    public static void main(String[] args) {
        int arr[][] = {
                {4, 0, 0},          //try with user input or change this given array for quick adjustments
                {0, 5, 0},
                {0, 0, 6}
        };
        int digitsCount=0,zeroCount=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]!=0)
                {
                    digitsCount++;
                }
                else
                {
                    zeroCount++;
                }
            }
        }
        if(zeroCount>digitsCount)
        {
            System.out.println("The given matrix is a sparse matrix");
        }
        else
        {
            System.out.println("The given matrix is not a sparse matrix");
        }
    }
}
