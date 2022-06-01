/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author moig1
 */
public class Poder {
    
    private String nombre;
    private String codigo;
    private ArrayList<Ataque> ataques;
    
    
    public Poder(String nombre, String codigo)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        ataques = new ArrayList();
    }
    
    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }
    
    public Ataque getAtaque(String nombre)
    {
        for( Ataque ataque : ataques)
        {
           if(ataque.getNombre().equals(nombre))
               return ataque;
        }
        return null;
    }

    public void addAtaque(Ataque ataque)
    {
        this.ataques.add(ataque);
    }
    
    public void setAtaques(ArrayList<Ataque> Ataques) {
        this.ataques = Ataques;
    }
    
    
    
}
