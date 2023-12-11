package EjemploEduardo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Revisiones {
    LocalDateTime fecha;
    private boolean estado;

    //se mide en meses
    private double periodoValidez;


    public Revisiones(LocalDateTime fecha, boolean estado, double periodoValidez) {
        if (fecha.isBefore(LocalDateTime.now())) {
            this.fecha = fecha;
        }


        this.estado = estado;
        if (periodoValidez > 0) {
            this.periodoValidez = periodoValidez;
        }
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public long getPeriodoValidez() {
      return  periodoValidez;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return fecha.format(formatter) + "con resultado " + (estado ? "satisfactorio " : " insatifactorio");
    }
}
