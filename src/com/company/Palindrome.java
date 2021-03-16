package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int r,sum = 0;
        while(n > 0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp == sum){
            System.out.println(" is Palindrome");
        }
        else{
            System.out.println("not a Palindrome");
        }
    }
}
