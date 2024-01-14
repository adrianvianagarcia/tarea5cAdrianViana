package daw;

import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {

        Coches c1 = new Coches("bugatti", "18238FHL", "veyron", "marron", 700);
        Coches c2 = new Coches("ferrari", "16374KJL", "912", "rojo", 900);
        Coches c3 = new Coches("mercedes", "12352LFG", "clase c", "negro", 500);

        Catalogo catalogo = new Catalogo();

        // Probar los métodos
        System.out.println("Número de elementos en el catálogo: " + catalogo.numeroElementos());
        System.out.println("¿El catálogo está vacío? " + catalogo.estaVacio());

        // Guardar elementos en el catálogo
        catalogo.guardarElemento(c1);
        catalogo.guardarElemento(c2);
        catalogo.guardarElemento(c3);

        System.out.println("Número de elementos en el catálogo después de guardar: " + catalogo.numeroElementos());
        System.out.println("¿El catálogo está vacío después de guardar? " + catalogo.estaVacio());

        // Ver elemento en una posición
        System.out.println("Elemento en la posición 1: " + catalogo.verElemento(1));

        // Cambiar elemento en una posición
        catalogo.cambiarElemento(1, new Coches("nuevo", "11111", "modelo", "azul", 800));

        // Imprimir el catálogo después de cambiar un elemento
        System.out.println("Catálogo después de cambiar un elemento:");
        catalogo.imprimirCatalogo();

        // Eliminar elemento en una posición
        catalogo.eliminarElemento(0);

        // Imprimir el catálogo después de eliminar un elemento
        System.out.println("Catálogo después de eliminar un elemento:");
        catalogo.imprimirCatalogo();

        // Buscar elemento en el catálogo
        System.out.println("Posición de 'ferrari' en el catálogo: " + catalogo.buscarElemento(c2));

        // Ordenar por caballos y imprimir el catálogo
        catalogo.ordenarPorCaballos();
        System.out.println("Catálogo ordenado por caballos:");
        catalogo.imprimirCatalogo();

        // Ordenar por marca y imprimir el catálogo
        catalogo.ordenarPorMarca();
        System.out.println("Catálogo ordenado por marca:");
        catalogo.imprimirCatalogo();
        
        // Imprimir el catálogo antes de realizar operaciones
        System.out.println("Catálogo antes de realizar operaciones:");
        catalogo.imprimirCatalogo();

        // Eliminar elemento por objeto
        catalogo.eliminaElemento(c2);

        // Imprimir el catálogo después de eliminar un elemento por objeto
        System.out.println("Catálogo después de eliminar un elemento por objeto:");
        catalogo.imprimirCatalogo();

        // Eliminar todos los elementos
        catalogo.eliminarTodos();

        // Imprimir el catálogo después de eliminar todos los elementos
        System.out.println("Catálogo después de eliminar todos los elementos:");
        catalogo.imprimirCatalogo();

        // Agregar elementos nuevamente
        catalogo.guardarElemento(new Coches("audi", "99999", "a3", "blanco", 600));
        catalogo.guardarElemento(new Coches("bmw", "88888", "serie 5", "gris", 650));

        // Imprimir el catálogo después de agregar nuevos elementos
        System.out.println("Catálogo después de agregar nuevos elementos:");
        catalogo.imprimirCatalogo();

        // Buscar elemento en el catálogo (después de agregar nuevos elementos)
        System.out.println("Posición de 'audi' en el catálogo: " + catalogo.buscarElemento(new Coches("audi", "99999", "a3", "blanco", 600)));

        // Eliminar elementos mediante una lista
        ArrayList<Catalogo> listaBorrar = new ArrayList<>();
        listaBorrar.add(catalogo);
        catalogo.eliminarElementos(listaBorrar);

        // Imprimir el catálogo después de eliminar elementos mediante una lista
        System.out.println("Catálogo después de eliminar elementos mediante una lista:");
        catalogo.imprimirCatalogo();
        
    }
}
