package Task19;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
       startFirstThread();
       startSecondThread();
       startThirdThread();
       startFourthThread();
    }

    private static void startFirstThread() {
        Thread firstThread = new FirstThread("FirstThread");
        firstThread.setDaemon(true);
        firstThread.start();
    }

    private static void startSecondThread() {
        Thread secondThread = new Thread(new SecondThread("SecondThread"));
        secondThread.start();
    }

    private static void startThirdThread() {
        Thread thirdThread = new Thread(() -> {
            System.out.println("ThirdThread started");
            System.out.println("ThirdThread finished");
        });
        thirdThread.start();
    }

    private static void startFourthThread() {
        Callable<String> task = (() -> {
            System.out.println("FourthThread started");
            System.out.println("FourthThread finished");
            return "FourthThread";
        });
        FutureTask<String> future = new FutureTask<>(task);

        new Thread(future).start();
    }

}