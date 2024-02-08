package Boletin5_2_Ejercicio2;

public class Linea extends Forma{

    private double longitud;

    public Linea(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public double calcularArea() throws FormaException {
        throw new FormaException("La línea no puede representar su área");
    }
}
