package referenciados;

import abstraccion.Usuario;

public class Prueba2 {
    public static void main(String[] args) {        // psvm
        // Todos los referenciados pertenecen a una clase. Además se necesita uno o más primitivos para definirlos.
        String nombre="Adrián Aguilar T";
        String otro=new String("Sookie");
        Usuario u=new Usuario();        // Requiere importación del Paquete y clase al que hace referencia (import abstraccion.Usuario;).
        u.setAltura(1.68f);
        u.setPeso(71);
    }
}
