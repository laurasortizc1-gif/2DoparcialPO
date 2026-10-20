package co.edu.uniquindio.poo.model;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Cliente extends Persona {
    private String numeroTelefono;
    private String correo;
    private String direccion;
    private  ArrayList<OrdenServicio> listaOrdenes = new ArrayList<>();
    private List <OrdenServicio> listaOrdenes = new LinkedList<>();

    public Cliente(String nombre, String documentoIdentidad, String numeroTelefono, String correo, String direccion) {
        super(nombre, documentoIdentidad);
        this.numeroTelefono = numeroTelefono;
        this.correo= correo;
        this.direccion= direccion;
    }
}
