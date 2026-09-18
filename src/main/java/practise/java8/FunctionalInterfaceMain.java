package practise.java8;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        FunctionalInterface output = (a, b) -> a + b;
        int a = 10;
        int b = 20;
        System.out.println(output.add(a, b));
    }
}
