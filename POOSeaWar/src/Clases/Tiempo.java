/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author moig1
 */
public class Tiempo extends Ataque {
    private int tiempoI;
    private int tiempoF;
            
    public Tiempo(String nombre, String codigo, int rangoI, int rangoF, int radioI, int radioF,int danio,int tiempoI, int tiempoF)
    {
        super(nombre,codigo,rangoI,rangoF,radioI,radioF,danio);
        this.tiempoI = tiempoI;
        this.tiempoF = tiempoF;
    }
}
