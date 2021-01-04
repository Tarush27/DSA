package com.company;

import java.util.Scanner;

public class RemoveDups {
    public static int removeDups(int a[]){
        int index = 1;
        for(int i = 0;i< a.length-1;i++){
            if(a[i] != a[i+1]){
                a[index++] = a[i+1];
            }
        }
        return index;
    }
    public static void main(String[] args){
        int a[] = {1,1,2};
        int n = a.length;
        removeDups(a);
        for(int i = 0;i<n-1;i++){
            System.out.print(a[i] + " ");
        }
    }
}
