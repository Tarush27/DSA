package Collection.Queue;

public class StackUsingSingleQMainClass {
    public static void main(String ...args){
        StackUsingSingleQueue s = new StackUsingSingleQueue();
        s.push(5);
        s.push(6);
        s.pop();
        s.top();
        s.push(7);
        s.push(8);
        s.isEmpty();
    }
}
