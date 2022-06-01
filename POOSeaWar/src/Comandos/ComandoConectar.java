/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comandos;

import java.io.Serializable;

/**
 *
 * @author Kelly Villalobos Baez
 */
public class ComandoConectar extends BaseComandos implements Serializable {

    public ComandoConectar(String nombreComando, String[] args) {
        super(nombreComando, args, false);
    }
    
     @Override
     public  void executeOnServer(){}
     @Override
    public void executeOnClient(){}
    
    
    
    
}
