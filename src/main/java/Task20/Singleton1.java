package Task20;

import java.util.Objects;

public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();
    private final int one;
    private final int two;
    private final int three;

    public Singleton1() {
        one = 1;
        two = 2;
        three = 3;
    }

    public static Singleton1 instance() {
        return INSTANCE;
    }

    public String toString() {
        return "one: " + one +
                "\ntwo: " + two +
                "\nthree: " + three +
                "\nhash: " + Objects.hash(this);
    }
}
