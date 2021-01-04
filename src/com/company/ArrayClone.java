package com.company;

public class ArrayClone {
    public static void main(String[] args){
        int a[] = {3,4,5,6};
        for(int i:a){
            System.out.print(i);
        }
        int b[] = a.clone();
        for(int j:b){
            System.out.print(j);
        }
        System.out.println(a == b);
    }
}
