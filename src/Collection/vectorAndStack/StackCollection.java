package Collection.vectorAndStack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
//        empty function......
        boolean result = st.empty();
        System.out.println("is stack empty : " + result);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        result = st.empty();
        System.out.println("now is stack empty : " + result);
//        search function
        int loc = st.search(2);
        System.out.println("required element is : " + loc);
//        size function
        int s = st.size();
        System.out.println("size of stack is : " + s);
//        iterator method
        Iterator iterator = st.iterator();
        System.out.println("Fetched elements are : ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        for each method
        System.out.println("Fetched elements using for each method : ");
        st.forEach(integer -> {
            System.out.println(integer);
        });
//        list iterator method
        System.out.println("Fetched elements using list iterator method : ");
        ListIterator<Integer> listIterator = st.listIterator(st.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
