package org.uabc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    public void testCrearPersona() {
        Persona persona = new Persona("Carlos");
        assertEquals("Carlos", persona.getNombre());
    }
}