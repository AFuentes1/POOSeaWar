/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comandos;

import java.io.Serializable;

/**
 *
 * @author ANTONY
 */
public abstract class BaseComandos implements iCommand, Serializable{
    private String[] args;
    private boolean isBroadcast;
    private String nombreComando;
    
    public BaseComandos(String nombreComando, String[] args, boolean isBroadcast) {
        this.args = args;
        this.isBroadcast = isBroadcast;
        this.nombreComando = nombreComando;
    }
    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public String getCommandName(){
        return this.nombreComando;
    }
    
    public boolean isBroadcast(){
        return isBroadcast;
    }
    
    
    public abstract String executeOnServer();
    public abstract String executeOnClient();
}
