package com.company;

public class CountingSort {
    // function to find maximum element
    public static int findMax(int A[], int n)
    {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++)
        {
            if (A[i] > max)
            {
                max = A[i];
            }
        }
        return max;
    }
    // function for count sort
    public static void CountSort(int A[],int n)
    {
        int i,j;
        // calling the findMax function
        int max = findMax(A,n);
        int c[] = new int[max+1];
        for (i=0;i<max+1;i++)
        {
            c[i] = 0;
        }
        for (i=0;i<n;i++)
        {
            c[A[i]]++;
        }
        j=0;
        i=0;
        while (i<max+1)
        {
            if (c[i] > 0)
            {
                A[j++] = i;
                c[i]--;
            }
            else
            {
                i++;
            }
        }
    }
    //driver code
    public static void main(String[] args)
    {
        int A[] = {11,13,7,12,16,9,24,5,10,3};
        int n = A.length;
        // calling the count sort function
        CountSort(A,n);
        for(int item: A)
        {
            System.out.print(item + " ");
        }
    }
}
