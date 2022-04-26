package pl.uczen.czymsatypygeneryczne;

public class Giraffe extends Animal {

    public static final String MEAL_DEFAULT = "paszę";
    public static final String TYPE_NAME_DEFAULT = "Giraffe ";


    public Giraffe(String name) {
        super(name,MEAL_DEFAULT);
    }

    @Override
    public void eat() {
        System.out.println(TYPE_NAME_DEFAULT+" "+this.name+" je "+this.meal);
    }
}
