//58.problem link https://leetcode.com/problems/length-of-last-word/description/
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count=0;
        if(s.length()==1)   return 1;
        else if(s.length()==0)  return 0;
        String str[]= s.split(" ",0);
        String k=str[str.length-1];
        return k.length();
    }
    public static void main (String[]args)
    {
        //String str= "        flyme           to    the moon                        ";
        //String str="Hello World";
        String str="luffy is still joyboy";
        System.out.println(new LengthOfLastWord().lengthOfLastWord(str));
    }
}
