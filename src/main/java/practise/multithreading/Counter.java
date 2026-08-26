package practise.multithreading;

import lombok.Getter;

@Getter
public class Counter {

    public int count = 0;

    public void increment(){
        count ++;
    }

}
