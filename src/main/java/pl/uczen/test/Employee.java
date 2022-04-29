package pl.uczen.test;

public class Employee extends Human{

    private int age;

    public Employee(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void saySth() {
        super.saySth();
        System.out.println(this.age);
    }
}
