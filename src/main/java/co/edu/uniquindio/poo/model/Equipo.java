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

}
