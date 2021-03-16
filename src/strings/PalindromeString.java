package strings;

import java.util.Scanner;

public class PalindromeString {
    static boolean isPalindrome(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string : ");
        String s1 = s.nextLine();
        int i = 0,j = s1.length()-1;
        while(i<j){
            if(s1.charAt(i) != s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        if (isPalindrome()){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not a palindrome");
        }
    }
}
