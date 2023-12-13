package EjemploEduardo;

import java.time.LocalDateTime;

public class Avion {
    public static final int NUM_MAX_REVISIONES = 10;
    private String marca;
    private String modelo;
    private double consumo;

    private Deposito deposito;
    private Revisiones[] revisiones;

    public Avion(String nombre, String modelo, double consumo, Deposito deposito) {
        this.marca = nombre;
        this.modelo = modelo;
        this.consumo = consumo;
        this.deposito = deposito;
        this.revisiones = new Revisiones[NUM_MAX_REVISIONES];
    }

    public void addRevision(Revisiones revision) {
        for (int i = 0; i < NUM_MAX_REVISIONES; i++) {
            if (this.revisiones[i] == null) {
                this.revisiones[i] = revision;
                break;
            }
        }

    }

    public Revisiones getUltimaRevision() {
        for (int i = NUM_MAX_REVISIONES - 1; i > 0; i--) {
            if (revisiones[i] != null) {
                return revisiones[i];

            }
        }
        return null;
    }

    //medida en km
    public boolean puedeVolar(double distancia) {
        Revisiones ultimaRevision = getUltimaRevision();
        double distanciaAlcanzable = deposito.getCantidadActual()  / consumo;
        if (distanciaAlcanzable >= distancia && getUltimaRevision().isEstado() && ultimaRevision.getFecha().plusMonths(ultimaRevision.getPeriodoValidez()).isAfter(LocalDateTime.now()))
            ;
        return true;
    }

    @Override
    public String toString() {
        return "el avion de la marca" + marca + "Con el modelo " + modelo + "Tiene un condumo de "
                + consumo + "litros por kilometro " + deposito + ". Su ultima revision fue el  " +
                getUltimaRevision();
    }



}
