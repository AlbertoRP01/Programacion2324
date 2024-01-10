package BoletinObjetos4_1;

public class Maquina {
    public final int MAX_CAFE = 1;
    public final int MAX_LECHE = 1;
    public final int MAX_VASOS = 1;
    public static final double MONEDERO_INICIAL = 10;
    public static final double PRECIO_CAFE = 1;
    public static final double PRECIO_LECHE = 0.8;
    public static final double PRECIO_CAFE_LECHE = 1.5;

    private int dosisCafe;
    private int dosisLeche;
    private int vasosRestantes;

    private double monedero;

    public Maquina() {
        rellenarDepositos();
        this.monedero = MONEDERO_INICIAL;
    }


    public void rellenarDepositos() {
        dosisCafe = MAX_CAFE;
        dosisLeche = MAX_LECHE;
        vasosRestantes = MAX_VASOS;

    }

    public boolean puedoServirCafe() {
        return dosisCafe > 0 && vasosRestantes > 0;
    }

    public boolean puedoServirLeche() {
        return dosisLeche > 0 && vasosRestantes > 0;
    }

    public boolean puedoServirCafeLeche() {
        return dosisCafe > 0 && vasosRestantes > 0 && dosisLeche > 0;
    }

    public void servirCafe() {
        System.out.println("Aqui tienes tu café");
        dosisCafe--;
        vasosRestantes--;
    }

    public void servirLeche() {
        System.out.println("Aqui tienes tu leche");
        dosisLeche--;
        vasosRestantes--;
    }

    public void servirCafeLeche() {
        System.out.println("Aqui tienes tu café con leche ");
        dosisCafe--;
        dosisLeche--;
        vasosRestantes--;
    }

    public String darCambio(Double pago, double precio) throws MaquinaException {
        double cambio = pago - precio;
        if (pago == precio) {
            monedero = monedero + precio;
            return "Gracias por su compra, has dado el dinero justo";
        } else if (pago > precio && monedero >= (cambio)) {
            monedero = monedero  + precio;
            return  String.format("Recoge tu cambio de %.2f €", cambio);
        } else if (precio > pago) {
            throw new MaquinaException("pago insuficiente");
        } else {
            throw new MaquinaException("Disculpe, no tenemos cambio");
        }

    }

    @Override
    public String toString() {
        return "Maquina{" +
                "dosisCafe=" + dosisCafe +
                ", dosisLeche=" + dosisLeche +
                ", vasosRestantes=" + vasosRestantes +
                ", monedero=" + monedero +
                '}';
    }
}
