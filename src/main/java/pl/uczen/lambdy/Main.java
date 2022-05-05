package pl.uczen.lambdy;

public class Main {

    public static void main(String[] args) {
        hello("Lambdy!", new Helloable() {
            @Override
            public void sayHello() {
                System.out.println("Interface Hello! Amazing!");
            }
        });

        String amazingHello = "Hello Peter!";

        hello("Cześć Piotr", ()->System.out.println(amazingHello));
    }

    public static void hello(String s, Helloable helloable) {
        System.out.println(s);
        helloable.sayHello();
    }

}
