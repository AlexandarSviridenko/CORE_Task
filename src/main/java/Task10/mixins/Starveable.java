package Task10.mixins;

public interface Starveable {
    default void isHungry() {
        System.out.println("not hungry");
    }
}
