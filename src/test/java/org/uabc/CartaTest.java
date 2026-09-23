package org.uabc;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartaTest {

    @Test
    public void testCreacionYGetters() {
        Carta carta = new Carta("AS", "CORAZONES");

        assertEquals("AS", carta.getValor());
        assertEquals("CORAZONES", carta.getPalo());
    }

    @Test
    public void testToString() {
        Carta carta = new Carta("10", "ESPADAS");

        assertEquals("[10 de ESPADAS]", carta.toString());
    }
}