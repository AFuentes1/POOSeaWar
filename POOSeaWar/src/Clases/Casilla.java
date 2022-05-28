
package Clases;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author ANTONY
 */
public class Casilla {
    private int vidaInicial;
    private  ArrayList<Ataque> ataques;
    
    
    public Casilla()
    {
        vidaInicial=100;
        ataques = new  ArrayList();
        
    }
    
    public void addAtaque(Ataque ataque)
    {
        ataques.add(ataque);
    }
    
    public void restarVida(int vida)
    {
        if(this.vidaInicial>vida)
            this.vidaInicial -=vida;
        else
            this.vidaInicial=0;
    }
    
}
