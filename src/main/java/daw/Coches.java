package daw;

import java.util.ArrayList;
import java.util.Objects;

public class Coches {

    private String marca;
    private String matricula;
    private String modelo;
    private String color;
    private int caballos;

    public Coches(String marca, String matricula, String modelo, String color, int caballos) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.caballos = caballos;
    }

    public Coches() {
    }

    public Coches(Coches origen) {
        this.marca = origen.marca;
        this.matricula = origen.matricula;
        this.modelo = origen.modelo;
        this.color = origen.color;
        this.caballos = origen.caballos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.marca);
        hash = 43 * hash + Objects.hashCode(this.matricula);
        hash = 43 * hash + Objects.hashCode(this.modelo);
        hash = 43 * hash + Objects.hashCode(this.color);
        hash = 43 * hash + this.caballos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coches other = (Coches) obj;
        if (this.caballos != other.caballos) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Metodos{");
        sb.append("marca=").append(marca);
        sb.append(", matricula=").append(matricula);
        sb.append(", modelo=").append(modelo);
        sb.append(", color=").append(color);
        sb.append(", caballos=").append(caballos);
        sb.append('}');
        return sb.toString();
    }

}
