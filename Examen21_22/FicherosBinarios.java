package Examen21_22;

public class FicherosBinarios extends Fichero {
    private byte[] contenido;


    /**
     * @param nombre Nombre del fichero Binario
     * @param size   Tamaño del fichero
     */
    public FicherosBinarios(String nombre, long size,byte[] contenido) {
        super(nombre, contenido.length);
        setContenido(contenido);
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }
}
