/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeaWarCliente.gui;

import Clases.Personaje;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
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
    public ArrayList<Personaje> personajes;
    public boolean vivo = true;
    
    public Cliente(BoardCliente pantallaRef) {
        this.pantallaRef = pantallaRef;
    }
    
     public void conectado(String Nnombre){
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

     public void verificarVivo(){
        for(int i = 0;i <personajes.size();i++){
            personajes.get(i).verificarVivo();
            if(personajes.get(i).vivo){ 
                return;
            }
        }
        
        this.vivo = false;
    }
    
}
