package Boletin4_3;

public class Carta {
    private String palo;
    private String numero;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public String getNumero() {
        return numero;
    }
}
