package Boletin5_1_Ejercicio2;

public class Coche extends Vehiculo {
    private Combustible  combustible;

    public Coche(String matricula, Gama gama, Combustible combustible) {
        super(matricula, gama);
        this.combustible = combustible;
    }

    @Override
    public double getPrecioDiario() {
        return getGama().getPrecioDia() + combustible.getPrecioCombustible();
    }
}
