package BoletinObjetos4_1;

public class Cuenta {
    private int numIngreso;
    private int numReintegro;
    private double saldo;


    public Cuenta(double saldoInicial) {
        setSaldo(saldoInicial);
        this.numReintegro = 0;
        this.numIngreso = 0;
    }

    private void setSaldo(double saldoInicial) {

        if (saldoInicial < 0) {
            saldo = saldoInicial;

        } else {
            System.out.println("El saldo Inicial no puede ser negativo");
        }


    }

    public double getSaldo() {
        return saldo;
    }


    public void hacerReintegro(double cantidadRetirar) {

        if (cantidadRetirar <= saldo && cantidadRetirar > 0) {
            saldo -= cantidadRetirar;
            numReintegro++;

        } else {
            System.out.println("No has introducido la cantidad que puedes retirar ");
        }

    }

    public void hacerIngreso(double cantidadIngreso) {
        cantidadIngreso += saldo;
        numIngreso++;

    }

    public void ConsultarCuenta() {
        System.out.println("saldo : " + saldo);
        System.out.println("El numero de ingresos es: " + numIngreso);
        System.out.println("El numero de reintegro es :" + numReintegro);
    }

}





