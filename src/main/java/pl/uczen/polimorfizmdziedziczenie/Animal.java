package pl.uczen.polimorfizmdziedziczenie;

public abstract class Animal implements Feedable{
    String name = "";
    String meal = "";

    public Animal(String name,String meal) {
        this.name = name;
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.printf("Mniam");
    }
}
