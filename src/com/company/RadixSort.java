package com.company;

import java.util.ArrayList;
import java.util.Collections;
public class RadixSort {
    public static void radixSort(int a[],int n)
    {
        ArrayList<Integer>[] radix = new ArrayList[n];
        for (int i=0;i<n;i++)
        {
            radix[i] = new ArrayList<Integer>();
        }
        for (int i=0;i<n;i++)
        {
            int ri = (a[i]) % 10;
            //int rj = (a[i] / 10) % 10;
            //int rk = (a[i] / 100) % 10;
            //radix[ri].();
        }
        for (int i=0;i<n;i++)
        {
            Collections.sort(radix[i]);
        }
        int index=0;
        for (int i=0;i<n;i++)
        {
            for (int j=0,size = radix[i].size();j<size;j++)
            {
                a[index++] = radix[i].get(j);
            }
        }
    }
    public static void main(String[] args)
    {
        int a[] = {237,146,259,348,152};
        radixSort(a,5);
        for (int item : a)
        {
            System.out.print(item + " ");
        }
    }
}
