
package Clases;

import java.util.ArrayList;

/**
 *
 * @author ANTONY
 */
public class Bitacora {
    private String rey;
    private String guerrero;
    private String poder;
    private String reyAtacado;
    private String resultado; 
    private ArrayList<String> detalle;

    public Bitacora(String rey, String guerrero, String poder, String reyAtacado, String resultado) {
        this.rey = rey;
        this.guerrero = guerrero;
        this.poder = poder;
        this.reyAtacado = reyAtacado;
        this.resultado = resultado; 
    }

    public String getBitacora()
    {
        return rey+" atacó a "+ reyAtacado + " usando a " + guerrero +" con " + poder +": "+ resultado;
    }
    
    
}

