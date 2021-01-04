package strings;

public class Anagram {
    public static void main(String[] args)
    {
        String a = "listen";
        String b = "silent";

        boolean isAnagram = true;
      /*  boolean visited[] = new boolean[b.length()];
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(i) == c && !visited[j])
                        visited[j] = true;
                    isAnagram = true;
                    break;
                }
                if (!isAnagram) {
                    break;
                }
            }
        }
       */
        int al[] = new int[256];

        for (char c: a.toCharArray())
        {
            int index = (int) c;
            al[index]++;
        }

        for (char c: b.toCharArray())
        {
            int index = (int) c;
            al[index]--;
        }

        for (int i = 0;i<al.length;i++)
        {
                if (al[i] != 0)
                {
                    isAnagram = false;
                    break;
                }
        }

        if (isAnagram){
            System.out.println("anagram");
        }
        else {
            System.out.println("not anagram");
        }
    }
}
