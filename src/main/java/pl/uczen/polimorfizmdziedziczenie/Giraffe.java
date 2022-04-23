package pl.uczen.polimorfizmdziedziczenie;

public class Giraffe extends Animal {

    public static final String MEAL_DEFAULT = "je paszę";
    public static final String TYPE_NAME_DEFAULT = "Giraffe ";


    public Giraffe(String name) {
        super(TYPE_NAME_DEFAULT+name,MEAL_DEFAULT);
    }
}
