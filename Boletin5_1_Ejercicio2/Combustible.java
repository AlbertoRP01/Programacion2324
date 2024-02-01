package Boletin5_1_Ejercicio2;

public enum Combustible {
    GASOLINA(3.5), DIESEL(2);

    private double precioCombustible;

    Combustible(double precioCombustible) {
        this.precioCombustible = precioCombustible;
    }

    public double getPrecioCombustible() {
        return precioCombustible;
    }
}
