package org.uabc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MazoTest {

    private Mazo mazo;

    @BeforeEach
    public void setUp() {
        mazo = new Mazo();
    }

    @Test
    public void testMazoInicialCon52Cartas() {
        assertEquals(52, mazo.getCantidad());
    }

    @Test
    public void testRepartirCarta() {
        Carta cartaRepartida = mazo.repartir();

        assertNotNull(cartaRepartida);
        assertEquals(51, mazo.getCantidad());
    }

    @Test
    public void testRepartirMazoVacio() {
        for (int i = 0; i < 52; i++) {
            mazo.repartir();
        }

        assertEquals(0, mazo.getCantidad());
        assertNull(mazo.repartir());
    }
}