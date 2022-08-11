package Task20;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for(Thread thread: initThread()){
            thread.start();
            thread.join();
        }
    }

    public static Thread[] initThread(){
        Thread[] threads = new Thread[3];
        Runnable runnable = () -> System.out.println(Singleton2.instance());

        threads[0] = new Thread(runnable);
        threads[1] = new Thread(runnable);
        threads[2] = new Thread(runnable);

        return threads;
    }
}

