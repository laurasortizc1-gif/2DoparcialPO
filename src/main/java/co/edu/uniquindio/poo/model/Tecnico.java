package co.edu.uniquindio.poo.model;

import java.util.List;

public class Tecnico extends Persona {

    private String codigo;
    private Especialidad especialidad;
    private String estado;

    public Tecnico(String nombre, String documentoIdentidad, String codigo, Especialidad especialidad, String estado) {
        super(nombre, documentoIdentidad);
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.estado= estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
 //para el 7
    public boolean puedeAtender(Equipo equipo){
        return especialidad==Especialidad.SOPORTE_GENERAL || especialidad ==equipo.getEspecialidadRequerida();
    }
}
