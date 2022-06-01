/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ataques;

import SeaWarCliente.gui.BoardCliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JLabel;
//import servidor.FileManager;

/**
 *
 * @author Usuario
 */
public abstract class Ataques implements Serializable{
    public String nombre;
    

    public Ataques(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Stack < Integer > aleatorio(int cant){
        int pos;
            Stack < Integer > pCartas = new Stack < Integer > ();
            for (int i = 0; i < cant ; i++) {
              pos = (int) Math.floor(Math.random() * cant );
              while (pCartas.contains(pos)) {
                pos = (int) Math.floor(Math.random() * cant );
              }
              pCartas.push(pos);
            }
        return pCartas;
    }
    
    
    
    public int dannarFichas(BoardCliente BoardCliente, JLabel lbl, int danno){
        
        int vida = 100;
        String bitacora = "";
        for(int j = 0;j < 20;j++){
                for(int c = 0;c < 30;c++){
                    if(BoardCliente.labelMatrix[j][c] == lbl){ 
                        
                        if(Integer.parseInt(BoardCliente.labelMatrix[j][c].getText()) != 0){
                            if(Integer.parseInt(BoardCliente.labelMatrix[j][c].getText())  - danno <= 0){
                                bitacora += "La casilla: " + BoardCliente.labelMatrix[j][c] + " recibio " + danno + " de danno, su vida paso de " + BoardCliente.labelMatrix[j][c].getText() + " a 0";
                                BoardCliente.labelMatrix[j][c].setText("0");
                            }
                            else{
                                bitacora += "La casilla: " + BoardCliente.labelMatrix[j][c] + " recibio " + danno + " de danno, su vida paso de " + BoardCliente.labelMatrix[j][c].getText() + " a " + (Integer.parseInt(BoardCliente.labelMatrix[j][c].getText()) - danno);
                                danno = Integer.parseInt(BoardCliente.labelMatrix[j][c].getText()) - danno;
                                BoardCliente.labelMatrix[j][c].setText( String.valueOf(danno));
                            }
                        //System.out.println(fichas.get(i).vida);
                    }
                        else{
                            bitacora += "La casilla: " + BoardCliente.labelMatrix[j][c] + " no recibio danno ya que ya estaba en 0";
                            
                        }
                        BoardCliente.cliente.bitacora += bitacora;
                        BoardCliente.cliente.ultimoAtaque += bitacora;
                        return Integer.parseInt(BoardCliente.labelMatrix[j][c].getText());
                    }
                }
        }
        return vida;
    }
    
}
