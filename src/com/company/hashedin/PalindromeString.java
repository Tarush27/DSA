package com.company.hashedin;

import java.util.Scanner;

public class PalindromeString {
    static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isPalindrome(str)){
            System.out.println(str + " is anagram");
        }
        else{
            System.out.println(str + " is not an anagram");
        }
    }
}
