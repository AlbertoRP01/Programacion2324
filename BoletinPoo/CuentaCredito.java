package BoletinPoo;

public class CuentaCredito extends Cuenta {
    public static final double CREDITO_DEFAULT = 100;
    public static final double CREDITO_MAXIMO = 300;
    private double credito;
    private final double limiteCreditoUsuario;

    public CuentaCredito(double saldo, double credito) throws CuentaCreditoException {
        super(saldo);
        setCredito(credito);
        this.limiteCreditoUsuario = credito;
    }

    public CuentaCredito(double credito) throws CuentaCreditoException {
        this.limiteCreditoUsuario = credito;
        setCredito(credito);
    }

    public CuentaCredito() {
        this.limiteCreditoUsuario = CREDITO_DEFAULT;
        this.credito = CREDITO_DEFAULT;
    }


    public double getCredito() {
        return credito;
    }

    private void setCredito(double credito) throws CuentaCreditoException {

        if (credito > CREDITO_MAXIMO) {

            throw new CuentaCreditoException("Has superado el limite del credito admitido");
        }
        if (credito < 0) {
            throw new CuentaCreditoException("No es valido el credito");
        }
        this.credito = credito;
    }

    @Override
    public void ingresarDinero(double dineroAIngresar) throws CuentaException {

        if (dineroAIngresar <= 0) {
            throw new CuentaException("No puedes introducir una cantidad negativa ");
        }
        double direfenciaCredito = limiteCreditoUsuario - credito;
        if (credito < limiteCreditoUsuario) {

            if (dineroAIngresar >= direfenciaCredito) {
                credito = limiteCreditoUsuario;
                dineroAIngresar -= direfenciaCredito;

            } else {
                credito += dineroAIngresar;
                dineroAIngresar = 0;
            }

        }
        if (dineroAIngresar > 0) {
            super.ingresarDinero(dineroAIngresar);
        }

    }

    @Override
    public void sacarDinero(double dineroASacar) throws CuentaException, CuentaCreditoException {
        if (dineroASacar > getSaldo() + getCredito()) {
            throw new CuentaCreditoException("Has llegado a su limite de credito");

        }
        if (dineroASacar <= getSaldo()) {
            super.sacarDinero(dineroASacar);
        } else {
            dineroASacar -= getSaldo();
            super.sacarDinero(getSaldo());
            this.credito -= dineroASacar;
        }

    }

    @Override
    public String toString() {
        return "CuentaCredito{" +
                "credito=" + credito +
                ", limiteCreditoUsuario=" + limiteCreditoUsuario +
                "} " + super.toString();
    }
}

