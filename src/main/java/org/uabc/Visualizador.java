package org.uabc;

public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        if (c == null || p == null) {
            System.out.println("Error: Carta o Posición no válida.");
            return;
        }

        System.out.println("Desplegando carta en Posición (" + p.getX() + ", " + p.getY() + ")");
        System.out.printf("| %-7s |\n", c.getValor());
        System.out.printf("| %-7s |\n", c.getPalo());


    }
}
