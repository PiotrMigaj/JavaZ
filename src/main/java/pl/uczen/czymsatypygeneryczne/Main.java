package pl.uczen.czymsatypygeneryczne;

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

//        animals.forEach(animal -> animal.eat(3));

        Enclosure<Animal> enclosureElephant = new Enclosure<>();
        enclosureElephant.addT(new Elephant("Benio"));
        System.out.println(enclosureElephant.getT());

        Enclosure<Animal> enclosure2Elephant = new Enclosure<>();
        enclosure2Elephant.addT(new Elephant("Benio"));
        enclosure2Elephant.addT(new Elephant("Jasio"));
        enclosure2Elephant.addT(new Elephant("Tomek"));
        System.out.println(enclosure2Elephant.getT());

        Enclosure<Giraffe> enclosureGiraffe = new Enclosure<>();
        enclosureGiraffe.addT(new Giraffe("Kasia"));
        System.out.println(enclosureGiraffe.getT());

        compare(enclosureElephant, enclosure2Elephant);

//        FavouriteNumber<Integer> numberPrinter = new FavouriteNumber<Integer>() {
//            @Override
//            public void printFavouriteNumber(Integer integer) {
//                System.out.println("Mój ulubiony to: "+integer);
//            }
//        };
//
//        numberPrinter.printFavouriteNumber(20);
//
//        NicePrinter nicePrinter = new NicePrinter();
//        nicePrinter.printFavouriteNumber((short) 4);
//
//        System.out.println(nicePrinter.<Animal>isDifferent(animals.get(0),animals.get(3)));

        Object o = new Object();

        String s = "text";

        o=s;

        String k = (String)o;

        Enclosure<Elephant> slonie = new Enclosure<>();
        Enclosure<Animal> zwierzeta = new Enclosure<>();

        o = slonie;



    }

    static<T extends Animal> int compare(Enclosure<T> t1, Enclosure<T> t2){
        return t1.getT().size()-t2.getT().size();
    }

}
