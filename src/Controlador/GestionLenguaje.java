package Controlador;

import Modelo.LenguajeProgramacion;

public class GestionLenguaje {
    
    //Variables estáticas
    private static final int FACTOR_CRECIMIENTO = 2;
    private static LenguajeProgramacion[] ArregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
    private static int ContadorLenguajes = 0;
    
    public static void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        //Aumentar tamaño en caso no quepan
        if (ContadorLenguajes >= ArregloLenguajes.length) {
            AumentarCapacidad();
        }
        ArregloLenguajes[ContadorLenguajes] = new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
        ContadorLenguajes++;
    }
    
    //Método para aumentar la capacidad
    private static void AumentarCapacidad() {
        LenguajeProgramacion[] NuevoArreglo = new LenguajeProgramacion[ArregloLenguajes.length + FACTOR_CRECIMIENTO];
        System.arraycopy(ArregloLenguajes, 0, NuevoArreglo, 0, ArregloLenguajes.length);
        ArregloLenguajes = NuevoArreglo;
    }
    
    //Método para buscar lenguaje por nombre
    public LenguajeProgramacion BuscarLenguaje (String Nombre) {
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equalsIgnoreCase(Nombre)) {
                return ArregloLenguajes[i]; // Retornar el lenguaje encontrado
            }    
        }
        return null; //En caso no se encuentre el lenguaje
    }
    
    //Método para eliminar un lenguaje por nombre
    public static boolean EliminarLenguaje(String nombre) {
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                // Desplazar elementos hacia la izquierda
                for (int j = i; j < ContadorLenguajes - 1; j++) {
                    ArregloLenguajes[j] = ArregloLenguajes[j + 1];
                }
                ArregloLenguajes[--ContadorLenguajes - 1] = null; // Eliminar el último espacio y reducir contador
                return true; // Lenguaje Eliminado
            }
        }
        return false; //En caso no se encuentre el lenguaje
    }
    
    //Método para obtener el arreglo de lenguajes
     public LenguajeProgramacion[] getArregloLenguajes() {
        return ArregloLenguajes;       
    }
    
     //Método para imprimir lenguajes
     public static void ImprimirLenguajes(){
         if (ContadorLenguajes == 0) {
             System.out.println("No se encuentran lenguajes registrados");
         } else {
             for (int i = 0; i < ContadorLenguajes; i++) {
                 System.out.println(ArregloLenguajes[i]);
             }
         }
     }  
}
