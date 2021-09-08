package com.company.hashedin;

import java.util.Arrays;
import java.util.Scanner;

/*
method 1: sorting
method 2: count chars
*/
public class Anagram {
    static int CHARS = 256;

    // fun that checks anagram of string
    static boolean isAnagram(char[] s1, char[] s2) {
        // n1 and n2 contain length
        int n1 = s1.length;
        int n2 = s2.length;
        // checking the length of strings
        if (n1 != n2) {
            return false;
        }
        // sorting of the strings
        Arrays.sort(s1);
        Arrays.sort(s2);
        // comparing the 2 strings
        for (int i = 0; i < n1; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean areAnagram(char[] st1, char[] st2) {
        int c1[] = new int[CHARS];
        Arrays.fill(c1, 0);
        int c2[] = new int[CHARS];
        Arrays.fill(c2, 0);
        int i = 0;
        for (i = 0; i < st1.length && i < st2.length; i++) {
            c1[st1[i]]++;
            c2[st2[i]]++;
        }
        if (st1.length != st2.length){
            return false;
        }
        for (i = 0;i<CHARS;i++) {
            if (c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] s1 = {'t', 'a', 'r', 'u', 's', 'h'};
        char[] s2 = {'t', 'u', 's', 'h', 'a', 'r'};
        if (isAnagram(s1, s2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        char[] st1 = ("geeks").toCharArray();
        char[] st2 = ("keegs").toCharArray();
        if (areAnagram(st1, st2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
    }
}
