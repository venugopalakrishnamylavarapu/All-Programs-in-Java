package NumberPatterns;

public class Patterns
{
        public static void main(String[] args) {
            pattern1(5);
        }

        //pattern1
        static void pattern1(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        static void pattern2(int n)
        {
            for (int i = 1; i < 2*n; i++) {
                for (int j = 1; j < 2*n; j++) {
                    
                }
            }
        }
    }
