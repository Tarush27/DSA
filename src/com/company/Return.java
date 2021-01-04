package com.company;

public class Return {

    static int[] get(){
        return new int[]{1,2,3,4,5};
    } // used get() method with integer array & then returned the integer array without declaring it.
    public static void main(String[] args){
        int a[] = get(); // calling the function from which the values of array will be returned.
        for(int i:a){
            System.out.print(i + " ");
        }
    }
}
