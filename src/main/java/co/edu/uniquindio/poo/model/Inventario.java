package co.edu.uniquindio.poo.model;

public class Inventario {
    private final String codigo;
    private String nombre;
    private String descripcion;
    private float precioUnitario;
    private int cantidadDisponible;

    public Inventario(String codigo, String nombre, String descripcion,
                      float precioUnitario, int cantidadDisponible) {
        this.codigo = codigo;
        this.nombre= nombre;
        this.descripcion= descripcion;
        this.precioUnitario= precioUnitario;
        this.cantidadDisponible= cantidadDisponible;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}
