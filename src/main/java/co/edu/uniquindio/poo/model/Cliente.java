package co.edu.uniquindio.poo.model;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Cliente extends Persona {
    private String numeroTelefono;
    private String correo;
    private String direccion;
    private  ArrayList<OrdenServicio> listaOrdenes = new ArrayList<>();
    private List <Equipo> listaEquipos= new LinkedList<>();

    public Cliente(String nombre, String documentoIdentidad, String numeroTelefono, String correo, String direccion) {
        super(nombre, documentoIdentidad);
        this.numeroTelefono = numeroTelefono;
        this.correo= correo;
        this.direccion= direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<OrdenServicio> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(ArrayList<OrdenServicio> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    //15. equipos pendientes
    public List <Equipo> listaEquiposAunIntervenidos(){
        List <Equipo> listaEquiposSinFinalizarIntervencion= new LinkedList<>();
        for(Equipo a: listaEquipos) {
            for (OrdenServicio b : listaOrdenes) {
                if (b.getEstadoOrden().equals(EstadoOrden.EN_PROCESO)) {
                    listaEquiposSinFinalizarIntervencion.add(a);
                }
            }
        }
        return listaEquiposSinFinalizarIntervencion;
    }
    public
}
