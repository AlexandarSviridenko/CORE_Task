package Task20;

import java.util.Objects;

public class Singleton2 {
    private static volatile Singleton2 INSTANCE;
    private final int one;
    private final int two;
    private final int three;

    private Singleton2() {
        one = 1;
        two = 2;
        three = 3;
    }

    public static Singleton2 instance() {
        if (INSTANCE == null) {
            synchronized (Singleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }

    public String toString() {
        return "one: " + one +
                "\ntwo: " + two +
                "\nthree: " + three +
                "\nhash: " + Objects.hash(this);
    }
}
