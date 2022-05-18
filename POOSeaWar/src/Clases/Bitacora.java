
package Clases;

/**
 *
 * @author ANTONY
 */
public class Bitacora {
    private String rey;
    private String guerrero;
    private String ataque;
    private String reyAtacado;
    private String resultado; 

    public Bitacora(String rey, String guerrero, String ataque, String reyAtacado, String resultado) {
        this.rey = rey;
        this.guerrero = guerrero;
        this.ataque = ataque;
        this.reyAtacado = reyAtacado;
        this.resultado = resultado; 
    }

    public String getRey() {
        return rey;
    }

    public String getGuerrero() {
        return guerrero;
    }

    public String getAtaque() {
        return ataque;
    }

    public String getReyAtacado() {
        return reyAtacado;
    }

    public String getResultado() {
        return resultado;
    }
    
    
    
}

