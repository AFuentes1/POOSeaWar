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
    private String nombreComando;
    private String[] args;
    private boolean isBroadcast;
    
    
    public BaseComandos(String nombreComando, String[] args, boolean isBroadcast) {
        this.args = args;
        this.nombreComando = nombreComando;
        this.isBroadcast = isBroadcast;
    }
    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    @Override
    public String getCommandName(){
        return this.nombreComando;
    }
    
    public boolean isBroadcast()
    {
        return this.isBroadcast;
    }
    
    public abstract void executeOnServer();
    public abstract void executeOnClient();
}
