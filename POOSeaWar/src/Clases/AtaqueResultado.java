/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Kelly Villalobos
 */
public class AtaqueResultado {
    public int cantidadCasillas;
    public ArrayList<AtaqueCasilla> detalle;
    
    public AtaqueResultado()
    {
    }
    public void addDetalle(AtaqueCasilla ataque)
    {
        detalle.add(ataque);
    }
}
