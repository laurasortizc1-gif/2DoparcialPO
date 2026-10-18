package co.edu.uniquindio.poo.model;

public class Cliente extends Persona {
    private String numeroTelefono;
    private String correo;
    private String direccion;

    public Cliente(String nombre, String documentoIdentidad, String numeroTelefono, String correo, String direccion) {
        super(nombre, documentoIdentidad);
        this.numeroTelefono = numeroTelefono;
        this.correo= correo;
        this.direccion= direccion;
    }
}
