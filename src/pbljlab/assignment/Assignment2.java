package pbljlab.assignment;

public class Assignment2 {
    public static void main(String[] args){
        Author author = new Author("Arpan Das", "arp14@yahoo.com", 'M');
        Book book = new Book("Java Fundamentals", author, 199.0, 500);
        System.out.println(author);
        System.out.println(book);
    }
}
