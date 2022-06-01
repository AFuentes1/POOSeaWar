/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Kelly Villalobos
 */
public class Ataque {
    private String nombre;
    private String palabra;
    private int rangoInicio;
    private int rangoFin;
    private int radioInicio;
    private int radioFin;
    private int danio;
    
    public Ataque(String nombre, String palabra, int rangoInicio, int rangoFin, int radioInicio, int radioFin, int danio)
    {
        this.nombre=nombre;
        this.palabra=palabra;
        this.rangoFin=rangoFin;
        this.rangoInicio=rangoInicio;
        this.radioFin= radioFin;
        this.radioInicio=radioInicio;
        this.danio=danio;
        
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * Genera de manera aleatoria las casillas que seran da;adas
     * de acuerdo a los parametros propios del ataque.
     * @return listado de casillas a las cuales se atacara
     */
    public ArrayList<Point> getRandomCasillas()
    {
        ArrayList<Point> casillas = new ArrayList();
        
        int cantidad = (int) (Math.random() * ((rangoFin + 1) - rangoInicio)) + rangoInicio;
        
        for(int i = 0; i<=cantidad;i++)
        {
            int _x = (int)(Math.random()*20 +1);
            int _y = (int)(Math.random()*30 +1);
            Point casilla = new Point(_x,_y);
            casillas.add(casilla);
        }
        
        return casillas;
        
    }
    /**
     * Genera un valor aleatorio de radio de ataque determinado por las propiedades
     * de la clase
     * @return retorna la cantidad de celdas de radio sobre las que se aplica el ataque
     */
    public int getRandomRadio()
    {
      int cantidad = (int) (Math.random() * ((radioFin + 1) - radioInicio)) + radioInicio;
      return cantidad;
        
    }
    
}
