package co.edu.uniquindio.poo.model;

public class Servicios {
    private final String codigo;
    private String nombre;
    private float tarifaBase;
    private String descripcionEstado;

    public Servicios(String codigo, String nombre, float tarifaBase, String descripcionEstado) {
        this.codigo = codigo;
        this.nombre= nombre;
        this.tarifaBase= tarifaBase;
        this.descripcionEstado= descripcionEstado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(float tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }
}
