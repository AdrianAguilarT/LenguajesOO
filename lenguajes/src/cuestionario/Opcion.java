
package cuestionario;

public class Opcion {
    private String titulo;
    private boolean correcta;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getCorrecta() {
        return correcta;
    }

    public void setCorrecta(Boolean correcta) {
        this.correcta = correcta;
    }
    
    public Opcion(String titulo, boolean correcto) {
        this.titulo = titulo;
        this.correcta = correcto;
    }
}
