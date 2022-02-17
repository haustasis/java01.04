package n1exercici1.junit;

import java.util.ArrayList;

public class Any {

    private ArrayList<String> anyArr;

    public Any(){
        this.anyArr = new ArrayList<>();
    }

    public ArrayList<String> getAnyArr() {
        return anyArr;
    }

    public void addTotsMesos() {
        getAnyArr().add("Gener");
        getAnyArr().add("Febrer");
        getAnyArr().add("Març");
        getAnyArr().add("Abril");
        getAnyArr().add("Maig");
        getAnyArr().add("Juny");
        getAnyArr().add("Juliol");
        getAnyArr().add("Agost");
        getAnyArr().add("Setembre");
        getAnyArr().add("Octubre");
        getAnyArr().add("Novembre");
        getAnyArr().add("Desembre");
    }

    public int getArrSize() {
        return getAnyArr().size();
    }
}


