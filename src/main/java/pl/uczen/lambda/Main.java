package pl.uczen.lambda;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Piotr",33);

        Employee employee = new Employee(person,30_000,"Junior developer");

    }

}
