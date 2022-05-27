/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;


import Comandos.BaseComandos;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ANTONY
 */
public class Server extends Thread{
    private final int puerto = 35000; 
    private final int maxConecciones = 6; 
    private ServerSocket serverSoccket;
    private boolean estaCorriendo = true;
    private boolean estaEsperando = false;
    private ArrayList<ThreadServer> conecciones;
    public BoardServidor pantallaRef;
    
    
    public Server(BoardServidor screenRef){
        this.pantallaRef = screenRef;
        this.runServidor();
    }
    
    public void broadcast (BaseComandos comando){
        
        for (ThreadServer connection : conecciones) {
            try {
                connection.writer.writeObject(comando);
                //this.screenRef.showServerMessage(command.toString());
            } catch (IOException ex) {
                
            }
        }
        
    }
    
    public String toString(){
        String str = "Datos del servidor:\n";
        str += "Puerto: " + puerto + " \n";
        str += "Conexiones actuales: " + conecciones.size() +" de " + maxConecciones;
        return str;
    }
    
    private void runServidor(){
        try {
            this.serverSoccket = new ServerSocket(puerto);
            this.conecciones = new ArrayList<ThreadServer>();
        } catch (IOException ex) {       
        }
    }
    
    public void run(){
        this.pantallaRef.showServerMessage("Esta corriendo el servidor!");
        this.pantallaRef.showServerMessage("Esperando conecciones!");
        while (estaCorriendo){
            try {
                Socket newSocket = serverSoccket.accept();
                this.pantallaRef.showServerMessage("Nuevo cliente conectado");
                ThreadServer newThread = new ThreadServer(newSocket, this);  
                newThread.start();
                conecciones.add(newThread);
                this.pantallaRef.showServerMessage("Nuevo thread creado");
                
                if (conecciones.size() >= maxConecciones){
                    estaEsperando = true;
                }
                
                while(estaEsperando){
                    sleep(1000);
                }
                
            } catch (IOException ex) {
                
            } catch (InterruptedException ex) {
                
            }
            
        
        }
    }
    
    
}
