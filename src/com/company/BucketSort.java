package com.company;
import java.util.Collections;
import java.util.ArrayList;
public class BucketSort {
    public static void bucketSort(float a[],int n)
    {
        //base condition chek
        if (n<=0)
            return;
        // array list created of float type
        ArrayList<Float>[] bucket = new ArrayList[n];
        // creating empty buckets
        for (int i=0;i<n;i++)
        {
            bucket[i] = new ArrayList<Float>();
        }
        // adding elements to the empty buckets
        for (int i=0;i<n;i++)
        {
            int bi = (int) a[i]*n;
            bucket[bi].add(a[i]);
        }
        // sorting the array
        for (int i=0;i<n;i++)
        {
            Collections.sort(bucket[i]);
        }
        // creation of new array and then moving the items in their respective buckets
        int index=0;
        for (int i=0;i<n;i++)
        {
            for (int j=0,size = bucket[i].size();j<size;j++)
            {
                a[index++] = bucket[i].get(j);
            }
        }
    }
    // driver code
    public static void main(String[] args)
    {
        float a[] = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
                (float) 0.51 };
        // calling of the function.
        bucketSort(a,7);
        for (float item: a)
        {
            System.out.print(item + " ");
        }
    }
}
