
package Usuarios;

import java.util.ArrayList;

public class GeneradorClientes {
    public ArrayList<Cliente> generar() {
        ArrayList<Cliente> genCli1 = new ArrayList<>();
            Cliente usr1=new Cliente("Adrián","adrian@gmail.com",Direccion(), 21);
        ArrayList<Cliente> genCli2 = new ArrayList<>();
            Cliente usr2=new Cliente("Juan","juan@gmail.com","Ecatepec, Constitución", 25);
        ArrayList<Cliente> genCli3 = new ArrayList<>();
            Cliente usr3=new Cliente("Ana","ana@gmail.com","Ojo de Agua, Mandarinas", 19);
    }
    
    public ArrayList<Cliente> generar2() {
        ArrayList<Cliente> genDir = new ArrayList<>();
            Direccion dir1=new Direccion("Claveles","Ojo de Agua","Tecámac", 05577);
            Direccion dir2=new Direccion("Constitución","Doctores","Ecatepec", 55770);
            Direccion dir3=new Direccion("Quintero","20 de Mayo","Ecatepec", 65456);
        
        ArrayList<Direccion> direccion1=new ArrayList<>();
        direccion1.add(dir1);
        direccion1.add(dir2);
        direccion1.add(dir3);
        return genDir;
    }
}
