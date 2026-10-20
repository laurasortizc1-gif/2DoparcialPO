package co.edu.uniquindio.poo.app;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

import co.edu.uniquindio.poo.model.*;
import co.edu.uniquindio.poo.model.Equipo;
import co.edu.uniquindio.poo.model.Inventario;
import co.edu.uniquindio.poo.model.Empresa;

public class Main {
    static void main() {

        Empresa empresa = new Empresa("TechRepair");

        int opcion;
        do {
            opcion = Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Por favor selecciones una opcion :\n ---Menu--\n" +
                            "1. \n" +
                            " 2. \n" +
                            " 3. \n" +
                            " 4. \n" +
                            " 5. \n" +
                            " 6. \n" +
                            " 7. \n" +
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
