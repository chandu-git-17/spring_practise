package practise.functionalinterface;

public class Client {
    public static void main(String[] args) {
        Functional functional = (i, j) -> i + j;
        System.out.println(functional.add(5, 6));
    }
}
