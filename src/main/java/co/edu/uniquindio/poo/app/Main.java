package co.edu.uniquindio.poo.app;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.OrdenServicio;
import co.edu.uniquindio.poo.model.Cliente;

public class Main {
    static void main() {

        Empresa empresa = new Empresa("TechRepair");

        int opcion;
        do {
            opcion = Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Por favor selecciones una opcion :\n ---Menu--\n" +
                            "1. Registrar usuario\n" +
                            " 2. Buscar usuario vip\n" +
                            " 3. Mostrar Matriz ocupacional\n" +
                            " 4. Verificar reserva especial\n" +
                            " 5. Mostrar reporte de ingresos\n" +
                            " 6. Mostrar control maquinas\n" +
                            " 7. Mostrar analisis rendimiento entrenadores\n" +
                            ""));

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 0:

                    break;
                default:

            }
        }
        while (opcion != 0);
    }
}
