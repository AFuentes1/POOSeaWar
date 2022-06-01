/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeaWarCliente.gui;

import Personaje.Personaje;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class Cliente {
    private final int puerto = 35000; 
    private final String ip_servidor = "localhost";
    public Socket socket; 
    public ObjectOutputStream writer;
    public BoardCliente pantallaRef;
    private boolean isConnected = false;
    private ThreadCliente threadCliente; 
    public ArrayList<Personaje> personajes;
    public ArrayList<JLabel> fichas = new ArrayList<>();
    public boolean vivo = true;
    public String bitacora = "";
     public String ultimoAtaque = "";
    
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
     
    private boolean validarPoderes(String[] texto){
        int i = personajes.size() - 1;
        int mayor = 0;
        int medio = 0;
        int menor = 0;
        while(i != -1){
            if(personajes.get(i).getPoder() == 100){
                mayor++;
            }
            else if(personajes.get(i).getPoder()== 75){
                medio++;
            }
            else if(personajes.get(i).getPoder()== 50){
                menor++;
            }
            else{
                return false;
            }
            if(personajes.get(i).getResistencia() == 100){
                mayor++;
            }
            else if(personajes.get(i).getResistencia()== 75){
                medio++;
            }
            else if(personajes.get(i).getResistencia()== 50){
                menor++;
            }
            else{
                return false;
            }
            if(personajes.get(i).getSanidad() == 100){
                mayor++;
            }
            else if(personajes.get(i).getSanidad()== 75){
                medio++;
            }
            else if(personajes.get(i).getSanidad()== 50){
                menor++;
            }
            else{
                return false;
            }
            i--;
        }
        int valor = 0;
        if(null == texto[3]){
            return false;
        }
        else switch (texto[3]) {
            case "100":
                valor = 100;
                break;
            case "75":
                valor = 75;
                break;
            case "50":
                valor = 50;
                break;
            default:
                return false;
        }
        if(valor == 100){
            if(mayor == 3){
                return false;
            }
            else{
                mayor++;
            }
        }
        else if(valor == 75){
            if(medio == 3){
                return false;
            }
            else{
                medio++;
            }
        }
        else if(valor == 50){
            if(menor == 3){
                return false;
            }
            else{
                menor++;
            }
        }
        
        
        if(null == texto[4]){
            return false;
        }
        else switch (texto[4]) {
            case "100":
                valor = 100;
                break;
            case "75":
                valor = 75;
                break;
            case "50":
                valor = 50;
                break;
            default:
                return false;
        }
        if(valor == 100){
            if(mayor == 3){
                return false;
            }
            else{
                mayor++;
            }
        }
        else if(valor == 75){
            if(medio == 3){
                return false;
            }
            else{
                medio++;
            }
        }
        else if(valor == 50){
            if(menor == 3){
                return false;
            }
            else{
                menor++;
            }
        }
        
        if(null == texto[5]){
            return false;
        }
        else switch (texto[5]) {
            case "100":
                valor = 100;
                break;
            case "75":
                valor = 75;
                break;
            case "50":
                valor = 50;
                break;
            default:
                return false;
        }
        if(valor == 100){
            if(mayor == 3){
                return false;
            }
            else{
                mayor++;
            }
        }
        else if(valor == 75){
            if(medio == 3){
                return false;
            }
            else{
                medio++;
            }
        }
        else if(valor == 50){
            if(menor == 3){
                return false;
            }
            else{
                menor++;
            }
        }
        
        return true;
    }
    
    public boolean isStringInt(String s)
{
    try
    {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException ex)
    {
        return false;
    }
}
    private boolean validarPorcentajes(String texto){
        int i = personajes.size() - 1;
        int porcentajes = 0;
        while(i != -1){
            porcentajes += personajes.get(i).getPorcentaje();
            i--;
        }
        if(!isStringInt(texto)){
            return false;
        }
        else if(Integer.parseInt(texto) > 98 && Integer.parseInt(texto) < 1){
            return false;
        }
        else if(porcentajes+Integer.parseInt(texto) > 100){
            return false;
        }
            
        return true;
    }
    
    private boolean validarAtaque(String texto){
        if(null == texto)return false;
        else switch (texto) {
            case "FishTelephaty":
                break;
            case "Kraken":
                break;
            case "TheTrident":
                break;
            case "Thunder":
                break;
            case "Volcanoes":
                break;
            case "WavesControl":
                break;
            default:
                return false;
        }
        return true;
    }
    
     
    private boolean validarCreacion(String[] texto){
        if(personajes.size() == 3){
            return false;
        }
        else if(texto.length < 8){
            return false;
        }     
        else if(validarPoderes(texto) != true){
            return false;
        }
        else if(validarPorcentajes(texto[7])!= true){
            return false;
        }
        else if(validarAtaque(texto[6])!= true){
            return false;
        }
        return true;
    }
    
    
    
    public String crearPersonajes(String[] separado){
        if(!validarCreacion(separado)){
            return "Ha ocurrido un error en la creacion del personaje";
        }
        Personaje nuevo = new Personaje(); 
        nuevo.setNombre(separado[1]);
        nuevo.setImagen(separado[2]);
        nuevo.setPoder(Integer.parseInt(separado[3]));
        nuevo.setResistencia(Integer.parseInt(separado[4]));
        nuevo.setSanidad(Integer.parseInt(separado[5]));
        //nuevo.setAtaque(separado[6]);
        nuevo.setPorcentaje(Integer.parseInt(separado[7]));
        personajes.add(nuevo);
        if(personajes.size() == 3){
            pantallaRef.crearPantalla();
        }

        return "Personaje creado correctamente";
    }
    
}
