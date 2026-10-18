package co.edu.uniquindio.poo.model;

public class ComputadorPortatil extends Equipo{

    private int tamañoPantalla;
    private int capacidadRAM;
    private int capacidadAlmacenamiento;
    private boolean bateriaExtraible;

    public ComputadorPortatil(String codigo, String  numeroSerie, String marca,
                              String añoFabricacion, String descripcionEstado,
                              int capacidadAlmacenamiento,int tamañoPantalla) {
        super(codigo, numeroSerie, marca, añoFabricacion, descripcionEstado,
                capacidadAlmacenamiento);
        this.tamañoPantalla = tamañoPantalla;
        this.capacidadRAM= capacidadRAM;
        this.capacidadAlmacenamiento= capacidadAlmacenamiento;
        this.bateriaExtraible=bateriaExtraible;
    }
}
