package MensajesPersona;

public class Persona {
    private static final int TAMANO_BANDEJA = 5;
    private String Nombre;
    private Mensaje[] mensajeRecibidos;
    private Mensaje[] mensajeEnviados;

    public Persona(String nombre) {
        this.Nombre = nombre;
        this.mensajeRecibidos = new Mensaje[TAMANO_BANDEJA];
        this.mensajeEnviados = new Mensaje[TAMANO_BANDEJA];
    }

    public void enviarMensaje(Persona destinatario, String asunto, String cuerpo) throws MensajeException {
        if (destinatario == null) {
            throw new MensajeException("Destinatario erróneo");
        }
        //Comprueba de manera mas profunda  el asunto en el caso de que este vacío y te lanza la excepcion.
        if (asunto == null || asunto.isEmpty()) {
            throw new MensajeException("Asunto vacío");
        }
        //Comprueba el cuerpo en el caso de que este vacio te lanza una excepción con un mensaje que el cuerpo está vacío
        if (asunto == null || cuerpo.length() == 0) {
            throw new MensajeException("Cuerpo vacío");
        }

        if (destinatario.mensajeRecibidos[TAMANO_BANDEJA - 1] != null) {
            throw new MensajeException("La bandeja de entrada  se encuentra  llena");
        }

        if (destinatario.mensajeEnviados[TAMANO_BANDEJA - 1] != null) {
            throw new MensajeException("La bandeja de salida  se encuentra  llena");
        }

        Mensaje m = new Mensaje(asunto, cuerpo, this, destinatario);

        // Bandeja de enviados
        boolean posicionVacia = false;
        for (int i = 0; i < TAMANO_BANDEJA && !posicionVacia; i++) {
            if (mensajeEnviados[i] == null) {
                mensajeEnviados[i] = m;
                posicionVacia = true;
            }
        }

        posicionVacia = false;
        for (int i = 0; i < TAMANO_BANDEJA && !posicionVacia; i++) {
            if (mensajeRecibidos[i] == null) {
                mensajeRecibidos[i] = m;
                posicionVacia = true;
            }
        }
    }

    public void mostrarBandejaDeEntrada() {
        if (mensajeRecibidos[0] == null) {
            System.out.println("Su bandeja esta vacía");
        } else {
            for (int i = 0; i < TAMANO_BANDEJA && mensajeRecibidos[i] != null; i++) {
                System.out.println(mensajeRecibidos[i]);
            }
        }
    }

    public void mostrarBandejaDeSalida() {
        if (mensajeEnviados[0] == null) {
            System.out.println("Su bandeja de salida esta vacía");
        } else {
            for (int i = 0; i < TAMANO_BANDEJA && mensajeEnviados[i] != null; i++) {
                System.out.println(mensajeEnviados[i]);
            }
        }
    }

    public void borrarMensajeEnviadoMasAntiguo() throws MensajeException {
        if (mensajeEnviados[0] == null) {
            throw new MensajeException("Su bandeja  de salida esta vacía ");
        }
        boolean salir = false;
        for (int i = 1; i < TAMANO_BANDEJA; i++) {
            mensajeEnviados[i - 1] = mensajeEnviados[i];
            mensajeEnviados[i] = null;
            if (i < TAMANO_BANDEJA - 1 && mensajeEnviados[i + 1] == null) {
                salir = true;
            }
        }
    }
    public void borrarMensajeRecibidoMasAntiguo() throws MensajeException {
        if (mensajeRecibidos[0] == null) {
            throw new MensajeException("Su bandeja  de salida esta vacía ");
        }
        boolean salir = false;
        for (int i = 1; i < TAMANO_BANDEJA; i++) {
            mensajeRecibidos[i - 1] = mensajeRecibidos[i];
            mensajeRecibidos[i] = null;
            if (i < TAMANO_BANDEJA - 1 && mensajeRecibidos[i + 1] == null) {
                salir = true;
            }
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre='" + Nombre + '\'' + '}';
    }
}

