package Examen21_22;

import java.time.LocalDateTime;

public class Fichero {
    private String nombre;
    private long size;
    private LocalDateTime dateCreation;

    /**
     *
     * @param nombre Nombre del fichero
     * @param size   Tamaño del fichero
     */
    public Fichero(String nombre, long size) {
        this.nombre = nombre;
        setSize(size);
        this.dateCreation = LocalDateTime.now();

    }

    public long getSize() {
        return size;
    }

    /**
     * @param size
     * @throws IllegalArgumentException
     */
    private void setSize(long size) {

        if (size < 1) throw new IllegalArgumentException("El tamaño del archivo no puede ser negativo ");
        this.size = size;
    }

}
