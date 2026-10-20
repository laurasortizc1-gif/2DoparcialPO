package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
public class Cliente extends Persona {
    private String numeroTelefono;
    private String correo;
    private String direccion;
    private  ArrayList<OrdenServicio> listaOrdenes = new ArrayList<>();

    public Cliente(String nombre, String documentoIdentidad, String numeroTelefono, String correo, String direccion) {
        super(nombre, documentoIdentidad);
        this.numeroTelefono = numeroTelefono;
        this.correo= correo;
        this.direccion= direccion;
    }
}
