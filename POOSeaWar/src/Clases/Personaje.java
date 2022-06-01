
package Clases;

import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author ANTONY
 */
public class Personaje {
    public String nombre; 
    public String imagen; 
    public int resistencia, sanidad, fuerza, porcentaje; 
    public ArrayList<JLabel> fichas = new ArrayList<>();
    
    public void verificarVivo(){
        String msm = "";
        for(int i = 0;i <fichas.size();i++){  
            msm = fichas.get(i).getText();
            if("0".equals(msm) == false){ 
                return;
            }
        }
        this.vivo = false;
    }
   
    ArrayList<Ataque> Ataques = new ArrayList<Ataque>();
    public boolean vivo = true; 
    
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
    
    public int getSanidad()
    {
        return this.sanidad;
    }
    
    public int getResistencia()
    {
        return this.resistencia;
    }

    
    
    
    }
    
    
    


