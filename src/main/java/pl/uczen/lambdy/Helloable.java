package pl.uczen.lambdy;

@FunctionalInterface
public interface Helloable {

    public void sayHello();

    public static void withBody(){
        System.out.println("");
    }

}
