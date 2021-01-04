package strings;

public class Strings {
    public static void main(String[] args)
    {
        String a = "Tarush            ";
        String b = "Tarush";
        String c = "";
        String d = a + " Kaistha";
        System.out.println(d);
        System.out.println(a.concat(" Kaistha"));
        System.out.println(a.replace("Tarush","Tushar"));
        System.out.println(a.replace('r','e'));
        System.out.println(a.charAt(2));
        System.out.println(a.length());
        System.out.println(a.substring(2));
        System.out.println(a.substring(1,4));
        System.out.println(a.equals(b));
        System.out.println(c.isEmpty());
        String books = "Alchemist,GhostStories,GhoseBumps,Gladiators";
        String allBooks[] = books.split("i");
        for (String book : allBooks)
        {
            System.out.println(book);
        }
        System.out.println(books.indexOf('G'));
        System.out.println(a.toLowerCase());
        System.out.println(d.toUpperCase());
        System.out.println(a.trim());
    }
}
