package co.edu.uniquindio.poo.model;

public class Inventario {
    private final String codigo;
    private String nombre;
    private String descripcion;
    private float precioUnitario;
    private int cantidadDisponible;
    private String categoriaCompatibilidad;
    private int CantidadDisponible;

    public Inventario(String codigo, String nombre, String descripcion,
                      float precioUnitario, int cantidadDisponible, String categoriaCompatibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadDisponible = cantidadDisponible;
        this.categoriaCompatibilidad = categoriaCompatibilidad;
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

    public String getCategoriaCompatibilidad() {
        return categoriaCompatibilidad;
    }

    public void setCategoriaCompatibilidad(String categoriaCompatibilidad) {
        this.categoriaCompatibilidad = categoriaCompatibilidad;
    }
    //8
    public void descontarRepuesto (int cantidadDisponible){
        this.CantidadDisponible-=cantidadDisponible;
    }
}
