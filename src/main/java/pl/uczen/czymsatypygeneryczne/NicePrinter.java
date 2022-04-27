package pl.uczen.czymsatypygeneryczne;

public class NicePrinter<T> implements FavouriteNumber<T>{

    @Override
    public void printFavouriteNumber(T t) {
        System.out.println("bardzo lubię: "+t);
    }
}
