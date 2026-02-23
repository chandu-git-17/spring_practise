package practise.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ExceptionPractise ep = new ExceptionPractise();
        ep.number1 = 5;
        ep.number2 = 1;
        try{
            System.out.println(ep.print());
        }
        catch(ArithmeticException a){
            System.out.println("Arithmetic exception occurred");
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(null);
        ep.list = list;

        try{
            if(ep.arrayCalculations().isPresent()){
                System.out.println(ep.arrayCalculations().get());
            }
        }
        catch (ArithmeticException ae){
            System.out.println("Arithmetic exception occurred");
        }
        catch (NullPointerException n){
            System.out.println("Null Pointer Exception");
        }
    }
}
