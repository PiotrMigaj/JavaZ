package pl.uczen.czymsatypygeneryczne;

public class NicePrinter implements FavouriteNumber<Short>{

    @Override
    public void printFavouriteNumber(Short t) {
        System.out.println("bardzo lubię: "+t);
    }

    public <T> boolean isDifferent(T t1, T t2){
        return !t1.equals(t2);
    }
}
