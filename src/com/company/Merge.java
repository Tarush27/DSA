package com.company;

public class Merge {
    // merge two lists in a single array
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
    public static void mergeSort(int a[], int n)
    {
        int p,i,l,m,h;
        for(p=2;p<=n;p*=2)
        {
            for (i=0;i+p-1<n;i=i+p)
            {
                l=i;
                h=i+p-1;
                m=(l+h)/2;
                merge(a,l,m,h);
            }
        }
        if (p/2 < n)
        {
            merge(a,0,p/2-1,n);
        }
    }
    public static void main(String[] args)
    {

        int a[] = {2,5,8,12,3,6,7,10};
        int n = a.length;
        mergeSort(a,n);
        for(int item : a)
        {
            System.out.print(item + " ");
        }
    }
}
