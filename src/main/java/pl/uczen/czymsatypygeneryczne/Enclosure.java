package pl.uczen.czymsatypygeneryczne;

import java.util.ArrayList;
import java.util.List;

public class Enclosure<T extends Animal> {

    private List<T> t = new ArrayList<>();

    public List<T> getT() {
        return this.t;
    }

    public void addT(T t) {
        this.t.add(t);
    }


}
