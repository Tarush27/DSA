package Collection.arrays;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args){
        int a[] = {3,4,5,6};
        System.out.println("Elements in the list are :" + Arrays.asList(a));// to convert array elements into list
        int b[] = {2,5,1,6,4};
        Arrays.sort(b);
        System.out.println("Key found at index " + Arrays.binarySearch(b,4));// to search an element using binary search
        int c[] = {8,3,6,4,7};
        Arrays.sort(c);// to sort the array elements
        System.out.println("Key found at index : " + Arrays.binarySearch(c,0,4,7));// to perform binary search but in a specified range
        int d[] = {-20,10};
        int e[] = {0,25};
        System.out.println("Number of comparisons : " + Arrays.compare(d,e));// for comparing two arrays lexicographically
        int f[] = {10,20,30,40,50};
        System.out.println(Arrays.toString(f));// to convert resultant array into string
        System.out.println(Arrays.toString(Arrays.copyOf(f,6)));//to make a copy of the array with new length specified accordingly the default value id added
        int g[] = {10,20,30,40,50};
        System.out.println(Arrays.toString(g));
        System.out.println(Arrays.toString(Arrays.copyOfRange(g,1,5)));// copying the elements of specified array in a particular range
        int h[][] ={ {1,2,3,4,5} };
        int i[][] = {{1,2,3,4}};
        System.out.println(Arrays.deepEquals(h,i));// deeply check the equality of both the dda's of object type..
        int j[] = {2,4,6,8,10,12};
        Arrays.fill(j,5);// to fill the entire array with a specified value of data type in a specified range
        Arrays.fill(j,2,5,3);// to fill only the specified part of the array within a given range
        System.out.println(Arrays.toString(j));
    }
}
