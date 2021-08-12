package Collection.lambdas;

// functional interface
// having single abstract funs.
public interface FI {
    void abstractFun(int x);
    default void normalFun(){
        System.out.println("hello");
    }
}
