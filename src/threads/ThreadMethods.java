package threads;

public class ThreadMethods extends Thread{

    public void run(){
//        System.out.println("thread is sleeping");
        for (int i = 0;i < 5;i++){
            try {
                Thread.sleep(500);
                System.out.println("thread is sleeping");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String ...args){
        ThreadMethods t1 = new ThreadMethods();
        ThreadMethods t2 = new ThreadMethods();
        t1.start();
//        t2.start();
//        t1.getName();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
        t1.setName("Sonu");
        System.out.println(t1);
//        t1.start();
    }
}
