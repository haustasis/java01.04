package n1exercici1.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnyTest {

    @Test
    public void totsMesosTest() {
        Any any0 = new Any();
        any0.addTotsMesos();
        int totsMesos = any0.getArrSize();
        int anyMesos = 12;
        assertEquals(totsMesos, anyMesos);
    }


    @Test
    public void llistaNotNullTest() {
        Any any0 = new Any();
        any0.addTotsMesos();
        assertNotEquals(any0, null);
    }


    @Test
    public void posicioAgostTest() {
        Any any0 = new Any();
        any0.addTotsMesos();
        String agost = any0.getAnyArr().get(7);
        assertEquals(agost, "Agost");
    }
}