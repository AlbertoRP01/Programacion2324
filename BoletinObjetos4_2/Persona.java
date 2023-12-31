package BoletinObjetos4_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Persona {
    public static final char[] LETRAS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    private String nombre;
    private LocalDate fechaNacimiento;
    private int dni;
    private float altura;
    private float peso;
    private char sexo;

    public Persona(String nombre, LocalDate fechaNacimiento, int dni, float altura, float peso, char sexo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public char getLetraDni() {
        return LETRAS[dni % 23];
    }

    public float getImc() {
        return peso / (altura * altura);
    }

    public static void numDias() {
        LocalDate birthay = LocalDate.of(2001, 10, 12);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthay, today);
        long p2 = ChronoUnit.DAYS.between(birthay, today);
        System.out.println("Eres todavia joven" + p2);

    }

}

