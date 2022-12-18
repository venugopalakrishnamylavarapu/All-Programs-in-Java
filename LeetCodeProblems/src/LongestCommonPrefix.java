//14.problem link https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
    public String meth1(String[] arr)
    {
        String prefix=arr[0];
        if(arr== null || arr.length==0) return "";
        for(int i=1;i<arr.length;i++)
        {
            while(arr[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.length() == 0) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String str[]={"flower","flow","floight"};
        System.out.println(new LongestCommonPrefix().meth1(str));
    }

//    public static void main(String[] args) {
//        String strs[] = {"flower","flow","flight"};
//        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
//    }

}
