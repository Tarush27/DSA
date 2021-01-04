package strings;

public class ReverseString {
    public static String reverseWords(String s)
    {
        int i = s.length();
        String str = "";
        while(i >= 0)
        {
            while (i >=0 && s.charAt(i) == ' ')i--;
            int j = 1;
            while(i >= 0 && s.charAt(i) != ' ')i--;
            if(str.isEmpty()) {
                str = str.concat(s.substring(i+1,j+1));
            }
            else
            {
                str = str.concat(""+s.substring(i+1,j+1));
            }
        }
        return str;
    }
    public static void main(String[] args)
    {
        reverseWords(" the sky is blue ");
    }
}
