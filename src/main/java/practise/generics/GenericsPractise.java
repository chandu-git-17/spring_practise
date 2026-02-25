package practise.generics;


import java.util.List;

// Generic class
public class GenericsPractise <Integer, T extends List, U>{
    public Integer printInteger;
    public T printVariable;
    public U genericVariable;
    GenericsPractise(Integer printInteger, T printVariable, U genericVariable){
        this.printInteger = printInteger;
        this.printVariable = printVariable;
        this.genericVariable = genericVariable;
    }
    public void print(){
        System.out.println(printInteger + " " + printVariable + " " + genericVariable);
    }

    public <Integer, U> void genericPrint(){
        System.out.println(printInteger + " " + genericVariable);
    }

}

// <T extends Integer> means the parameter T is of list class, and it can also implement interfaces,
// we have to use "extends" only for interfaces also.