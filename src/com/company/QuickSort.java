package com.company;

public class QuickSort {
    // partition function
    public static int partition(int a[],int l,int h)
    {
        int pivot = a[l];
        int i=l;
        int j=h;
        while(i<j)
        {
            if (a[i] <= pivot)
            {
                i++;
            }
            if (a[j] > pivot)
            {
                j--;
            }
            int temp;
            if (i < j)
            {
                temp = a[i];
                a[i] = a[j];
            }
            else{
                temp = a[l];
                a[l] = a[j];
            }
            a[j] = temp;
        }
        return j;
    }
    public static void quickSort(int a[],int l,int h)
    {
        if(l<h)
        {
            int j = partition(a,l,h); // calling of partition function
            quickSort(a,l,j);
            quickSort(a,j+1,h);
        }
    }
    public static void main(String[] args)
    {
        int a[] = {50,70,60,90,40,80,10,20,30};// i have not taken user input...yes mam thanku maam
        int n = 9;
        quickSort(a,0,n-1); // maam should i run..?
        for(int item : a)
        {
            System.out.print(item + " ");
        }
    }
}
