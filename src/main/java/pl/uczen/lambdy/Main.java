package pl.uczen.lambdy;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

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

        System.out.println(add("Ekstra lambdy",i -> i+i));
        System.out.println(sum("Świetne lambdy", Main::doubleSum));

        calc(3,0,(integer, integer2) -> {
            try {
                System.out.println(integer/integer2);
            }catch (Exception e){
                System.out.println("Błąd" + e.getMessage().toString());
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

    public static Integer add(String s, Function<Integer,Integer> justAddable){
        System.out.println(s);
        return justAddable.apply(3);
    }

    public static Integer sum(String s, BiFunction<Integer,Integer,Integer> kingSummable){
        System.out.println(s);
        return kingSummable.apply(2,3);
    }

    public static Integer doubleSum(int i, int j){
        return i+j+i+j;
    }

    public static void calc(int i, int j, BiConsumer<Integer,Integer> biConsumer){
        System.out.println("dzielenie");
        biConsumer.accept(i,j);
    }

}
