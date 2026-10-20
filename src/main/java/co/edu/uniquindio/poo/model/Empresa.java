package co.edu.uniquindio.poo.model;

import java.util.LinkedList;
import java.util.List;

public class Empresa {

    private final String nombre;
    private List <Inventario> listaRepuestos = new LinkedList<>();

    public Empresa(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
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
