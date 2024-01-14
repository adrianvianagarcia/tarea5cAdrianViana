package daw;

import java.util.ArrayList;

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

    public int numeroElementos(ArrayList<Coches> lista) {
        return lista.size();
    }

    public boolean estaVacio(ArrayList<Coches> lista) {
        return lista.isEmpty();
    }

    public Catalogo verElemento(int posicion) {
        ArrayList<Catalogo> lista = new ArrayList<>();

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

}
