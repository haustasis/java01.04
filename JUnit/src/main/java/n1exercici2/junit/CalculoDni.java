package n1exercici2.junit;

public class CalculoDni {

    public static char letraDni (int dni){
        String chars ="TRWAGMYFPDXBNJZSQVHLCKE";
        int letra = dni % 23;
        return chars.charAt(letra);
    }

}
