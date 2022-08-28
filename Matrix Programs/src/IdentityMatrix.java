public class IdentityMatrix {
    //in this program we find about wheather the given matrix is identity matrix or not
    public static void main(String[] args) {
        int arr[][] = {     //both dimensions shud be same
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        boolean flag=true;
        int row=arr.length;
        int col=arr[0].length;
        if(row!=col)
        {
            System.out.println("Matrix is not valid");
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(i==j &&arr[i][j]!=1)
                    {
                        flag=false;
                        break;
                    }
                    else if(i!=j&&arr[i][j]!=0)
                    {
                        flag=false;
                        break;
                    }
                }
            }
        }
        if(flag)
        {
            System.out.println("The matrix is identity matrix");
        }
        else
            System.out.println("The matrix is not an identity matrix");
    }
}
