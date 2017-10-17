
package arreglos;

public class Arreglos1 {
    public static void main(String[] args) {
        // Generar un arreglo No Mutable:
        int x[]={12,-4,7};
        System.out.println("El tamaño es "+x.length);
        //Para acceder a un elemento:
        System.out.println("En el índice 0 está "+x[0]);
        int []y = {2,4,5};
        int []z = new int[3];
        z[0]=-12;
        z[1]=5;
        z[2]=4;
        //Vamos a iterar el arreglo z usando un  ciclo for
        for(int i=0;i<z.length;i++)
            System.out.println(z[i]);
        //Ciclo for mejorado
        for(int valor:z)
            System.out.println("Mejorado "+valor);
        //Crear arreglo basado en String
        String mensaje="Hola, ¿cómo estás?";
        byte []w = mensaje.getBytes();
        System.out.println("Tamaño "+w.length);
        String codificado="";
        for(byte b:w){
            System.out.println("El byte es "+b);
            codificado=codificado+b;
        }
        System.out.println(codificado);
    }
}