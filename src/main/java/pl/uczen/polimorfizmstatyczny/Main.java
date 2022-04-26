package pl.uczen.polimorfizmstatyczny;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Feedable hungryGuy = new Elephant("Piotr");

        List<Animal> animals = new ArrayList<>();
        animals.add(new Elephant("Edward"));
        animals.add(new Elephant("Piotr"));
        animals.add(new Giraffe("Basia"));
        animals.add(new Shark("Tomek"));

        animals.forEach(animal -> animal.eat(3));



    }
}
