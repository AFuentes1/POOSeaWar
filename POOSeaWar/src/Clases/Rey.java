
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
    
    
    public void aplicarSanidad(int personaje)
    {
        int sanidad  = personajes.get(personaje).sanidad;
        
    }
    
    public void ligarCasillasPersonajes(int personaje, int x, int y,Casilla casilla)
    {
        personajes.get(personaje).addCasilla(casilla);
        matrizCasilla[x][y] = casilla;
    }
    
    public void actualizarVidaCasilla(int indice, int danio, int x, int y)
    {
        matrizCasilla[x][y].restarVida(danio);
    }
    
    public void asignarCasilla(Casilla casilla, int x, int y)
    {
        matrizCasilla[x][y] = casilla;
    }
    
    public void buscarVolcan()
    {
        
    }
}
