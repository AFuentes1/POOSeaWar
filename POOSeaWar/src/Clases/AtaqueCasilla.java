/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author moig1
 */
public class AtaqueCasilla {
    private int x;
    private int y;
    private boolean fallo;
    private int danio;
    private EnumDireccion direccion;
    private EnumPermanece permanece;
    private int radio;
    private int tiempo;
    
    public AtaqueCasilla(int x, int y, int danio,EnumDireccion direccion, EnumPermanece permanece, int radio, int tiempo)
    {
        this.x=x;
        this.y=y;
        this.danio=danio;
        this.direccion=direccion;
        this.permanece=permanece;
        this.radio=radio;
        this.tiempo=tiempo;
        this.fallo=false;
    }
    
    public void setFallo()
    {
        this.fallo=true;
    }
    
    public boolean getFallo()
    {
        return this.fallo;
    }
    public int getTiempo()
    {
        return this.tiempo;
    }
    public int getRadio()
    {
        return this.radio;
    }
    public EnumDireccion getDireccion()
    {
        return this.direccion;
    }
    public EnumPermanece getPermanece()
    {
        return this.permanece;
    }
}
