package Boletin5_1_Ejercicio2;

public class Microbus extends Vehiculo {
    public static final double PRECIO_PLAZA = 5;
    private int numPlazas;

    public Microbus(String matricula, Gama gama, int numPlazas) throws VehiculoException {
        super(matricula, gama);
        setNumPlazas(numPlazas);
    }

        public void setNumPlazas(int numPlazas) throws VehiculoException {
            if (numPlazas < 1) {
               throw new VehiculoException("Numero de plazas incorrecto");
            }
            this.numPlazas = numPlazas;
        }

    @Override
    public double getPrecioDiario() {
        return getGama().getPrecioDia() + numPlazas * PRECIO_PLAZA;
    }
}



