package n1exercici3.junit;

import org.junit.Test;

public class MochilaTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void prepararMochila() {
        String carnet = Mochila.prepararMochila()[10];
    }
}