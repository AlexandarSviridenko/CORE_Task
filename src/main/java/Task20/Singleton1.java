package Task20;

import java.util.Objects;

public class Singleton1 {
    int one;
    int two;
    int three;
    static Singleton1 singleton1 = new Singleton1();

    public Singleton1() {
        one = 1;
        two = 2;
        three = 3;
    }

    public static Singleton1 instance() {
        return singleton1;
    }

    public String toString() {
        return "one: " + one +
                "\ntwo: " + two +
                "\nthree: " + three +
                "\nhash: " + Objects.hash(this);
    }
}
