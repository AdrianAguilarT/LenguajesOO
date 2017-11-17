
package cuestionario;

import java.util.ArrayList;

public class GeneradorCuestionario {
    public ArrayList<Pregunta> generar() {
        ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
        Opcion op11 = new Opcion("Moscú", false);
        Opcion op12 = new Opcion("Kiev", false);
        Opcion op13 = new Opcion("Helsinki", true);
        Opcion op14 = new Opcion("Turín", false);
        ArrayList<Pregunta> preguntas2 = new ArrayList<Pregunta>();
        Opcion op21 = new Opcion("Canberra", false);
        Opcion op22 = new Opcion("Sidney", false);
        Opcion op23 = new Opcion("Melborne", false);
        Opcion op24 = new Opcion("La Meca", true);
        ArrayList<Pregunta> preguntas3 = new ArrayList<Pregunta>();
        Opcion op31 = new Opcion("Giza", false);
        Opcion op32 = new Opcion("Rabat", false);
        Opcion op33 = new Opcion("Alejandría", false);
        Opcion op34 = new Opcion("El Cairo", true);
        ArrayList<Pregunta> preguntas4 = new ArrayList<Pregunta>();
        Opcion op41 = new Opcion("Mogadiscio", false);
        Opcion op42 = new Opcion("Addis Abeba", true);
        Opcion op43 = new Opcion("Jartum", false);
        Opcion op44 = new Opcion("Yamea", false);
        ArrayList<Pregunta> preguntas5 = new ArrayList<Pregunta>();
        Opcion op51 = new Opcion("Tallin", false);
        Opcion op52 = new Opcion("Bombai", false);
        Opcion op53 = new Opcion("Riga", true);
        Opcion op54 = new Opcion("Ninguna de las Anteriores", false);
        
        ArrayList<Opcion> opciones1=new ArrayList<>();
        opciones1.add(op11);
        opciones1.add(op12);
        opciones1.add(op13);
        opciones1.add(op14);
        ArrayList<Opcion> opciones2=new ArrayList<>();
        opciones2.add(op21);
        opciones2.add(op22);
        opciones2.add(op23);
        opciones2.add(op24);
        ArrayList<Opcion> opciones3=new ArrayList<>();
        opciones3.add(op31);
        opciones3.add(op32);
        opciones3.add(op33);
        opciones3.add(op34);
        ArrayList<Opcion> opciones4=new ArrayList<>();
        opciones4.add(op41);
        opciones4.add(op42);
        opciones4.add(op43);
        opciones4.add(op44);
        ArrayList<Opcion> opciones5=new ArrayList<>();
        opciones5.add(op51);
        opciones5.add(op52);
        opciones5.add(op53);
        opciones5.add(op54);
        
        Pregunta p1=new Pregunta("1.- Capital de Finlandia:",opciones1);
        Pregunta p2=new Pregunta("2.- Capital de Australia:",opciones2);
        Pregunta p3=new Pregunta("3.- Capital de Egipto",opciones3);
        Pregunta p4=new Pregunta("4.- Capital de Etiopía",opciones4);
        Pregunta p5=new Pregunta("5.- Capital de Letonia",opciones5);
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        return preguntas;
    }
}
