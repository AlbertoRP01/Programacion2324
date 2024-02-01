package Boletin5_1_Ejercicio2;

public enum Gama {
    Baja(30), Media(40), ALTA(50);
    private double precioDia;

    Gama(double precioDia) {
        this.precioDia = precioDia;
    }

    public double getPrecioDia() {
        return precioDia;
    }

}
