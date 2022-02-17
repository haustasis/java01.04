package n1exercici3.junit;
/*
Exercici 3. Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
 Verifica el seu correcte funcionament amb un test jUnit.
 */

import java.util.Arrays;

public class Mochila {

    public static String[] prepararMochila() {
        String[] mochilaGym = { "Bambas", "Toalla", "Ropa", "Candado" };
        return mochilaGym;
    }
}
