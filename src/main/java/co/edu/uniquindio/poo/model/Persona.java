package co.edu.uniquindio.poo.model;

public abstract class Persona {
    protected String nombre;
    protected String documentoIdentidad;

    public Persona(String nombre, String documentoIdentidad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
    }
}
