package com.company;

public class InsertionSort {
    public static void main(String[] args)
    {
        int a[] = {8,5,7,3,2};
        int n = a.length;
        for(int i = 1;i<n;i++)
        {
            int j = i-1;
            int x = a[i];
            while (j>=0 && a[j] > x)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
        }
        for(int item : a)
        {
            System.out.print(item + " ");
        }
    }
}
