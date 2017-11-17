
package cuestionario;

import java.util.ArrayList;
//import java.util.List;

public class Pregunta {
     private ArrayList<Opcion> opcion=new ArrayList<Opcion>();
     private String titulo;

    public ArrayList<Opcion> getOpcion() {
        return opcion;
    }

    public void setOpcion(ArrayList<Opcion> opcion) {
        this.opcion = opcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
     
    public Pregunta(String titulo, ArrayList<Opcion> opciones) {
        this.titulo = titulo;
        this.opcion = opciones;
    }
}
