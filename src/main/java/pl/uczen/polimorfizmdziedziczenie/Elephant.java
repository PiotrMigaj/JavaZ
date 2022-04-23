package pl.uczen.polimorfizmdziedziczenie;

public class Elephant extends Animal {

    public static final String MEAL_DEFAULT = "pije wodę";
    public static final String TYPE_NAME_DEFAULT = "Elephant ";

    public Elephant(String name) {
        super(TYPE_NAME_DEFAULT+name,MEAL_DEFAULT);
    }
}
