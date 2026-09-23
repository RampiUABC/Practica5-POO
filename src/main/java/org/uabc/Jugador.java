package org.uabc;

public class Jugador extends Persona {
    private ColeccionCartas mano;

    public Jugador(String nombre) {
        super(nombre);
        this.mano = new ColeccionCartas();
    }

    public void recibirCarta(Carta carta) {
        if (carta != null) {
            mano.agregarCarta(carta);
        }
    }

    public void mostrarMano() {
        System.out.print(nombre + " tiene: ");
        for (Carta carta : mano.getCartas()) {
            System.out.print(carta + " ");
        }
        System.out.println();
    }
}
