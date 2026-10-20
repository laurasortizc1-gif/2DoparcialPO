package co.edu.uniquindio.poo.model;

import java.util.LinkedList;
import java.util.List;

public class DetalleOrden {
    private final String codigo;
    private final String codigoEquipoIntervenido;//Por si hay más de un equipo
                                                // que es intervenido, como dos computadores,
                                                // poder identificarlos mejor cada uno
    private String descripcionFallaNecesidad;
    private String tecnicoResponsable;
    private int horasDeTrabajo;
    private String observacionesTecnicas;
    private String estadoIntervencion;
    private Equipo equipoIntervenido;
    private int cantidadRepuestos;
    private Inventario inventario;
    private EstadoIntervencion estadoIntervencion;
    private List<Intervencion> listaIntervenciones = new LinkedList<>();

    public DetalleOrden(String codigo, String codigoEquipoIntervenido,
                        String descripcionFallaNecesidad, String tecnicoResponsable,
                        int horasDeTrabajo, String observacionesTecnicas,
                        String estadoIntervencion,Equipo equipoIntervenido, int cantidadRepuestos,
                        Inventario inventario) {
                        EstadoIntervencion estadoIntervencion, List <Intervencion> listaIntervenciones) {
        this.codigo = codigo;
        this.codigoEquipoIntervenido = codigoEquipoIntervenido;
        this.descripcionFallaNecesidad= descripcionFallaNecesidad;
        this.tecnicoResponsable= tecnicoResponsable;
        this.horasDeTrabajo= horasDeTrabajo;
        this.observacionesTecnicas= observacionesTecnicas;
        this.estadoIntervencion= estadoIntervencion;
        this.equipoIntervenido=equipoIntervenido;
        this.cantidadRepuestos=cantidadRepuestos;
        this.inventario=inventario;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public int getCantidadRepuestos() {
        return cantidadRepuestos;
    }

    public void setCantidadRepuestos(int cantidadRepuestos) {
        this.cantidadRepuestos = cantidadRepuestos;
    }

    public Equipo getEquipoIntervenido() {
        return equipoIntervenido;
    }

    public void setEquipoIntervenido(Equipo equipoIntervenido) {
        this.equipoIntervenido = equipoIntervenido;
        this.listaIntervenciones= listaIntervenciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCodigoEquipoIntervenido() {
        return codigoEquipoIntervenido;
    }

    public String getDescripcionFallaNecesidad() {
        return descripcionFallaNecesidad;
    }

    public void setDescripcionFallaNecesidad(String descripcionFallaNecesidad) {
        this.descripcionFallaNecesidad = descripcionFallaNecesidad;
    }

    public String getTecnicoResponsable() {
        return tecnicoResponsable;
    }

    public void setTecnicoResponsable(String tecnicoResponsable) {
        this.tecnicoResponsable = tecnicoResponsable;
    }

    public int getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(int horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public String getObservacionesTecnicas() {
        return observacionesTecnicas;
    }

    public void setObservacionesTecnicas(String observacionesTecnicas) {
        this.observacionesTecnicas = observacionesTecnicas;
    }

    public EstadoIntervencion getEstadoIntervencion() {
        return estadoIntervencion;
    }

    public void setEstadoIntervencion(EstadoIntervencion estadoIntervencion) {
        this.estadoIntervencion = estadoIntervencion;
    }

    public List<Intervencion> getListaIntervenciones() {
        return listaIntervenciones;
    }

    public void setListaIntervenciones(List<Intervencion> listaIntervenciones) {
        this.listaIntervenciones = listaIntervenciones;
    }
    //11. Actualizar estado detalle
    public String actualizarEstadoDetalle(EstadoIntervencion nuevoEstado){
        String mensaje="";
        if(nuevoEstado != estadoIntervencion){
            estadoIntervencion =nuevoEstado;
            mensaje+="Su esatdo ha sido actualizado exitosamente.";
        }
        return mensaje;
    }
}
