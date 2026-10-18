package co.edu.uniquindio.poo.model;

public class ComputadorEscritorio extends Equipo {
   private  String tipoProcesador;
   private int cantidadRAM;
   private boolean graficaDedicada;

   public ComputadorEscritorio(String codigo, String  numeroSerie, String marca,
                               String añoFabricacion, String descripcionEstado,
                               int capacidadAlmacenamiento, String tipoProcesador,
                               int cantidadRAM, boolean graficaDedicada) {
      super(codigo, numeroSerie, marca, añoFabricacion, descripcionEstado,
              capacidadAlmacenamiento);
      this.tipoProcesador = tipoProcesador;
      this.cantidadRAM= cantidadRAM;
      this.graficaDedicada= graficaDedicada;
   }
}
