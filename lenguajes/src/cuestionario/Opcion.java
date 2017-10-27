
package cuestionario;

public class Opcion {
    String titulo;
    Boolean correcta;

    Opcion(String moscú, boolean b) {
    }
    
    public String getTitulo(String titulo) {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getCorrecta() {
        return correcta;
    }

    public void setCorrecta(Boolean correcta) {
        this.correcta = correcta;
    }
}
