/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
/**
 *
 * @author T-102
 */
public class Prueba1 {
    public static void main(String[] args) {
        // Prueba de tipos de datos Integrales
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        //Algunas líneas marcarán error.
        b=(byte)s;      //b=s; Error de casting. Short no cabe en Byte
        s=b;
        i=s;
        l=s;
        s=(short)l;
        b=(byte)i;
        
        // Flotantes
        float f=2.0f;       // f convierte el valor a float
        double d=2.0;
        
        // Boolean
        boolean b1=true;
        boolean b2=false;
        
        // Caracter
        char algo='h';
        char otro=' ';
    }
}
