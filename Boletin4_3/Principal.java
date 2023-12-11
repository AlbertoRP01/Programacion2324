package Boletin4_3;

public class Principal {
    public static final String[] palos = {"Espadas", "Oros", "Bastos", "Copas"};
    public static final int CARTAS_POR_PALO = 10;

    public static void main(String[] args) {

        Carta[] baraja = new Carta[palos.length * CARTAS_POR_PALO];
        for (int i = 0; i <= CARTAS_POR_PALO; i++) {
            for (int j = 0; j <= CARTAS_POR_PALO; j++) {

                baraja[i * CARTAS_POR_PALO + j] = new Carta(palos[i], String.valueOf(j + 1));
            }

        }
        Juego j = new Juego(baraja);
        try {
            j.repartirCartas(3, 4);
        } catch (JuegoExcception e) {
            System.out.println(e.getMessage());
        }

        //j.reparirCartas(3,4)
      /*  j.mostrarbaraja();
        j.barajar();
        j.repartirCartas();
        */
    }
}
