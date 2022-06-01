
package Clases;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author ANTONY
 */
public class Personaje {
    public String nombre; 
    public String imagen; 
    public int resistencia, sanidad, fuerza, porcentaje;  
    ArrayList<Poder> Poder = new ArrayList<>();
    ArrayList<Casilla> casillas = new ArrayList();
    
    public String getNombre() {
        return nombre;
    }

    public Personaje(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    
  
    
    public int getSanidad()
    {
        return this.sanidad;
    }
    
    public int getResistencia()
    {
        return this.resistencia;
    }
    
    public void addCasilla(Casilla casilla)
    {
        casillas.add(casilla);
    }
    
    }
    
    
    


