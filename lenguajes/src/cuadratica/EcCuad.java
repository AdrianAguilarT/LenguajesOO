
package cuadratica;

public class EcCuad {
    private float a, b, c;

    float determinante(){
        float det=(float)(Math.pow(-b,2)-4*a*c);
        return det;
    }
    
    public String raiz1(){
        float det=determinante();
        String sol="Raiz 1";
        if(det<0)
            sol="Raíz imaginaria";
        else{
            float r1=(float)(-b+Math.sqrt(det))/(2*a);
            sol="X1 = "+r1;
        }
        return sol;
    }
    
    public String raiz2(){
        float det=determinante();
        String sol="Raiz 2";
        if(det<0)
            sol="Raíz imaginaria";
        else{
            float r2=(float)(-b-Math.sqrt(det))/(2*a);
            sol="X2 = "+r2;
        }
        return sol;
    }
    
    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
}
