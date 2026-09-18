package practise.java8.defaultmethods;

public interface Vehicle {

    void start();

    default void stop(){
        System.out.println("Vehicle stopped.");
    }

}
