package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        int count = 0;
        for (int i = 0;i<n;i++)
        {
            int sum = 0;
            
            for (int j = i;j<n;j++) {
                sum = a[j] + sum;
                if (sum < 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
