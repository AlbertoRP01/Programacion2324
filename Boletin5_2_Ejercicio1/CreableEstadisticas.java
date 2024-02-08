package Boletin5_2_Ejercicio1;

import boletin5_1_Ejercicio3.PersonajeException;

public interface CreableEstadisticas {
    double minimo() throws PersonajeException;
    double maximo() throws PersonajeException;
    double media() throws PersonajeException;
}
