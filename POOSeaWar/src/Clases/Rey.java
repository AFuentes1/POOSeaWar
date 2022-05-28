
package Clases;

import java.util.ArrayList;

/**
 *
 * @author ANTONY
 */
public class Rey {
    private String rey; 
    ArrayList<Personaje> personajes;
    Casilla matrizCasilla[][] ; 
    

    
    public Rey(String nombre)
    {
        this.rey = nombre;
        personajes = new ArrayList<Personaje>();
        matrizCasilla = new Casilla[30][20]; 
    }
    
    
    
    
    public void actualizarVidaCasilla(int indice, int danio, int x, int y)
    {
        int sanidad = personajes.get(indice).getSanidad();
        danio -=sanidad;
        matrizCasilla[x][y].restarVida(danio);
        
        
    }
    
    public void asignarCasilla(Casilla casilla, int x, int y)
    {
        matrizCasilla[x][y] = casilla;
    }
    
}
