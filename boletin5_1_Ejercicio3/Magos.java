package boletin5_1_Ejercicio3;

public class Magos extends Personaje {
    public static final int CAPACIDAD_HECHIZOS = 4;
    public static final int DAÑO_HECHIZO = 10;
    public static final int INTELIGENCIA_MIN = 17;
    public static final int FUERZA_MAX = 15;
    private String[] hechizos;

    public Magos(String nombre, Raza razas, int fuerza, int inteligencia, int vidaMaxima, int vidaActual, String[] hechizos) {
        super(nombre, razas, fuerza, inteligencia, vidaMaxima, vidaActual);
        hechizos = new String[CAPACIDAD_HECHIZOS];

    }

    public Magos(String nombre, Raza razas, int fuerza, int inteligencia, int vidaMaxima, int vidaActual) {
        super(nombre, razas, fuerza, inteligencia, vidaMaxima, vidaActual);
    }

    @Override
    public void setFuerza(int fuerza) throws Exception {
        if (fuerza > FUERZA_MAXIMA) {
            throw new PersonajeException(("Valor de fuerza no permitido"));
        }
        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws Exception {
        if (inteligencia < INTELIGENCIA_MIN) {
            throw new PersonajeException("Valor de inteligencia no permitido para ser mago");
        }
        super.setInteligencia(inteligencia);
    }

    private void aprenderHechixo(String hechizo) throws Exception {
        boolean lotengo = false;
        int posVacia = -1;

        for (int i = 0; i < hechizos.length && !lotengo; i++) {
            if (hechizo.equals(hechizos[i])) {
                lotengo = true;
            }
            if (hechizos[i] == null && posVacia == -1) {
                posVacia = i;
            }
        }

        if (lotengo) {
            throw new PersonajeException("El mago no puede aprender dos veces el  mismo hechizo ");
        }
        if (posVacia == -1) {
            throw new PersonajeException("No tiene espacio suficiente para mas hechizos");
        }
        hechizos[posVacia] = hechizo;
    }

    public void lanzaHechizo(Personaje personaje, String hechizo) throws PersonajeException {

        int posHechizo = -1;
        for (int i = 0; i < hechizos.length && posHechizo == 1; i++) {

            if (hechizo.equals(hechizos[i])) {
                posHechizo = i;
            }
        }
        if (posHechizo == -1) {
            throw new PersonajeException("El mago no conoce ese hechizo");
        }
        if (this == personaje) {
            throw new PersonajeException("No puedes atacarte a ti mismo");
        }
        if (personaje.getVidaActual() == 0) {
            throw new PersonajeException("El personaje esta muerto");
        }
    }

}
