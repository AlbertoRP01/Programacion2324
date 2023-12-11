package Boletin4_3;

import java.util.Random;

public class Juego {

    private Carta[] baraja;
    private int cartasRepartidas;

    public Juego(Carta[] palo) {
        this.baraja = baraja;
        cartasRepartidas = 0;
    }

    public Carta[] getBaraja() {
        return baraja;
    }

    public void mostrarbaraja() {
        for (int i = cartasRepartidas; i < baraja.length; i++) {
            System.out.println(baraja[i]);
        }
    }

    public void barajar() {
        Random r = new Random();
        Carta cartaCambiar;
        for (int i = cartasRepartidas; i < baraja.length; i++) {
            int posicionAleatoria = r.nextInt(cartasRepartidas, baraja.length);


            cartaCambiar = baraja[i];
            baraja[i] = baraja[posicionAleatoria];
            baraja[posicionAleatoria] = cartaCambiar;


        }
    }

    public void repartirCartas(int numJugadores, int numCartas) throws JuegoExcception {
        if (baraja.length - cartasRepartidas >= (numCartas * numJugadores)) {
            for (int i = 0; i < numJugadores; i++) {
                System.out.println("repartiendo cartas al jugador" + (i + 1));
                for (int j = 1; j < numCartas; j++)
                    System.out.println("\t" + baraja[numCartas * i + j + cartasRepartidas]);
                {

                }
            }
        } else
            throw new JuegoExcception("No hay suficientes cartas para repartir ");
    }
}
