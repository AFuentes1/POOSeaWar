/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comandos;

/**
 *
 * @author moig1
 */
public class FabricaComando {
    
    public BaseComandos getCommand(EnumComandos nombre, String[] args)    
    {
            switch(nombre)
            {
                //CONECTAR
                case EnumComandos.CNSE:
                    return new ComandoConectar(nombre,args);
                //CREAR PERSONAJE
                case "CRPE":
                    break;
                //INICIAR PARTIDA
                case "INIP":
                    break;
                //CHAT GENERAL
                case "CHGE":
                    break;
                //CHAT PRIVADO
                case "CHPR":
                    break;
                case "ATQU":
                    return new ComandoAtaque(nombre,args);
                case "VERC":
                    break;
                case "CONE":
                    break;
                case "SALT":
                    break;
                case "REND":
                    break;
                case "LOGT":
                    break;
                case "LOGR":
                    break;
                case "SANI":
                    break;
                case "ESCU":
                    break;
                case "MOVC":
                    break;
                
            }  
            return null;
    }
    
}
