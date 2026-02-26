package practise.passbyvalue;

public class Main {
    public static void main(String[] args) {
        PassByValue pbv = new PassByValue();
        pbv.number = 10;
        changeNumber(pbv);
        System.out.println(pbv.number);
        int a = 10;
        changeInteger(a);
        System.out.println(a);
    }
    public static void changeNumber(PassByValue pbv){
        pbv = new PassByValue();
        pbv.number = 12;
    }

    static void printSomething(Long id){

    }

    public static int changeInteger(int x){
        x = 20;
        return x;
    }

}
