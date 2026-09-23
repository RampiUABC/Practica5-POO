package org.uabc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColeccionCartasTest {

    private ColeccionCartas coleccion;

    @BeforeEach
    public void setUp() {
        coleccion = new ColeccionCartas();
    }

    @Test
    public void testColeccionInicialVacia() {
        assertEquals(0, coleccion.getCantidad());
        assertTrue(coleccion.getCartas().isEmpty());
    }

    @Test
    public void testAgregarCarta() {
        Carta carta = new Carta("7", "TREBOLES");
        coleccion.agregarCarta(carta);

        assertEquals(1, coleccion.getCantidad());
        assertEquals(carta, coleccion.getCartas().get(0));
    }
}