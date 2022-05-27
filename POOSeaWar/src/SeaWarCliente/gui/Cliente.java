/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeaWarCliente.gui;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    private final int puerto = 35000; 
    private final String ip_servidor = "localhost";
    public Socket socket; 
    public ObjectOutputStream writer;
    public BoardCliente pantallaRef;
    private boolean isConnected = false;
    private ThreadCliente threadCliente; 
    
    public Cliente(BoardCliente pantallaRef) {
        this.pantallaRef = pantallaRef;
    }
    
     public void conectado(){
        try {
            if (!isConnected){
                this.socket = new Socket(ip_servidor, puerto);
                this.writer = new ObjectOutputStream(socket.getOutputStream());
                this.pantallaRef.showClientMessage("Conectado al server");
                this.threadCliente = new ThreadCliente(this);
                this.threadCliente.start();
                this.isConnected = true;
            }
            //threadClient
        } catch (IOException ex) {
            
        }
    }

    
    
}
