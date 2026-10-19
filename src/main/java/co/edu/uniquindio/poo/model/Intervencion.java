package co.edu.uniquindio.poo.model;

public class Intervencion {
    private float costo;
    private String tecnicoResponsable;
    private String estado;

    public Intervencion(float costo, String tecnicoResponsable, String estado) {
        this.costo = costo;
        this.tecnicoResponsable= tecnicoResponsable;
        this.estado= estado;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getTecnicoResponsable() {
        return tecnicoResponsable;
    }

    public void setTecnicoResponsable(String tecnicoResponsable) {
        this.tecnicoResponsable = tecnicoResponsable;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
