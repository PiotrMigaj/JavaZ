package pl.uczen.zalozeniapolimorfizmu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Elephant("Słoń Edward"));
        animals.add(new Elephant("Słoń Piotr"));
        animals.add(new Giraffe("Żyrafa Basia"));
        animals.add(new Shark("Rekin Tomek"));

        animals.forEach(animal -> {
            System.out.println(animal + " coś je");
        });

    }
}
