package co.edu.uniquindio.poo.model;

public class Diagnostico extends Servicios {
    private String fallasEquipo;
    private final int costoFijo= 35000;

    public Diagnostico(String codigo, String nombre, float tarifaBase
            , String descripcionEstado, String fallasEquipo) {
        super(codigo, nombre, tarifaBase, descripcionEstado);
        this.fallasEquipo = fallasEquipo;
    }

    public String getFallasEquipo() {
        return fallasEquipo;
    }

    public void setFallasEquipo(String fallasEquipo) {
        this.fallasEquipo = fallasEquipo;
    }

    public int getCostoFijo() {
        return costoFijo;
    }


    @Override
    public float costoTotalDettale(DetalleOrden detalleOrden, Equipo equipo) {
        return costoFijo;
    }
}
