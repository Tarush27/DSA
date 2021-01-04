package com.company;

public class Merging {
    //merging two list
    public static void merging(int a[],int b[],int m,int n,int c[])
    {
        int i,j,k;
        i=j=k=0;
        while(i<m && j<n)
        {
            if(a[i] < b[j])
            {
                c[k++] = a[i++];
            }
            else{
                c[k++] = b[j++];
            }
        }
        for(;i<m;i++)
        {
            c[k++] = a[i];
        }
        for(;j<n;j++)
        {
            c[k++] = b[j];
        }
    }
    public static void main(String[] args)
    {
        int a[] = {2,10,18,20,23};
        int m = a.length;
        int b[] = {4,9,19,25};
        int n = b.length;
        int c[] = new int[m+n];
        merging(a,b,m,n,c);
        for (int item : c)
        {
            System.out.print(item + " ");
        }
    }
}
