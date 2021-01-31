package com.company;

public class RemoveDuplicates {
    public static void main(String[] args){
        int a[] = {1,2,2,3,4,4,5};
        int n = a.length;
//        int a1[] = new int[a.length];// array that stores unique elements
        int j = 0;// for counting unique elements of the array
        for (int i = 0;i<n-1;i++){
            if (a[i] != a[i+1]){
                a[j++] = a[i];
            }
        }
        a[j++] = a[n-1];
        for(int k = 0;k < j;k++){
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }
}
