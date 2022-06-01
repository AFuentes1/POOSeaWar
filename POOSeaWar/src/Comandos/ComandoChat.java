/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comandos;

import java.io.Serializable;

/**
 *
 * @author moig1
 */
public class ComandoChat extends BaseComandos implements Serializable{

    public ComandoChat(String nombreComando, String[] args) {
        super(nombreComando, args, true);
    }
    
    public void excecuteOnCliente()    
    {
        String mensaje = getArgs()[1] +">"+ getArgs()[2];
    }
    
}
