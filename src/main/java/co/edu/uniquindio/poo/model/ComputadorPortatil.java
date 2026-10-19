package co.edu.uniquindio.poo.model;

public class ComputadorPortatil extends Equipo{

    private int tamañoPantalla;
    private int capacidadRAM;
    private boolean bateriaExtraible;

    public ComputadorPortatil(String codigo, String  numeroSerie, String marca,
                              String añoFabricacion, String descripcionEstado,
                              int capacidadAlmacenamiento,int tamañoPantalla,
                              int capacidadRAM,boolean bateriaExtraible) {
        super(codigo, numeroSerie, marca, añoFabricacion, descripcionEstado,
                capacidadAlmacenamiento);
        this.tamañoPantalla = tamañoPantalla;
        this.capacidadRAM= capacidadRAM;
        this.bateriaExtraible=bateriaExtraible;
    }

    public int getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public int getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setCapacidadRAM(int capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }
    public boolean isBateriaExtraible() {
        return bateriaExtraible;
    }

    public void setBateriaExtraible(boolean bateriaExtraible) {
        this.bateriaExtraible = bateriaExtraible;
    }
}
