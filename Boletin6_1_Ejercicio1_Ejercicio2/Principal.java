package Boletin6_1_Ejercicio1;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Betis");
        Equipo equipo2 = new Equipo("Sevilla");
        for (int i = 0; i < 10; i++) {
            try {

                equipo1.addAlumno(generarAlumno());
            } catch (AlumnoException a) {
                System.out.println("Alumno repetido");
            }
            try {
                equipo2.addAlumno(generarAlumno());
            } catch (AlumnoException e) {
                System.out.println("Alumno repetido");

            }
        }
        System.out.println("Equipo1");
        mostrarConjuntoPersonas(equipo1.getAlumnos());
        System.out.println("Equipo2");
        mostrarConjuntoPersonas(equipo2.getAlumnos());

        System.out.println("EquipoU");
        Equipo equipoU = equipo1.unionEquipos(equipo2);

        mostrarConjuntoPersonas(equipoU.getAlumnos());
        System.out.println("EquipoI");

        Equipo equipoI = equipo2.interseccionEquipos(equipo1);
        mostrarConjuntoPersonas(equipoI.getAlumnos());
    }

    public static void mostrarConjuntoPersonas(Set<Alumno> alumnos) {
        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            Alumno alum = it.next();
            System.out.println(alum);
        }
    }

    public static Alumno generarAlumno() {
        String nombre;
        Random r = new Random();
        nombre = "" + r.nextInt(7);
        return new Alumno(nombre, nombre);
    }


}
