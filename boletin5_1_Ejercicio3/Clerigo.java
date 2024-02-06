package boletin5_1_Ejercicio3;

public class Clerigo extends Personaje {

    private static final int FUERZA_MIN = 18;
    private static final int INTELIGENCIA_MIN = 12;
    private static final int INTELIGENCIA_MAX = 16;
    public static final int CURACION = 10;
    private final String dios;

    public Clerigo(String nombre, Raza razas, int fuerza, int inteligencia, int vidaMaxima,  String dios) throws PersonajeException {
        super(nombre, razas, fuerza, inteligencia, vidaMaxima);
        this.dios = dios;
    }

    public String getDios() {
        return dios;
    }

    public void curar(Personaje personaje) throws Exception {
        if (this == personaje) {
            throw new PersonajeException("No puedes curarte a ti mismo");
        }
        if (personaje.getVidaActual() == Personaje.VIDA_MIN) {
            throw new PersonajeException("Esta muerto, no puedes revivirlo");
        }
        personaje.setVidaActual(personaje.getVidaActual() + CURACION);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clerigos{");
        sb.append("dios='").append(dios).append('\'');
       sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}

