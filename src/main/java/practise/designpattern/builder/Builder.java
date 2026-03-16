package practise.designpattern.builder;

public class Builder {
    private int rollNumber;
    private String name;
    private int age;
    private String UniversityName;
    private String batch;
    private String phoneNumber;
    private double psp;
    private int gradYear;

    public int getRollNumber() {
        return rollNumber;
    }

    public Builder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public Builder setUniversityName(String universityName) {
        UniversityName = universityName;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public Builder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public double getPsp() {
        return psp;
    }

    public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public int getGradYear() {
        return gradYear;
    }

    public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }



    public static Builder getBuilder(){
        return new Builder();
    }

    public Student build() throws IllegalAccessException {
        return new Student(this);
    }

}
