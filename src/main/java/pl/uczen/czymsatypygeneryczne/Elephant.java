package pl.uczen.czymsatypygeneryczne;

public class Elephant extends Animal {

    public static final String MEAL_DEFAULT = "wodę";
    public static final String TYPE_NAME_DEFAULT = "Elephant ";

    public Elephant(String name) {
        super(name,MEAL_DEFAULT);
    }

    @Override
    public void eat() {
        System.out.println(TYPE_NAME_DEFAULT+" "+this.name+" pije "+this.meal);
    }
}
