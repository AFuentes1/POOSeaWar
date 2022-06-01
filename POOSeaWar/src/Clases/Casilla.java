
package Clases;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Kelly Villalobos Baez
 */
public class Casilla {
    private int vida;
    private int x;
    private int y;
    private boolean ocupada;
    private boolean volcan;
    private boolean remolino;
    private boolean radioactiva;
    private boolean escudo;
    private int valorEscudo;
    private Color color;
    private  ArrayList<Ataque> ataques;
    
    
    public Casilla(int x, int y, Color color)
    {
        vida=100;
        valorEscudo=0;
        ocupada=false;
        escudo = false;
        radioactiva=false;
        volcan=false;
        remolino=false;
        this.x=x;
        this.y=y;
        this.color = color;
        ataques = new  ArrayList();
        
    }
    
    public int getVida()
    {
        return this.vida;
    }
    
    public boolean getOcupada()
    {
        return this.ocupada;
    }        
    public void setEscudo(boolean escudo)
    {
        this.escudo = escudo;
    }
    public void setRadioactiva()
    {
        this.ocupada=true;
        this.radioactiva = true;
    }
    public boolean esRadioactiva()
    {
        return this.radioactiva;
    }
    public boolean tieneVolcan()
    {
        return this.volcan;
    }
    public void setVolcan()
    {
        this.ocupada=true;
        this.volcan=true;
    }
    
    public void setRemolino()
    {
        this.ocupada=true;
        this.remolino=true;
    }
    public boolean tieneRemolino()
    {
        return this.remolino;
    }
    
    public void setValorEscudo(int valor)
    {
        this.valorEscudo = valor;
    }
    
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public void addAtaque(Ataque ataque)
    {
        ataques.add(ataque);
    }
    
    public void restarVida(int porcentaje)
    {
        int danio=(this.vida * porcentaje)/100;
        if(escudo)
        {
             if(valorEscudo>porcentaje)
                 danio=0;
             else
                 danio = danio - (this.valorEscudo * this.vida)/100;
             
            escudo=false;
        }
        if(this.vida>danio)
            this.vida -=danio;
        else
            this.vida=0;
    }
    
    public void sumarVida(int vida)
    {
        if(this.vida < 100 - vida)
            this.vida +=vida;
        else
            this.vida=100;
    }
    
}
