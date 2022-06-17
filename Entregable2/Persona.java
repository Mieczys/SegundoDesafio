package Entregable2;


public class Persona {

    //Creo los atributos de la clase
    private String nombre;
    private String apellido;

    

    
    //Creo el constructor de la clase.
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Creo setters y getters.
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    //Creo un toString para mostrar por consola.
    @Override
    public String toString() {
        return "Apellido= " + apellido + " - nombre= " + nombre;
    }

    

    
}
