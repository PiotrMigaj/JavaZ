package pl.uczen.test;

public class Human implements Human2 {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void saySth() {
        System.out.println(this.name);
    }
}
