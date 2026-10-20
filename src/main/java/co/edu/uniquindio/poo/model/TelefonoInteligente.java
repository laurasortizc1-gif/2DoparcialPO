package co.edu.uniquindio.poo.model;

public class TelefonoInteligente extends Equipo {
  private String  tipoProcesador;
  private int cantidadRAM;
  private boolean graficaDedicada;

  public TelefonoInteligente(String codigo, String  numeroSerie, String marca,
                             String añoFabricacion, String descripcionEstado,
                             int capacidadAlmacenamiento, String tipoProcesador,
                             int cantidadRAM, boolean graficaDedicada) {
    super(codigo, numeroSerie, marca, añoFabricacion, descripcionEstado,
            capacidadAlmacenamiento);
    this.tipoProcesador = tipoProcesador;
    this. cantidadRAM= cantidadRAM;
    this.graficaDedicada= graficaDedicada;
  }

  public String getTipoProcesador() {
    return tipoProcesador;
  }

  public void setTipoProcesador(String tipoProcesador) {
    this.tipoProcesador = tipoProcesador;
  }

  public int getCantidadRAM() {
    return cantidadRAM;
  }

  public void setCantidadRAM(int cantidadRAM) {
    this.cantidadRAM = cantidadRAM;
  }

  public boolean isGraficaDedicada() {
    return graficaDedicada;
  }

  public void setGraficaDedicada(boolean graficaDedicada) {
    this.graficaDedicada = graficaDedicada;
  }

  @Override
  public boolean validarAtributos() {
    return validarAtributos() && tipoProcesador!=null && !tipoProcesador.isBlank() && cantidadRAM>0;
  }
}
