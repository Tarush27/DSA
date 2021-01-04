package com.company;

public class RecursiveMerge {
    public static void merge(int a[],int l,int m,int h)
    {
        int i,j,k;
        i=l;
        j=m+1;
        k=l;
        int b[] = new int[100];
        while(i<=m && j<=h)
        {
            if(a[i] < a[j])
            {
                b[k++] = a[i++];
            }
            else{
                b[k++] = a[j++];
            }
        }
        for(;i<=m;i++)
        {
            b[k++] = a[i];
        }
        for(;j<=h;j++)
        {
            b[k++] = a[j];
        }
        for(i=l;i<=h;i++)
        {
            a[i] = b[i];
        }
    }
    public static void MergeSort(int a[],int l,int h)
    {
        if (l<h)
        {
            int m=(l+h)/2;
            MergeSort(a,l,m);
            MergeSort(a,m+1,h);
            merge(a,l,m,h);
        }
    }
    public static void main(String[] args)
    {
        int a[] = {8,2,9,6,5,3,7,4};
        int n = a.length;
        MergeSort(a,0,n-1);
        for(int item : a)
        {
            System.out.print(item + " ");
        }
    }
}
