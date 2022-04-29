package pl.uczen.test;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Piotr",32);



        Human2 human2 = new Human("Piotr");

        human2.saySth();

        Human2 human21 = new Employee("Piotr",32);

        human21.saySth();


    }

}
