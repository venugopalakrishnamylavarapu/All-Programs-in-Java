//278.problem https://leetcode.com/problems/first-bad-version/?envType=study-plan&id=algorithm-i
//the solution is in comments since it is based on api in the given problem and i dont have that api.
public class FirstBadVersion
{
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/*      //the below is method containing the solution
        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
               if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }*/
}
