package Vista;

import Controlador.GestionLenguaje;
import Modelo.LenguajeProgramacion;

import java.util.Scanner;

public class SistemaRegistro {

    private static GestionLenguaje GestionLenguaje = new GestionLenguaje();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        boolean corriendo = true;

        while (corriendo) {
            String opciones = "1. Agregar Lenguaje\n" +
                    "2. Buscar Lenguaje\n" +
                    "3. Eliminar Lenguaje\n" +
                    "4. Imrpimir Lenguajes\n" +
                    "5. Salir\n";
            System.out.println(opciones);
            opcion = teclado.nextInt();

            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el año de Creación");
                    int anioCreacion = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese una característica principal: ");
                    String caracteristicaPrincipal = teclado.nextLine();
                    System.out.println("Ingrese el nombre del Lenguaje: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Para que sirve se usa el Lenguaje: ");
                    String utilizacion = teclado.nextLine();
                    GestionLenguaje.agregarLenguaje(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del Lenguaje que desea buscar: ");
                    String Nombre = teclado.nextLine();
                    LenguajeProgramacion LenguajeBuscado = GestionLenguaje.BuscarLenguaje(Nombre);
                    if (LenguajeBuscado != null) {
                        System.out.println("Lenguaje encontrado: " + LenguajeBuscado);
                    } else {
                        System.out.println("Lenguaje no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del lenguaje a eliminar: ");
                    String NombreEliminar = teclado.nextLine();
                    if (GestionLenguaje.EliminarLenguaje(NombreEliminar)) {
                        System.out.println("Lenguaje eliminado.");
                    } else {
                        System.out.println("Lenguaje no encontrado.");
                    }
                    break;

                case 4:
                    GestionLenguaje.ImprimirLenguajes();
                    break;

                case 5:
                    System.out.println("Vuelva pronto...");
                    corriendo = false;
                    break;
                default:
                    System.out.println("Opción no identificada. Intente de nuevo.");
                    corriendo = false;
                    break;
            }
        }

    }
}