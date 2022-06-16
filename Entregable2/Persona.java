package Entregable2;


public class Persona {

    //Creo los atributos de la clase
    String nombre;
    String apellido;

    

    
    //Creo el constructor de la clase.
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Creo solamente los getters ya que no voy a utilizar setters.
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    //Creo un toString para mostrar por consola.
    @Override
    public String toString() {
        return "Apellido= " + apellido + " - nombre= " + nombre;
    }

    

    
}
