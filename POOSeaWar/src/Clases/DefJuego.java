/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Kelly Villalobos
 */
public class DefJuego {
   
    private ArrayList<Poder> poderesDisponibles;
    
    
    
    public DefJuego()    
    {
        Poder p1 = new Poder("Release the Kraken","RSTK");
        Poder p2 = new Poder("Thunders under the sea","TUDS");
        Poder p3 = new Poder("Fish telepathy","FTLP");
        Poder p4 = new Poder("Waves Control","WAVS");
        Poder p5 = new Poder("The Trident","TRID");
        Poder p6 = new Poder("Under Sea Volcanoes", "USVC");
        //Release the kraken
        Ataque a11 = new Ataque("Tentaculos","TNT",3,3,1,1,100);
        Direccion a12 = new Direccion("Kraken Breath","KKB",1,8,0,0,100);
        Ataque a13 = new Ataque("Release the Kraken","RTK",1,1,1,9,100);
        p1.addAtaque(a11);
        p1.addAtaque(a12);
        p1.addAtaque(a13);
        //The trident
        Direccion a21 = new Direccion("Three Lines","3LN",3,3,1,4,100);
        Numero a22 = new Numero("Three numbers","3NM",0,0,0,0,100);
        Ataque a23 = new Ataque("Control the Kraken","CTK",1,1,1,9,100);
        p5.addAtaque(a23);
        p5.addAtaque(a21);
        p5.addAtaque(a22);
        //FISH TELEPHATY        
        Ataque a31 = new Ataque("Fish telepathy","FTP",100,300,0,0,33);
        Ataque a32 = new Ataque("Shark Attack","FTP",4,4,1,10,100); //4esquinas
        Ataque a33 = new Ataque("Pulp","FTP",20,50,8,8,25); //tentaculos random
        p3.addAtaque(a31);
        p3.addAtaque(a32);
        p3.addAtaque(a33);
        //Under sea volcanoes
        Ataque a41 = new Ataque("Volcanoe raising","VLR",1,1,1,10,100);//SE MANTIENE
        Ataque a42 = new Ataque("Volcano explosion","VEX",1,1,10,10,20); 
        Tiempo a43 = new Tiempo("Termal Rush","TRS",0,0,5,5,0,5,0); //da;o equivalente al radio del volcan
        p6.addAtaque(a42);
        p6.addAtaque(a41);
        p6.addAtaque(a43);
        //thunders under the sea
        //Ataque a51 = new Ataque("Thunder rain","THR",100,100,0,0,10,20);/// rango de da;o 
        Ataque a52 = new Ataque("Poseidon thunder","FTP",5,10,2,10,100); 
        Ataque a53 = new Ataque("Eel Attack","EEL",25,100,1,10,10);// EL RADio no es de ataque es cantidad de ataques
        p2.addAtaque(a52);
        p2.addAtaque(a53);
        //waves control
        Ataque a61 = new Ataque("Swirl raising","SWR",1,1,2,10,100);// SE MANTIENE
        Ataque a62 = new Ataque("Send Human garbage","SHG",4,4,1,10,100); // ENVIA 10 POR RADIO COMO ATAQUE
        Ataque a63 = new Ataque("Radioactive rush","FTP",20,50,8,8,25); //50% mantiene en celda
        p4.addAtaque(a61);
        p4.addAtaque(a62);
        p4.addAtaque(a63);
        
        
        
        
        
        
        
        
    }
    
    
    
}
