package pl.uczen.polimorfizmstatyczny;

public class Shark extends Animal {

    public static final String MEAL_DEFAULT = "tuńczyka";
    public static final String TYPE_NAME_DEFAULT = "Shark ";

    public Shark(String name) {
        super(TYPE_NAME_DEFAULT+name,MEAL_DEFAULT);
    }

    @Override
    public void eat() {
        System.out.println(TYPE_NAME_DEFAULT+" "+this.name+" je "+this.meal);
    }
}
