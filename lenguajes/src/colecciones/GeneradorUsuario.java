
package colecciones;

import java.util.ArrayList;
import java.util.List;

public class GeneradorUsuario {
    public static void main(String[] args) {
        // Creación de 5 usuarios
        Usuario u1=new Usuario();
        u1.setEdad(23);
        u1.setEmail("rapidcl@gmail.com");
        u1.setNombre("Ana");
        Usuario u2=new Usuario();
        u2.setEdad(21);
        u2.setEmail("PedroP@gmail.com");
        u2.setNombre("Pedro");
        Usuario u3=new Usuario();
        u3.setEdad(17);
        u3.setEmail("JuanG@gmail.com");
        u3.setNombre("Juan");
        Usuario u4=new Usuario();
        u4.setEdad(28);
        u4.setEmail("ricardot@gmail.com");
        u4.setNombre("Ricardo");
        Usuario u5=new Usuario();
        u5.setEdad(19);
        u5.setEmail("pablopt@gmail.com");
        u5.setNombre("Pablo");
        
        //Arreglo mutable:
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>(); // <> Indica que solo aceptará objetos de la clase usuarios
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        // Iteración para ver los nombres
        for(Usuario u:usuarios){
            System.out.println("Nombre: "+u.getNombre()+" Email: "+u.getEmail()+" Edad: "+u.getEdad());
        }
    }
}
