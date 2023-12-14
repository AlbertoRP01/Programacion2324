package PracticaGuiadaBiblioteca;

public class Biblioteca {
    public static final int NUM_MAX_USUARIOS = 2;
    public static final int NUM_MAX_LIBROS = 2;
    private String nombre;
    private Libro[] libros;
    private Usuario[] usuarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[NUM_MAX_LIBROS];
        this.usuarios = new Usuario[NUM_MAX_USUARIOS];
    }

    public void altaSocio(String nombre, String apellidos, String dni) throws BibliotecaException {
        Usuario u = new Usuario(nombre, apellidos, dni);
        if (existeUsuario(u)){
            throw  new BibliotecaException("Ya existe este usuario con este dni ");
        }

    }

    public boolean existeUsuario(Usuario u) {
        boolean usuarioEncontrado = false;
        for (int i = 0; i < usuarios.length && !usuarioEncontrado; i++) {
            if (u.equals(usuarios[i])) {
                usuarioEncontrado = true;
            }
        }
        return usuarioEncontrado;
    }
}
