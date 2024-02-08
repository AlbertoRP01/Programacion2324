package Boletin5_2_Ejercicio2;

public class CirculoMovible extends Forma implements Dibujable, Animable {
private double radio;

    public CirculoMovible(double radio) {
        this.radio = radio;
    }

    @Override
    public void animar() {
        System.out.println("Animando Circulo movible");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Circulo");
    }

    @Override
    public double calcularArea() throws FormaException {
        return  2*Math.PI*radio;
    }
}
