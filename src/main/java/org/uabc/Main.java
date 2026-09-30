package org.uabc;

public class Main {
    public static void main(String[] args) {
        System.out.println("CREANDO MAZO DE 52 CARTAS");
        Mazo mazo = new Mazo();
        System.out.println("Mazo creado con " + mazo.getCantidad() + " cartas\n");

        System.out.println("MOSTRANDO PRIMERAS 5 CARTAS DEL MAZO SIN BARAJAR:");
        mazo.mostrarPrimeras(5);
        System.out.println();

        System.out.println("BARAJANDO MAZO..");
        mazo.barajar();
        System.out.println("¡Mazo barajado!\n");

        System.out.println("MOSTRANDO PRIMERAS 5 CARTAS DEL MAZO DESPUÉS DE BARAJAR:");
        mazo.mostrarPrimeras(5);
        System.out.println();

        System.out.println("CREANDO 3 JUGADORES");
        Jugador j1 = new Jugador("Dario");
        Jugador j2 = new Jugador("Ramire");
        Jugador j3 = new Jugador("Christian");
        System.out.println("Jugador 1: " + j1.getNombre());
        System.out.println("Jugador 2: " + j2.getNombre());
        System.out.println("Jugador 3: " + j3.getNombre() + "\n");

        System.out.println("REPARTIENDO 5 CARTAS A CADA JUGADOR");
        System.out.println("Repartiendo... Listo!\n");
        Jugador[] jugadores = {j1, j2, j3};
        for (int i = 0; i < 5; i++) {
            for (Jugador j : jugadores) {
                j.recibirCarta(mazo.repartir());
            }
        }

        System.out.println("MOSTRANDO CARTAS DE CADA JUGADOR:");
        for (Jugador j : jugadores) {
            j.mostrarMano();
        }
        System.out.println();

        System.out.println("CARTAS RESTANTES EN EL MAZO (DESPUÉS DE REPARTIR):");
        System.out.println("Quedan " + mazo.getCantidad() + " cartas en el mazo");
        System.out.println("Primeras 5 cartas del mazo:");
        mazo.mostrarPrimeras(5);
        System.out.println();


        // PRÁCTICA #6: DEMOSTRACIÓN DE MÉTODO DE CLASE (Visualizador y Posicion)
        System.out.println("--- PRÁCTICA 6: DESPLIEGUE CON MÉTODOS DE CLASE ---");

        // 1. Obtenemos dos cartas del mazo para probar la visualización
        Carta carta1 = mazo.repartir();
        Carta carta2 = mazo.repartir();

        // 2. Invocamos el método estático de la clase Visualizador sin hacer 'new Visualizador()'
        System.out.println("Desplegando primera carta:");
        Visualizador.carta(carta1, new Posicion(20, 40));

        System.out.println("Desplegando segunda carta en otra posición:");
        Visualizador.carta(carta2, new Posicion(100, 150));
    }
}