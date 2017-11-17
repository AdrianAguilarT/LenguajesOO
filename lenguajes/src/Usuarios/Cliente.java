
package Usuarios;

public class Cliente {
    private String nombre, email, direccion;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Cliente(String nombre, String email, String direccion, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.edad = edad;
    }      
}

