package Vista;

import Controlador.GestionLenguaje;
import java.util.Scanner;

public class SistemaRegistro {
    
    private static GestionLenguaje GestionLenguaje = new GestionLenguaje();
    
    public static void main(String[] args) {

        

    }
    
    public static void menu (){
        Scanner teclado = new Scanner (System.in);
        int opcion;
        
        do {
        String opciones = """
                          ------------------------------------------------------
                                        Seleccione una opción
                          ------------------------------------------------------
                          1. Agregar Lenguaje
                          2. Buscar Lenguaje
                          3. Eliminar Lenguaje
                          4. Imrpimir Lenguajes
                          5. Salir
                          ------------------------------------------------------
                          """;
        opcion = teclado.nextInt();
        teclado.nextLine();
        
        switch (opcion){
            case 1:
        }
        } while (true);
        
        
        
    }
    
}
