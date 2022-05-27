/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeaWarCliente.gui;

import Comandos.BaseComandos;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ANTONY
 */
public class ThreadCliente extends Thread {
    Cliente cliente;
    ObjectInputStream reader;
    private boolean isRunning = true;
    
     public ThreadCliente(Cliente cliente) {
        this.cliente = cliente;
        try {
            reader = new ObjectInputStream(cliente.socket.getInputStream());
        } catch (IOException ex) {
            //Logger.getLogger(ThreadClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
//Kelly se encarga de comandos   
     
 
    public void run(){
        BaseComandos readMessage = null;
        while (isRunning) {
            
            try {
                readMessage = (BaseComandos)this.reader.readObject();
            } catch (IOException ex) {    
            } catch (ClassNotFoundException ex) {}
            
            
            cliente.pantallaRef.showClientMessage(readMessage.executeOnClient());
        }
    }

}
