package practise.designpattern.builder;

public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String UniversityName;
    private String batch;
    private String phoneNumber;
    private double psp;
    private int gradYear;



    public Student(Builder builder) throws IllegalAccessException {
        if(builder.getGradYear() < 2022){
            throw new IllegalAccessException("gard year should be greater than 2022");
        }
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.name = builder.getName();
        this.phoneNumber = builder.getPhoneNumber();

    }
}
