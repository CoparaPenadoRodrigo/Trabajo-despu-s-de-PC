package Modelo;

public class LenguajeProgramacion {
    
    private int AnioCreacion;
    private String CaracteristicaPrincipal;
    private String Nombre;
    private String Utilizacion;
    
    //Constructor
    
    public LenguajeProgramacion(int AnioCreacion, String CaracteristicaPrincipal, String Nombre, String Utilizacion) {
        this.AnioCreacion = AnioCreacion;
        this.CaracteristicaPrincipal = CaracteristicaPrincipal;
        this.Nombre = Nombre;
        this.Utilizacion = Utilizacion;
    }
    
    //Implementación de getter y setter
    
    public int getAnioCreacion() {
        return AnioCreacion;
    }
    
    public void setAnioCreacion(int AnioCreacion) {
        this.AnioCreacion = AnioCreacion;
    }
    
    public String getCaracteristicaPrincipal() {
        return CaracteristicaPrincipal;
    }
    
    public void setCaracteristicaPrincipal(String CaracteristicaPrincipal) {
        this.CaracteristicaPrincipal = CaracteristicaPrincipal;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getUtilizacion() {
        return Utilizacion;
    }
    
    public void setUtilizacion(String Utilizacion) {
        this.Utilizacion = Utilizacion;
    }
    
    //Método toString
    @Override
    public String toString(){
        return "\n-Anio de creacion = " + AnioCreacion +
               "\n-Caracteristica principal = " + CaracteristicaPrincipal +
               "\n-Nombre = " + Nombre +
               "\n-Utilizacion = " + Utilizacion
                ;
    }
}
