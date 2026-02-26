package practise.string;

public class StringPractise {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.concat(" world"));
        System.out.println(s);
        String check1 = new String("Hello");
        String check2 = new String("Hello").intern();
        System.out.println(check1 == check2);
        String check3 = "Hello";
        System.out.println(check3 == check2);
        System.out.println(check1.equals(check2));

    }

}
