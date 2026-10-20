package co.edu.uniquindio.poo.model;

public abstract class Equipo {

    protected final String codigo;
    protected final String  numeroSerie;
    protected  String marca;
    private String añoFabricacion;
    private String descripcionEstado;
    private int capacidadAlmacenamiento;

    public Equipo(String codigo, String numeroSerie, String marca,
                  String añoFabricacion, String descripcionEstado,
                  int capacidadAlmacenamiento) {
        this.codigo = codigo;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.añoFabricacion = añoFabricacion;
        this.descripcionEstado = descripcionEstado;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    //validar atributos (punto2)
    public abstract boolean validarAtributos();
    public boolean validarAtributosenComun(){
        return codigo!=null && !codigo.isBlank() && marca!=null && !marca.isBlank() && numeroSerie!=null &&
                !numeroSerie.isBlank() && añoFabricacion!=null && !añoFabricacion.isBlank() &&descripcionEstado!=null
                && !descripcionEstado.isBlank() && capacidadAlmacenamiento>0;
    }


}

