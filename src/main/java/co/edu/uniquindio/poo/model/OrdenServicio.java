package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class OrdenServicio {
    private final String codigo;
    private final LocalDate fecha;
    private String nombreCliente; //No me dejo usar el get para sacar
                                // el nombre asi que lo dejo en String
    private String observaciones;
    private EstadoOrden estadoOrden;

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
}
