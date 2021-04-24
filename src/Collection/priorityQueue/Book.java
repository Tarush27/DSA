package Collection.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Book implements Comparable<Book>{

    int id;
    String book,author;

    public Book(int id, String book, String author) {
        this.id = id;
        this.book = book;
        this.author = author;
    }

    @Override
    public int compareTo(Book o) {
        if (id > o.id){
            return 1;
        }
        else if (id < o.id){
            return -1;
        }
        else {
            return 0;
        }
    }

    public static void main(String ...args){
        Queue<Book> q = new PriorityQueue<>();
        Book b1 = new Book(1,"Effective Java","James");
        Book b2 = new Book(2,"Atomic Habits","Peter");
        Book b3 = new Book(3,"52 Shades","Cook");
        q.add(b1);
        q.add(b2);
        q.add(b3);
        for (Book o : q){
            System.out.println(o.id + " " + o.book + " " + o.author);
        }

        q.remove();
//        Iterator<Book> iterator = q.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        for (Book o : q){
            System.out.println(o.id + " " + o.book + " " + o.author);
        }
//        System.out.println(q.peek());
        for (Book o : q){
            System.out.println(o.id + " " + o.book + " " + o.author);
        }
    }
}
