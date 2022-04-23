package pl.uczen.polimorfizmdziedziczenie;

public class Shark extends Animal {

    public static final String MEAL_DEFAULT = "je tuńczyka";
    public static final String TYPE_NAME_DEFAULT = "Shark ";

    public Shark(String name) {
        super(TYPE_NAME_DEFAULT+name,MEAL_DEFAULT);
    }
}
