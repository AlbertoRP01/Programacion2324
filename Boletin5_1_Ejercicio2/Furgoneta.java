package Boletin5_1_Ejercicio2;

public class Furgoneta extends Vehiculo {
    private static final double PRECIO_KILO = 0.5;
    private int pma;

    public Furgoneta(String matricula, Gama gama, int pma) {
        super(matricula, gama);
        this.pma = pma;
    }

    public void setPma(int pma) throws VehiculoException{
        if (pma < 1){
            throw new  VehiculoException("PMA invalido");
        }
        this.pma = pma;
    }

    @Override
    public double getPrecioDiario() {
        return getGama().getPrecioDia() + PRECIO_KILO * pma;
    }


}
