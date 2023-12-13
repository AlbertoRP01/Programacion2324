package EjemploEduardo;

import java.time.LocalDateTime;

public class principal {
    public static void main(String[] args) {


        Deposito d = new Deposito(200000, 180000);
    Avion a = new Avion("Airbus","A230", 13, d);
        a.addRevision(new Revisiones  (LocalDateTime.of(2023, 10, 8, 12, 8), true, 6));
        System.out.println(a.puedeVolar(1500)? "Puede recorrer esa distancia" : "No puede volar esa distancia");

}
}
