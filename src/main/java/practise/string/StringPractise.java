package practise.string;

public class StringPractise {

    public static void main(String[] args) {
        //Strings are immutable.
        String s = "Hello";
        //New string is created here, old string is not modified.
        System.out.println(s.concat(" world"));
        System.out.println(s);
        //If we use new keyword, string is not created in string pool.
        String check1 = new String("Hello");
        //Even if you want to include it to string pool, then use intern to make string to create in string pool.
        String check2 = new String("Hello").intern();
        //This is false because check1 is not in string pool, so obj references are different, so == is false.
        System.out.println(check1 == check2);
        String check3 = "Hello";
        //here check2 is created using new, but it is string pool because of intern method, so reference is same.
        // "==" results in true.
        System.out.println(check3 == check2);
        System.out.println(check1.equals(check2));

    }

}
