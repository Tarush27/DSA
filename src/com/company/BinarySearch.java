package com.company;

public class BinarySearch {

    public static void BS(int a[], int key)
    {
        int l = 0;
        int h = a.length-1;
        int mid = (l+h)/2;
        while(l<=h){
            if (key == a[mid])
            {
                System.out.println(key + " found at the index " + mid);
                break;
            }
            else if (key < a[mid])
            {
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        if (l>h)
        {
            System.out.println("key not found");
        }
    }
    public static void main(String[] args)
    {
        int A[] = {10,20,30,40,50}; // array of elements
        int n = A.length;
        BS(A,30); // function call
        System.out.println("resultant array is : ");
        for (int i=0;i<n;i++)
        {
            System.out.print(A[i] + " ");
        }
    }
}
