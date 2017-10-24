
package cuestionario;

import java.util.ArrayList;
import java.util.*;

public class GeneradorCuestionario {
    public ArrayList<Pregunta> generar() {
        ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
        Opcion op11 = new Opcion("Moscú", false);
        Opcion op12 = new Opcion("Kiev", false);
        Opcion op13 = new Opcion("Helsinki", true);
        Opcion op14 = new Opcion("Turín", false);
        
        ArrayList<Opcion> opciones1=new ArrayList<>();
        opciones1.add(op11);
        opciones1.add(op12);
        opciones1.add(op13);
        opciones1.add(op14);
        
        Pregunta p1=new Pregunta("Capital de Finlandia",opciones1);
        preguntas.add(p1);
    }
}
