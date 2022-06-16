package Entregable2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class principal {

    //Creo la lista de clase Persona por fuera del main para llamarla en futuros métodos.
    static List<Persona> listPersonas = new ArrayList<>();

    //Creo método main
    public static void main(String[] args) {
        
        //Creo los objetos de clase Persona y les asigno valores a sus atributos
        Persona persona1 = new Persona("Ibrian", "Festorazzi");
        Persona persona2 = new Persona("Juan", "Tallarini");
        Persona persona3 = new Persona("Maria", "Pancino");
        Persona persona4 = new Persona("Adriana", "Pestone");
        Persona persona5 = new Persona("Lucia", "Tucone");

        
        //Agrego los objetos anteriormente creados - También se puede crear objeto, asignarle valor y agregar a la lista en un solo paso.

        listPersonas.add(persona1);
        listPersonas.add(persona2);
        listPersonas.add(persona3);
        listPersonas.add(persona4);
        listPersonas.add(persona5);

        //Llamo a los métodos para que cumplan con su función de vida.
        ordenaNombre();
        ordenaApellidoAZ();
        ordenaApellidoZA();
        
        /* 
        //Recorro la lista, la ordeno y la imprimo como se solicita.
        Persona listaPersonas2[] = new Persona[5];
        listaPersonas2[0] = persona1;
        listaPersonas2[1] = persona2;
        listaPersonas2[2] = persona3;
        listaPersonas2[3] = persona4;
        listaPersonas2[4] = persona5;
        System.out.println(listaPersonas2[0]);
        */
    }


    //Creo un método que ordena por nombre.
    public static void ordenaNombre() {
        System.out.println(" ");
        System.out.println("Ordeno por Nombre:");
        System.out.println(" ");

        Collections.sort(listPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return new String(persona1.getNombre()).compareTo(new String(persona2.getNombre()));
            }
        });
        System.out.println(listPersonas);   
    }

    //Creo un método que ordena por Apellido de la A a la Z.
    public static void ordenaApellidoAZ() {
        System.out.println(" ");
        System.out.println("Ordeno por apellido:");
        System.out.println(" ");
    
        Collections.sort(listPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return new String(persona1.getApellido()).compareTo(new String(persona2.getApellido()));
            }
        });
        System.out.println(listPersonas);
    }

    //Creo un método que ordena por Apellido de la Z a la A.
    public static void ordenaApellidoZA() {
        System.out.println(" ");
        System.out.println("Ordeno inversamente por apellido:");
        System.out.println(" ");

        Collections.sort(listPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return new String(persona2.getApellido()).compareTo(new String(persona1.getApellido()));
            }
        });
        System.out.println(listPersonas);
    }


}
