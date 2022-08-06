package Task19;

public class SecondThread implements Runnable{
    private Thread thread;

    SecondThread(String secondThread){
        thread = new Thread(this, "SecondThread");
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " started");

        System.out.println(thread.getName() + " finished");
    }
}

