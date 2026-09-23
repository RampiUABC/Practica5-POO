package org.uabc;

import java.util.ArrayList;
import java.util.List;

public class ColeccionCartas {
    protected List<Carta> cartas;

    public ColeccionCartas() {
        this.cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public int getCantidad() {
        return cartas.size();
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void mostrarPrimeras(int n) {
        int limite = Math.min(n, cartas.size());
        for (int i = 0; i < limite; i++) {
            System.out.print(cartas.get(i) + " ");
        }
        System.out.println();
    }
}
