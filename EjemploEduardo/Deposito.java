package EjemploEduardo;

public class Deposito {
    private double capacidadMaxima;
    private double cantidadActual;

    public Deposito(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
    }


    public double getCantidadActual() {

        return cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return cantidadActual / capacidadMaxima * 100 + "% de un deposito " + capacidadMaxima + " % litros";

    }
}
