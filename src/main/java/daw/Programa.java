package daw;

import java.util.ArrayList;
import java.util.Collections;

public class Programa {

    public static void main(String[] args) {

        Coches c1 = new Coches("bugatti", "18238FHL", "veyron", "marron", 700);
        Coches c2 = new Coches("ferrari", "16374KJL", "912", "rojo", 900);
        Coches c3 = new Coches("mercedes", "12352LFG", "clase c", "negro", 500);

        ArrayList<Coches> listaUno = new ArrayList<>();
        listaUno.add(c1);
        listaUno.add(c2);
        listaUno.add(c3);

        listaUno.forEach(System.out::println);

        System.out.println("-------------------------------");

        Collections.sort(listaUno, (e1, e2) -> Integer.compare(e1.getCaballos(), e2.getCaballos()));

        listaUno.forEach(System.out::println);
        
        System.out.println("-------------------------------");
        
        Collections.sort(listaUno, (k1,k2) -> k1.getModelo().compareToIgnoreCase(k2.getModelo()));
        listaUno.forEach(System.out::println);
        
        System.out.println("-------------------------------");
        
        System.out.println("es igual c1 y c2? " +c1.equals(c2));
        
    }
}
