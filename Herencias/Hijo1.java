package Herencias;

public class Hijo1 extends PadreSimple {
    private String estudios;

    public Hijo1(String nombre, String apellidos, String estudios) {
        super(nombre, apellidos);
        this.estudios = estudios;

    }

    public String getEstudios() {
        return estudios;
    }

    public void saludar(){
    System.out.println("Holam, soy el hijo");
}

    public static void main(String[] args) {
        Hijo1 h = new Hijo1("Pepita", "González", "ESO");
        System.out.println(h.getEstudios());
        System.out.println(h.getNombre());
        h.saludar();
    }

}
