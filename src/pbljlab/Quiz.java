package pbljlab;

public class Quiz
{
    static int x;
    void increment()
    {
        x++;
    }
}
    class static_use
    {
        public static void main(String args[])
        {
            Quiz obj1 = new Quiz();
            Quiz obj2 = new Quiz();
            obj1.x = 0;
            obj1.increment();
            obj2.increment();
            System.out.println(obj1.x + " " + obj2.x);
        }
    }

