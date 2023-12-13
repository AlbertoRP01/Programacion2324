package MensajesPersona;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mensaje {
    private String asunto;
    private String cuerpo;
    private LocalDateTime fechaEnvio;
    private Persona remitente;
    private Persona destinatario;

    public Mensaje(String asunto, String cuerpo, Persona remitente, Persona destinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.fechaEnvio = LocalDateTime.now();
        this.asunto = asunto;
        this.cuerpo = cuerpo;


    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "asunto='" + asunto + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                ", fechaEnvio=" + fechaEnvio +
                ", remitente=" + remitente +
                ", destinatario=" + destinatario +
                '}';
    }
}
