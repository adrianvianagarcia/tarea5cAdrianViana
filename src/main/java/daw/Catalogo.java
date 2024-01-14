package daw;

import java.util.ArrayList;
import java.util.Collections;

public class Catalogo {

    private ArrayList<Coches> lista = new ArrayList<>();

    public Catalogo() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Catalogo{");
        sb.append("lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }

    public int numeroElementos() {
        return lista.size();
    }

    public boolean estaVacio() {
        return lista.isEmpty();
    }

    public Coches verElemento(int posicion) {

        return lista.get(posicion);
    }

    public void cambiarElemento(int posicion, Coches c1) {

        lista.set(posicion, c1);
    }

    public void guardarElemento(Coches c1) {
        lista.add(c1);
    }

    public void eliminarElemento(int posicion) {
        lista.remove(posicion);
    }

    public void eliminaElemento(Coches c1) {
        lista.remove(c1);
    }

    public void eliminarElementos(ArrayList<Catalogo> listaBorrar) {
        lista.remove(listaBorrar);
    }

    public void eliminarTodos() {
        lista.clear();
    }

    public void imprimirCatalogo() {
        lista.forEach(System.out::println);
    }

    public int buscarELemento(Coches c1) {
        return lista.indexOf(c1);
    }

    public void ordenarPorCaballos() {
        Collections.sort(lista, (e1, e2) -> Integer.compare(e1.getCaballos(),
                e2.getCaballos()));
    }

    public void ordenarPorMarca() {
        Collections.sort(lista, (e1, e2) -> e1.getMarca().
                compareToIgnoreCase(e2.getMarca()));
    }

    public int buscarElemento(Coches c1) {

        return Collections.binarySearch(lista, c1, (k1, k2) -> k1.getMarca().
                compareToIgnoreCase(k2.getMarca()));
    }
}
