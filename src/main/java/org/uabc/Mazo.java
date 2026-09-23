package org.uabc;

import java.util.Collections;

public class Mazo extends ColeccionCartas {

    public Mazo() {
        super();
        inicializarMazo();
    }

    private void inicializarMazo() {
        String[] palos = {"CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS"};
        String[] valores = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JOTA", "REINA", "REY"};

        for (String palo : palos) {
            for (String valor : valores) {
                agregarCarta(new Carta(valor, palo));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta repartir() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        }
        return null;
    }
}
