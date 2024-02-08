package boletin5_1_Ejercicio3;

import Boletin5_2_Ejercicio1.CreableEstadisticas;

public class ArrayP implements CreableEstadisticas {
    public static final int NUM_MAX_PERSONAJES = 100;

    private Personaje[] personajes;

    public ArrayP() {
        this.personajes = new Personaje[NUM_MAX_PERSONAJES];
    }

    @Override
    public double minimo() throws PersonajeException {
        int cont = 0;
        double valorVidaMin = Personaje.VIDA_MAX;
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                cont++;
                if (valorVidaMin > personajes[i].getVidaActual()) {
                    valorVidaMin = personajes[i].getVidaActual();
                }

            }
        }
        if (cont == 0){
            throw new PersonajeException("No hay personajes guardados");
        }
        return valorVidaMin;

    }

    @Override
    public double maximo() throws PersonajeException {
        int cont = 0;
        double valorVidaMax = Personaje.VIDA_MIN;
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                cont++;
                if (valorVidaMax < personajes[i].getVidaActual()) {
                    valorVidaMax = personajes[i].getVidaActual();
                }

            }
        }
        if (cont == 0){
            throw new PersonajeException("No hay personajes guardados");
        }
        return valorVidaMax;
    }

    @Override
    public double media() throws PersonajeException {
        int cont = 0;
        double valorVida = 0;
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                cont++;
                if (valorVida < personajes[i].getVidaActual()) {
                    valorVida += personajes[i].getVidaActual();
                }

            }
        }
        if (cont == 0){
            throw new PersonajeException("No hay personajes guardados");
        }
        return valorVida/cont;
    }
}
