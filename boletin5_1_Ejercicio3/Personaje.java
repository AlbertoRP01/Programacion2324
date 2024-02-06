package boletin5_1_Ejercicio3;

public class Personaje {
    public static final int FUERZA_MAXIMA = 17;
    public static final int FUERZA_MIN = 150;
    public static final int VIDA_MIN = 1;
    public static final int VIDA_MAX = 100;
    public static final int INTELIGENCIA_MAX = 100;
    public static final int INTELIGENCIA_MIN = 17;

    private String nombre;
    private Raza razas;

    private int fuerza;
    private int inteligencia;

    private int vidaMaxima;
    private int vidaActual;


    public Personaje(String nombre, Raza razas, int fuerza, int inteligencia, int vidaMaxima) throws PersonajeException {
        this.nombre = nombre;
        this.razas = razas;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) throws Exception {
        if (fuerza > FUERZA_MAXIMA || fuerza < FUERZA_MIN) {
            throw new Exception("El valor de la fuerza no valido");

        }
        this.fuerza = fuerza;
    }

    public Raza getRazas() {
        return razas;
    }

    public void setRazas(Raza razas) {
        this.razas = razas;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) throws Exception {
        if (inteligencia > INTELIGENCIA_MAX || inteligencia < INTELIGENCIA_MIN) {

            throw new Exception("El valor de la inteligencia no valido");
        }
        this.inteligencia = inteligencia;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) throws Exception {
        if (VIDA_MAX < VIDA_MIN || fuerza > VIDA_MAX) {
            throw new PersonajeException("");
        }
        this.vidaMaxima = vidaMaxima;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        if (vidaActual < VIDA_MIN) {
            this.vidaActual = VIDA_MIN;
        } else if (vidaActual > VIDA_MAX) {
            this.vidaActual = VIDA_MAX;
        } else

            this.vidaActual = vidaActual;
    }

}
