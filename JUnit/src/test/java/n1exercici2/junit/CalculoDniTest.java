package n1exercici2.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculoDniTest {

    @Test
    public void letraDni01() {
        assertEquals(CalculoDni.letraDni(71042966), 'Z');
        assertEquals(CalculoDni.letraDni(51500741), 'S');
        assertEquals(CalculoDni.letraDni(41543263), 'L');
        assertEquals(CalculoDni.letraDni(49224010), 'P');
        assertEquals(CalculoDni.letraDni(72188846), 'B');
        assertEquals(CalculoDni.letraDni(54299635), 'Q');
        assertEquals(CalculoDni.letraDni(11859627), 'E');
        assertEquals(CalculoDni.letraDni(20096582), 'X');
        assertEquals(CalculoDni.letraDni(35575507), 'G');
        assertEquals(CalculoDni.letraDni(48225920), 'A');
    }
}