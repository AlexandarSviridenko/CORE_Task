package Task19;

import java.util.concurrent.Callable;

public class FourthThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " started");
        System.out.println(Thread.currentThread().getName() + " finished");
        return Thread.currentThread().getName();
    }
}
