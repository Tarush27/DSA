package oops;

public abstract interface Youtuber{
    public abstract void videos();
    default void hi()
    {
        System.out.println("l");
    }
}
