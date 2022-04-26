package pl.uczen.polimorfizmstatyczny;

public abstract class Animal implements Feedable {
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

    public void eat(int numberOfMeals) {
        for (int i=0;i<numberOfMeals;i++){
            this.eat();
        }
    }
}
