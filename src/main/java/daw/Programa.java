package daw;

public class Programa {

    public static void main(String[] args) {

        Coches c1 = new Coches("bugatti", "18238FHL", "veyron", "marron", 700);
        Coches c2 = new Coches("ferrari", "16374KJL", "912", "rojo", 900);
        Coches c3 = new Coches("mercedes", "12352LFG", "clase c", "negro", 500);

        Catalogo listaUno = new Catalogo();

        listaUno.verElemento(0);

    }
}
