package practise.java8;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    public int add(int a, int b);
    default void print(){
        System.out.println("Hello");
    }
}
