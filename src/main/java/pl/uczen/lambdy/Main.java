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


        init("Super lambdy",i->{
            for (int j=0;j<i;j++){
                System.out.println(j);
            }
        });
    }

    public static void hello(String s, Helloable helloable) {
        System.out.println(s);
        helloable.sayHello();
    }

    public static void init(String s, Initiable initiable){
        System.out.println(s);
        initiable.init(45);
    }

}
