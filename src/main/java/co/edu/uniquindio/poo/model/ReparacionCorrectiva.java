package co.edu.uniquindio.poo.model;

public class ReparacionCorrectiva extends Servicios {

    private int cantidadRepuestosRequerida;

    public ReparacionCorrectiva(String codigo, String nombre,
                                float tarifaBase, String descripcionEstado, int cantidadRepuestosRequerida) {
        super(codigo, nombre, tarifaBase, descripcionEstado);
        this.cantidadRepuestosRequerida = cantidadRepuestosRequerida;
    }

    public int getCantidadRepuestosRequerida() {
        return cantidadRepuestosRequerida;
    }

    public void setCantidadRepuestosRequerida(int cantidadRepuestosRequerida) {
        this.cantidadRepuestosRequerida = cantidadRepuestosRequerida;
    }


    @Override
    public float costoTotalDettale(DetalleOrden detalleOrden, Equipo equipo) {
        int horas = detalleOrden.getHorasDeTrabajo();
        int repuestos = detalleOrden.getCantidadRepuestos();
        float costoCorrectiva=45000*horas;
        if (detalleOrden.getInventario() != null &&  repuestos>0 ) {
           costoCorrectiva+=repuestos*detalleOrden.getInventario().getPrecioUnitario();
        }
        return costoCorrectiva;
    }

    }

