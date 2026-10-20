package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


import java.util.LinkedList;
import java.util.List;

public class Empresa {

    private String nombre;
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private  ArrayList<Equipo> listaEquipos = new ArrayList<>();
    private  ArrayList<Tecnico> listaTecnicos = new ArrayList<>();
    private ArrayList<Inventario> listaRepuestos = new ArrayList<>();
    private  ArrayList<OrdenServicio> listaOrdenes = new ArrayList<>();
    private  Map<String, ArrayList<Equipo>> equiposMapporCliente=new HashMap<>();
    private ArrayList<Servicios> listaServicios= new ArrayList<>();
    private List <Inventario> listaRepuestos1 = new LinkedList<>();



    public Empresa(String nombre) {

        this.nombre = nombre;
    }

    public Empresa(ArrayList<Inventario> listaRepuestos) {
        this.listaRepuestos = listaRepuestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setListaRepuestos(ArrayList<Inventario> listaRepuestos) {
        this.listaRepuestos = listaRepuestos;
    }

    public ArrayList<Inventario> getListaRepuestos() {
        return listaRepuestos;
    }
    //1.Registrar cliente:Registrar y validar los datos personales, evitando documentos repetidos.

    public String registrarCliente(Cliente cliente){
        Optional<Cliente> clienteOptional = buscarCliente(cliente.getDocumentoIdentidad());
        if(clienteOptional.isPresent()){
            return "el cliente ya existe";
        }else{
            listaClientes.add(cliente);
            return "cliente registrado exitosamente en la empresa";
        }
    }
    public Optional<Cliente> buscarCliente(String documentoIdentidad) {
        return listaClientes.stream().filter(cliente ->
                documentoIdentidad.equals(cliente.getDocumentoIdentidad())).findFirst();
    }
    //2da opción
    public Optional<Cliente> buscarCliente2(String documentoIdentidad) {
        for (Cliente cliente :listaClientes){
            if (documentoIdentidad.equals(cliente.getDocumentoIdentidad())){
                return Optional.of(cliente);
            }
        }
        return Optional.empty();
    }

    //2.Registrar equipo: Asociar un equipo a un cliente y validar su identificación y
    // atributos según su categoría.

    public String registrarEquipo( String documentoIdentidad,Equipo equipo) {
        Optional<Cliente> clienteOptional = buscarCliente(documentoIdentidad);
        if (clienteOptional.isPresent()) {

            if (equipo.getCodigo() != null && !equipo.getCodigo().isBlank()) {

                if (equipo.validarAtributos()) {
                    listaEquipos.add(equipo);
                    equiposMapporCliente
                            .computeIfAbsent(documentoIdentidad, a-> new ArrayList<>())
                            .add(equipo);
                    return " el equipo fue registrado con exito y le fue asignado al cliente";
                } else{return "los atrinutos del equipo no son validos";}
            }
        } else {

            return " no se puede registrar el equipo";
        }
        return null;
    }

    //3. Registrar técnico: Guardar técnicos con su especialidad y estado laboral.
    public String registrarTecnico(Tecnico tecnico) {
        Optional<Tecnico> TecnicoOptional = buscarTecnico(tecnico.getCodigo());
        if (TecnicoOptional.isPresent()) {
            return "el tecnico ya existe";
        } else {
            listaTecnicos.add(tecnico);
            return "tecnico registrado exitosamente en la empresa";
        }
    }
        public Optional<Tecnico> buscarTecnico(String codigo) {
            return listaTecnicos.stream().filter(Tecnico ->
                   codigo.equals(Tecnico.getCodigo())).findFirst();
        }

        //4. Registrar repuesto:Crear repuestos con precio, categoría y existencias
        //iniciales.

    public String registrarRepuesto(Inventario inventario){
        Optional<Inventario> inventarioOptional = buscarRepuesto(inventario.getCodigo());
        if(inventarioOptional.isPresent()){
            return "Lo siento este repuesto ya existe";

        }else if(inventario.getCantidadDisponible()<=0){ //por el enunciado donde debe sercantidad mayor a 0
            return "la cantidad debe ser positiva";

        }else{
            listaRepuestos.add(inventario);
            return "repuesto registrado exitosamente en el inventario";
        }
    }
    public Optional<Inventario> buscarRepuesto(String codigo){
        return listaRepuestos
                .stream()
                .filter(a -> a.getCodigo().equals(codigo))
                .findFirst();
    }

    //5. Crear orden de servicio:Crear una orden abierta para un cliente existente.
    public String crearOrden( String documentoIdentidad,OrdenServicio ordenServicio, EstadoOrden estadoOrden) {
        Optional<Cliente> clienteOptional = buscarCliente(documentoIdentidad);
        if (clienteOptional.isPresent()) {

            OrdenServicio ordenes = new OrdenServicio(ordenServicio.getCodigo(), ordenServicio.getFecha(),
                    clienteOptional.get(), ordenServicio.getObservaciones(), estadoOrden.ABIERTA);

            listaOrdenes.add(ordenes);
            return "orden creada exitosamente";
        } else {
            return "el cliente no existe, la orden no puede crearse";
        }
    }
    //18.Inventario Critico


        //6.Agregar detalle a una orden: Seleccionar un equipo del cliente, un servicio y registrar la
        //falla reportada.
    public Optional<Servicios>buscarServicios(String codigo){
        return listaServicios.stream()
                .filter(s-> s.getCodigo().equals(codigo))
                .findFirst();
    }
    public  String agregarDetalleOrden(DetalleOrden detalleOrden,Equipo equipo,OrdenServicio ordenServicio) {
        String documento = ordenServicio.getCliente().getDocumentoIdentidad();
        ArrayList<Equipo> equiposCliente = equiposMapporCliente.get(documento);
        if (equiposCliente == null || !equiposCliente.contains(equipo)) {
            return "el equipo no pertenece al cliente de la orden";
        }else{
            ordenServicio.agregarDetalle(detalleOrden);
            return "detalle agregado exitosamente de la orden";
        }
    }

    //7.Asignar técnico:Verificar que el técnico esté activo y autorizado para la
    //intervención.
    public String asignarTecnico(DetalleOrden detalleOrden, Tecnico tecnico){
        if(!tecnico.getEstado().equalsIgnoreCase("activo")){
            return "el tecnico no esta activo";
        }if(!tecnico.puedeAtender(detalleOrden.getEquipoIntervenido())){
            return "el tecnico no esta disponible para este equipo";
        }
        detalleOrden.setTecnicoResponsable(tecnico);
        return "tecnico asignado exitosamente";
    }

    //8. Registrar repuestos utilizados:Agregar repuestos y cantidades a reparaciones
    //correctivas, validando inventario.

    public String registrarRepuesto(DetalleOrden detalleOrden, Inventario inventario, int cantidad){
      if(!detalleOrden.getservicio().permiteRepuestos()){
          return "solo las reparaciones correctivas usan repuesto";
      }
      if(cantidad<=0){
          return "cantidad debe ser mayor a 0";
      }
      repuesto.descontar(cantidad);
      detalleOrden.setInventario(repuesto);
      detalleOrden.setCantidadRepuestos(cantidad);
      return "repuesto registrado exitosamente";
    }


       //9.Calcular valor de un detalle: Calcular el costo específico mediante el tipo de servicio
      //solicitado.

      public float calcularValorDetalle(DetalleOrden detalleOrden,Servicios servicio){
         return servicio.costoTotalDettale(detalleOrden, detalleOrden.getEquipoIntervenido());
      }

      //18.Repuestos menores a 5

    public List <Inventario> listaRepuestosEscasos(){
        List <Inventario> listaDePocosRepuestos = new LinkedList<>();

        for(Inventario a: Empresa.getListaRepuestos()){
            if(a.getCantidadDisponible()<5){
                listaDePocosRepuestos.add(a);
            }
        }
        return listaDePocosRepuestos;
    }
    //14.Consultar trabajos de un tecnico
public static List<DetalleOrden> consultarTrabajosDeTecnico(List<OrdenServicio> listaOrdenes, String codigoTecnico) {
    List<DetalleOrden> trabajosRealizados = new ArrayList<>();

    for (OrdenServicio orden : listaOrdenes) {
        for (DetalleOrden detalle : orden.getListaDetalles()) {
            if (detalle.getTecnicoResponsable().equals(codigoTecnico)) {
                trabajosRealizados.add(detalle);
            }
        }
    }
    return trabajosRealizados;
}
public static void generarReporteServicios(List<OrdenServicio> listaOrdenes, List<Servicios> listaServicios) {

    for (Servicios servicio : listaServicios) {
        int cantidad = 0;
        double total = 0;

        for (OrdenServicio o : listaOrdenes) {
            for (DetalleOrden d : o.getListaDetalles()) {

                boolean esDeEsteServicio = d.getServicioRequerido().equals(servicio.getNombre());

                if (esDeEsteServicio && d.getEstadoIntervencion().equals("FINALIZADA")) {
                    cantidad++;
                    total += calcularValorDetalle();
                }
            }
        }
        System.out.println("El servicio " + servicio.getNombre() + "ha sido utilizado: " + cantidad + " veces, con un total de $" + total);
    }
}

}

