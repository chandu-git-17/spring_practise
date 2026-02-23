package practise.exceptions;

import java.util.List;
import java.util.Optional;

public class ExceptionPractise {
    public int number1;
    public int number2;
    public List<Integer> list;

    public int print() {
        return number1 / number2;
    }

    public Optional<Integer> arrayCalculations(){
        return list.stream().reduce(Integer::sum);
        //can be done in for loop, bit done in streams for practise.
    }

}