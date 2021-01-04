package com.company;

public class IntegerAnagram {
    static final int A1 = 10;// making a variable static
    public static void frequency(int n, int freq[]){// creating a function for calculating frequency of the digit os that number
        while(n > 0){
            int digit = n % A1;
            freq[digit]++;
            n /= A1;
        }
    }
    public static boolean isAnagram(int a,int b){// creating a function for checking anagram
        int freqA[] = new int[A1];
        int freqB[] = new int[A1];
        frequency(a,freqA);
        frequency(b,freqB);
        for(int i=0;i<A1;i++){
            if(freqA[i] != freqB[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int a = 204;
        int b = 436;
        if(isAnagram(a,b)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
