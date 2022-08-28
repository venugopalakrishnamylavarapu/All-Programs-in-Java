public class SumOfRowNSumOfColumn {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //for row sum
        for (int i = 0; i <arr.length ; i++) {
            int rowsum=0;
            for (int j = 0; j < arr.length; j++) {
                rowsum+=arr[i][j];
            }
            System.out.println("The sum of the row "+i+" is:"+rowsum);
        }

        //for columnsum
        for (int col = 0; col < arr[0].length; col++) {     //same row lagey kani manam first
                                                            // loop *column ni* tiskuntam tarvatha e code ni debug chey nikey ardham avuthundi
            int colsum=0;
            for (int row=0;row<arr.length;row++)
            {
                colsum+=arr[row][col];
            }
            System.out.println("The sum of the column "+col+" is "+colsum);
        }
    }
}
