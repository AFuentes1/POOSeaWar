/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comandos;

/**
 *
 * @author moig1
 */
public class Utils {
    
    public static String[] convertToArray(String comando)
    {
        return comando.split("-");
    }
    
    public static String concatArray(String[] args )
    {
        String comando = "";
        for(int i=0;i<args.length;i++)
            comando += args[i]+"-";
        return comando;
    }
    
}
