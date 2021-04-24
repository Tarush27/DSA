package threads;

public class ThreadDemo extends Thread{  // extending with the thread class
    public void run(){   // run function
        System.out.println("thread runs");
    }
    public static void main(String ...args){ // main function
        ThreadDemo td = new ThreadDemo();  // creating object of the thread class
        td.start();   // calling start method to start thread coming into runnable state
        td.run();
        System.out.println("welcome to thread");
    }
}
