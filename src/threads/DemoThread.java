package threads;

public class DemoThread implements Runnable{
    public static void main(String ...args){
        DemoThread dt = new DemoThread();
        Thread t = new Thread(dt);
        t.start();
        System.out.println("welcome to thread");
    }

    @Override
    public void run() {
        System.out.println("thread is running");
    }
}
