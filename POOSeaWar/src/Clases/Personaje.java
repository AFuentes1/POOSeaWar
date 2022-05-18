
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
    ArrayList<Ataque> Ataques = new ArrayList<Ataque>();
    
    public String getNombre() {
        return nombre;
    }

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    
    public ArrayList<Ataque> getAtaques() {
        return Ataques;
    }

    public void setAtaques(ArrayList<Ataque> Ataques) {
        this.Ataques = Ataques;
    }
    
    
    
    
    
    }
    
    
    


