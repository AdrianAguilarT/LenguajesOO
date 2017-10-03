package abstraccion;

public class Imc {
    Usuario u;
    String resultado;
    public String calcular(){
        float mivalor = u.getPeso()/(u.getAltura()*u.getAltura());
        resultado = "Tu IMC es "+mivalor;
        return resultado;
    }
}