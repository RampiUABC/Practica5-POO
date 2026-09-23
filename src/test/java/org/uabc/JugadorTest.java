package org.uabc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JugadorTest {

    private Jugador jugador;

    @BeforeEach
    public void setUp() {
        jugador = new Jugador("Ana");
    }

    @Test
    public void testNombreHeredado() {
        assertEquals("Ana", jugador.getNombre());
    }

    @Test
    public void testRecibirCarta() {
        Carta carta = new Carta("REY", "DIAMANTES");
        jugador.recibirCarta(carta);

        assertDoesNotThrow(() -> jugador.mostrarMano());
    }

    @Test
    public void testRecibirCartaNula() {
        jugador.recibirCarta(null);

        assertDoesNotThrow(() -> jugador.mostrarMano());
    }
}