
package cuestionario;

import java.util.ArrayList;
//import java.util.List;

public class Pregunta {
     ArrayList<Opcion> opcion=new ArrayList<Opcion>();
     String titulo;

    Pregunta(String capital_de_Finlandia, ArrayList<Opcion> opciones1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
     
     
}
