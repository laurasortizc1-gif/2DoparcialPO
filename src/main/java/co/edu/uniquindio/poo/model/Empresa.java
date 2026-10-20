package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


import java.util.LinkedList;
import java.util.List;

public class Empresa {

    private final String nombre;
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private  ArrayList<Equipo> listaEquipos = new ArrayList<>();
    private  ArrayList<Tecnico> listaTecnicos = new ArrayList<>();
    private  ArrayList<Inventario> listaRepuestos = new ArrayList<>();
    private  ArrayList<OrdenServicio> listaOrdenes = new ArrayList<>();
    private  Map<String, ArrayList<Equipo>> equiposMapporCliente=new HashMap<>();
    private List <Inventario> listaRepuestos1 = new LinkedList<>();
    private List <Inventario> listaRepuestos = new LinkedList<>();

    public Empresa(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
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

        OrdenServicio ordenes= new OrdenServicio(ordenServicio.getCodigo(), ordenServicio.getFecha(),
                clienteOptional.get(), ordenServicio.getObservaciones(),estadoOrden.ABIERTA);

            listaOrdenes.add(ordenes);
            return "orden creada exitosamente";
        }else{
            return "el cliente no existe, la orden no puede crearse";
        }
        }

        //6.Agregar detalle a una orden: Seleccionar un equipo del cliente, un servicio y registrar la
        //falla reportada.


       //9.Calcular valor de un detalle: Calcular el costo específico mediante el tipo de servicio
      //solicitado.

      public float calcularValorDetalle(DetalleOrden detalleOrden,Servicios servicio){
         return servicio.costoTotalDettale(detalleOrden, detalleOrden.getEquipoIntervenido());
      }


    public List <Inventario> listaRepuestosEscasos(){
        List <Inventario> listaDePocosRepuestos = new LinkedList<> ();

        for(Inventario a: listaRepuestos){
            if(a.getCantidadDisponible()<5){
                listaDePocosRepuestos.add(a);
            }
        }
        return listaDePocosRepuestos;
    }
}
