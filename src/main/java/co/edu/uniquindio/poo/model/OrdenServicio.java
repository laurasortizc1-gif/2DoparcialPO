package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class OrdenServicio {
    private final String codigo;
    private final LocalDate fecha;
    private String nombreCliente; //No me dejo usar el get para sacar
                                // el nombre asi que lo dejo en String
    private String observaciones;
    private EstadoOrden estadoOrden;
    private final List<DetalleOrden> ListaDetalles = new LinkedList<>();

    public OrdenServicio(String codigo, LocalDate fecha, String nombreCliente,
                         String observaciones, EstadoOrden estadoOrden) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.nombreCliente= nombreCliente;
        this.observaciones= observaciones;
        this.estadoOrden= estadoOrden;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public EstadoOrden getEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(EstadoOrden estadoOrden) {
        this.estadoOrden = estadoOrden;
    }

    public String finalizarOrden(){
        String mensaje="";
        if(estadoOrden.equals(EstadoOrden.CANCELADA) || estadoOrden.equals(EstadoOrden.FINALIZADA)){
            mensaje+="Esta orden ya esta finalizada.";
        }
        return mensaje;
    }
}
