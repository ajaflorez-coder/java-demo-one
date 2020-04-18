package pe.edu.upc.covid19.model.entity;

public class Piero {
    private String nombre;
    private int dni;

    public Piero(String nombre, int dni) {
        this.setNombre(nombre);
        this.setDni(dni);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}