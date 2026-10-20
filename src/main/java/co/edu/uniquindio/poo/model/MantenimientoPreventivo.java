package co.edu.uniquindio.poo.model;

public class MantenimientoPreventivo extends Servicios {

    public MantenimientoPreventivo(String codigo, String nombre, float tarifaBase, String descripcionEstado) {
        super(codigo, nombre, tarifaBase, descripcionEstado);
    }

    @Override
    public float costoTotalDettale(DetalleOrden detalleOrden, Equipo equipo) {
        return  equipo.SacartarifaMantenimiento();
    }

    @Override
    public boolean permiteRepuestos() {
        return false;
    }


}
