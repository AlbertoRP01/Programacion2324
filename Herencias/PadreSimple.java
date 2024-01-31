package Herencias;

public class PadreSimple {
    String nombre;
    String apellidos;

    public PadreSimple(String nombre) {
        this.nombre = nombre;
    }

    public PadreSimple(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void saludar(){
        System.out.println("Hola soy el Padre");
    }

}
