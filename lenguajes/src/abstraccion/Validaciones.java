
package abstraccion;

public class Validaciones {
    public static void validarNumeroNoNegativo(float numero) throws NumeroNegativoException{    // Indica que PUEDE mandar una Excepción
        if(numero<0) throw new NumeroNegativoException();   // Si es menor a 0, lanza una nueva excepción.
    }
}
