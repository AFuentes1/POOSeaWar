/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SeaWarCliente.gui;

import Personaje.Personaje;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.IconUIResource;


/**
 *
 * @author ANTONY
 */
public class BoardCliente extends javax.swing.JFrame {
    
    public Cliente cliente;
    private ArrayList<JLabel> labels = new ArrayList();
    public JLabel[][] labelMatrix = new JLabel[20][30];
    public boolean vivo = true;
    private String nombreJugador = "";
 
    private Clases.Rey miPersonaje;
    /**
     * Creates new form BoardCliente
     */
    public BoardCliente() {
        
        initComponents();
        agregarLbl();
        cliente = new Cliente(this);
        Dimension dim = this.getToolkit().getScreenSize();
        dim.setSize(dim.width, dim.height + 40);
        this.setSize(dim);
    }

    public void showClientMessage(String msg){
        this.TxtBitacora.append(msg + "\n");
    }
    
    public void newPlayer(String nombre){
        try{
        Cliente cliente = new Cliente(this);
        this.pack();
        this.setVisible(true); 
        cliente.conectado(nombre);
               
        }
        catch(Exception e){
            
        }
    }
    
    public boolean verificarVivo(){
        if(cliente != null){
            return cliente.vivo;
        }
        return true;
    }   
    
    public void addMensaje(String msj)              // Para agregar un mensaje en la interfaz del cliente
    {
        TextAreaComandos.append(msj + "\n");
    }  
    
    private void acomodarLabelsPersonajes(){
//        for(int i = 0;i < 3;i++){
//            Personaje perso = cliente.personajes.get(i);
//            if(i == 0){
//                darImagen(imagen_lbl1, perso.imagen);
//                nombre_lbl1.setText(perso.getNombre());
//                poder_lbl1.setText(perso.getAtaque().getNombre());
//                porcentaje_lbl1.setText((perso.getPorcentaje()*100)+"");
//                num_poder1.setText(perso.getPoder()+"");
//                resis_num1.setText(perso.getResistencia()+"");
//                sanidad_num1.setText(perso.getSanidad()+"");
//                lbl_vida1.setText(perso.getNombre());
//                porcentajePerso1.setText((perso.getPorcentaje()*100)+" %");
//                casillas1.setText((600*perso.getPorcentaje())+" de "+(600*perso.getPorcentaje())+" casillas ");
//            }
//            else if(i == 1){
//                darImagen(imagen_lbl2, perso.imagen);
//                nombre_lbl2.setText(perso.getNombre());
//                poder_lbl2.setText(perso.getAtaque().getNombre());
//                porcentaje_lbl2.setText((perso.getPorcentaje()*100)+"");
//                num_poder2.setText(perso.getPoder()+"");
//                resis_num2.setText(perso.getResistencia()+"");
//                sanidad_num2.setText(perso.getSanidad()+"");
//                lbl_vida2.setText(perso.getNombre());
//                porcentajePerso2.setText((perso.getPorcentaje()*100)+" %");
//                casillas2.setText((600*perso.getPorcentaje())+" de "+(600*perso.getPorcentaje())+" casillas ");
//            }
//            else if(i == 2){
//                darImagen(imagen_lbl3, perso.imagen);
//                nombre_lbl3.setText(perso.getNombre());
//                poder_lbl3.setText(perso.getAtaque().getNombre());
//                porcentaje_lbl3.setText((perso.getPorcentaje()*100)+"");
//                num_poder3.setText(perso.getPoder()+"");
//                resis_num3.setText(perso.getResistencia()+"");
//                sanidad_num3.setText(perso.getSanidad()+"");
//                lbl_vida3.setText(perso.getNombre());
//                porcentajePerso3.setText((perso.getPorcentaje()*100)+" %");
//                casillas3.setText((600*perso.getPorcentaje())+" de "+(600*perso.getPorcentaje())+" casillas ");
//            }
//            
//            
//            
//        }
    }
    
    
    public void crearPantalla(){
        ArrayList<Icon> iconos = new ArrayList<>();
        iconos.add(new ImageIcon(getClass().getResource("/Imagenes/azul.png")));
        iconos.add(new ImageIcon(getClass().getResource("/Imagenes/gris.png")));
        iconos.add(new ImageIcon(getClass().getResource("/Imagenes/anaranjado.png")));
        int cont = 0;
        
        int pos;
        int nCartas = 600;
        Stack < Integer > pCartas = new Stack < Integer > ();
        for (int i = 0; i < nCartas ; i++) {
          pos = (int) Math.floor(Math.random() * nCartas );
          while (pCartas.contains(pos)) {
            pos = (int) Math.floor(Math.random() * nCartas );
          }
          pCartas.push(pos);
        }
        
        for(int i=0; i < cliente.personajes.size(); i++) {
            Personaje personaje = cliente.personajes.get(i);
            double cantidad = 600*personaje.getPorcentaje();
            for(int j = 0; j < cantidad;j++){
                labels.get(pCartas.get(cont)).setIcon(iconos.get(i));
                labels.get(pCartas.get(cont)).setText("100");
                cliente.personajes.get(i).agregarFichas(labels.get(j));
                cliente.fichas.add(cliente.personajes.get(i).fichas.get(j));
                cont++;
             }
        }
        acomodarLabelsPersonajes();
    }
    
    private void agregarLbl(){
        int y = 0;
        JLabel [][] labelMatrix = new JLabel[20][30];
        System.out.println(labelMatrix.length);
        for(int i = 0; i < labelMatrix.length; i++){
            int x = 0;
            System.out.println(labelMatrix[i].length);
            for(int j = 0; j < labelMatrix[i].length; j++){
                labelMatrix[i][j] = new javax.swing.JLabel();
                labelMatrix[i][j].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                labels.add(labelMatrix[i][j]);
                LbPanelCuadricula.add(labelMatrix[i][j]);
                labelMatrix[i][j].setBounds(x, y, 20, 30);
                x += 26;
            }
            y += 35;
        }
        this.labelMatrix = labelMatrix;
    }
    
    
        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        lblNombreJugador = new javax.swing.JLabel();
        LbPanelCuadricula = new javax.swing.JPanel();
        PanellInfJugadores = new javax.swing.JPanel();
        imagen_lbl1 = new javax.swing.JLabel();
        imagen_lbl4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        imagen_lbl5 = new javax.swing.JLabel();
        imagen_lbl6 = new javax.swing.JLabel();
        imagen_lbl7 = new javax.swing.JLabel();
        PanelInfCasilla = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        PanelComandos = new javax.swing.JPanel();
        EntradaComandos = new javax.swing.JTextField();
        PanelComandos1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaComandos = new javax.swing.JTextArea();
        PanelResultados = new javax.swing.JPanel();
        LbNombre_Bitacora1 = new javax.swing.JLabel();
        Resultados = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        PanelBitacora = new javax.swing.JPanel();
        Bitacora = new javax.swing.JScrollPane();
        TxtBitacora = new javax.swing.JTextArea();
        LbNombre_Bitacora = new javax.swing.JLabel();
        Columnas = new javax.swing.JPanel();
        jLabel602 = new javax.swing.JLabel();
        jLabel603 = new javax.swing.JLabel();
        jLabel604 = new javax.swing.JLabel();
        jLabel605 = new javax.swing.JLabel();
        jLabel606 = new javax.swing.JLabel();
        jLabel607 = new javax.swing.JLabel();
        jLabel608 = new javax.swing.JLabel();
        jLabel609 = new javax.swing.JLabel();
        jLabel610 = new javax.swing.JLabel();
        jLabel611 = new javax.swing.JLabel();
        jLabel612 = new javax.swing.JLabel();
        jLabel613 = new javax.swing.JLabel();
        jLabel614 = new javax.swing.JLabel();
        jLabel615 = new javax.swing.JLabel();
        jLabel616 = new javax.swing.JLabel();
        jLabel617 = new javax.swing.JLabel();
        jLabel618 = new javax.swing.JLabel();
        jLabel619 = new javax.swing.JLabel();
        jLabel620 = new javax.swing.JLabel();
        jLabel621 = new javax.swing.JLabel();
        jLabel622 = new javax.swing.JLabel();
        jLabel623 = new javax.swing.JLabel();
        jLabel624 = new javax.swing.JLabel();
        jLabel625 = new javax.swing.JLabel();
        jLabel626 = new javax.swing.JLabel();
        jLabel627 = new javax.swing.JLabel();
        jLabel628 = new javax.swing.JLabel();
        jLabel629 = new javax.swing.JLabel();
        jLabel630 = new javax.swing.JLabel();
        jLabel631 = new javax.swing.JLabel();
        jLabel632 = new javax.swing.JLabel();
        Filas = new javax.swing.JPanel();
        jLabel633 = new javax.swing.JLabel();
        jLabel634 = new javax.swing.JLabel();
        jLabel635 = new javax.swing.JLabel();
        jLabel636 = new javax.swing.JLabel();
        jLabel637 = new javax.swing.JLabel();
        jLabel638 = new javax.swing.JLabel();
        jLabel639 = new javax.swing.JLabel();
        jLabel641 = new javax.swing.JLabel();
        jLabel642 = new javax.swing.JLabel();
        jLabel643 = new javax.swing.JLabel();
        jLabel644 = new javax.swing.JLabel();
        jLabel645 = new javax.swing.JLabel();
        jLabel646 = new javax.swing.JLabel();
        jLabel647 = new javax.swing.JLabel();
        jLabel648 = new javax.swing.JLabel();
        jLabel649 = new javax.swing.JLabel();
        jLabel650 = new javax.swing.JLabel();
        jLabel651 = new javax.swing.JLabel();
        jLabel652 = new javax.swing.JLabel();
        jLabel653 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1920, 1080));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreJugador.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNombreJugador.setBorder(new javax.swing.border.MatteBorder(null));
        PanelPrincipal.add(lblNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 50));

        LbPanelCuadricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout LbPanelCuadriculaLayout = new javax.swing.GroupLayout(LbPanelCuadricula);
        LbPanelCuadricula.setLayout(LbPanelCuadriculaLayout);
        LbPanelCuadriculaLayout.setHorizontalGroup(
            LbPanelCuadriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        LbPanelCuadriculaLayout.setVerticalGroup(
            LbPanelCuadriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        PanelPrincipal.add(LbPanelCuadricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 790, 700));

        imagen_lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/thulu.png"))); // NOI18N
        imagen_lbl1.setMaximumSize(new java.awt.Dimension(1977, 1483));

        imagen_lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hidra.png"))); // NOI18N
        imagen_lbl4.setMaximumSize(new java.awt.Dimension(1977, 1483));

        imagen_lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/thulu.png"))); // NOI18N
        imagen_lbl5.setMaximumSize(new java.awt.Dimension(1977, 1483));

        imagen_lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aquaman.png"))); // NOI18N
        imagen_lbl6.setMaximumSize(new java.awt.Dimension(1977, 1483));

        imagen_lbl7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hidra.png"))); // NOI18N
        imagen_lbl7.setMaximumSize(new java.awt.Dimension(1977, 1483));

        javax.swing.GroupLayout PanellInfJugadoresLayout = new javax.swing.GroupLayout(PanellInfJugadores);
        PanellInfJugadores.setLayout(PanellInfJugadoresLayout);
        PanellInfJugadoresLayout.setHorizontalGroup(
            PanellInfJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanellInfJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanellInfJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen_lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen_lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen_lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen_lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        PanellInfJugadoresLayout.setVerticalGroup(
            PanellInfJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanellInfJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen_lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagen_lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagen_lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(imagen_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagen_lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanellInfJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 30, 540, 830));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        javax.swing.GroupLayout PanelInfCasillaLayout = new javax.swing.GroupLayout(PanelInfCasilla);
        PanelInfCasilla.setLayout(PanelInfCasillaLayout);
        PanelInfCasillaLayout.setHorizontalGroup(
            PanelInfCasillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        PanelInfCasillaLayout.setVerticalGroup(
            PanelInfCasillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        PanelPrincipal.add(PanelInfCasilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 750, 810, 110));

        EntradaComandos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        EntradaComandos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaComandosActionPerformed(evt);
            }
        });
        EntradaComandos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaComandosKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PanelComandosLayout = new javax.swing.GroupLayout(PanelComandos);
        PanelComandos.setLayout(PanelComandosLayout);
        PanelComandosLayout.setHorizontalGroup(
            PanelComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EntradaComandos, javax.swing.GroupLayout.DEFAULT_SIZE, 1890, Short.MAX_VALUE)
        );
        PanelComandosLayout.setVerticalGroup(
            PanelComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EntradaComandos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        PanelPrincipal.add(PanelComandos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1000, 1890, 70));

        TextAreaComandos.setColumns(20);
        TextAreaComandos.setRows(5);
        jScrollPane1.setViewportView(TextAreaComandos);

        javax.swing.GroupLayout PanelComandos1Layout = new javax.swing.GroupLayout(PanelComandos1);
        PanelComandos1.setLayout(PanelComandos1Layout);
        PanelComandos1Layout.setHorizontalGroup(
            PanelComandos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1890, Short.MAX_VALUE)
        );
        PanelComandos1Layout.setVerticalGroup(
            PanelComandos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        PanelPrincipal.add(PanelComandos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 870, 1890, 120));

        LbNombre_Bitacora1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LbNombre_Bitacora1.setText("Resultado");
        LbNombre_Bitacora1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtResultados.setColumns(20);
        txtResultados.setRows(5);
        Resultados.setViewportView(txtResultados);

        javax.swing.GroupLayout PanelResultadosLayout = new javax.swing.GroupLayout(PanelResultados);
        PanelResultados.setLayout(PanelResultadosLayout);
        PanelResultadosLayout.setHorizontalGroup(
            PanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbNombre_Bitacora1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PanelResultadosLayout.setVerticalGroup(
            PanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadosLayout.createSequentialGroup()
                .addComponent(LbNombre_Bitacora1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resultados, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 520, 470));

        TxtBitacora.setColumns(20);
        TxtBitacora.setRows(5);
        Bitacora.setViewportView(TxtBitacora);

        LbNombre_Bitacora.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LbNombre_Bitacora.setText("  Bitacora");
        LbNombre_Bitacora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PanelBitacoraLayout = new javax.swing.GroupLayout(PanelBitacora);
        PanelBitacora.setLayout(PanelBitacoraLayout);
        PanelBitacoraLayout.setHorizontalGroup(
            PanelBitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bitacora)
            .addGroup(PanelBitacoraLayout.createSequentialGroup()
                .addComponent(LbNombre_Bitacora, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelBitacoraLayout.setVerticalGroup(
            PanelBitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBitacoraLayout.createSequentialGroup()
                .addComponent(LbNombre_Bitacora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bitacora, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelBitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 520, 330));

        Columnas.setLayout(new java.awt.GridLayout(1, 30));

        jLabel602.setText("1");
        Columnas.add(jLabel602);

        jLabel603.setText("2");
        jLabel603.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel603);

        jLabel604.setText("3");
        jLabel604.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel604);

        jLabel605.setText("4");
        jLabel605.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel605);

        jLabel606.setText("5");
        jLabel606.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel606);

        jLabel607.setText("6");
        jLabel607.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel607);

        jLabel608.setText("7");
        jLabel608.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel608);

        jLabel609.setText("8");
        jLabel609.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel609);

        jLabel610.setText("9");
        jLabel610.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel610);

        jLabel611.setText("10");
        jLabel611.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel611);

        jLabel612.setText("11");
        jLabel612.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel612);

        jLabel613.setText("12");
        jLabel613.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel613);

        jLabel614.setText("13");
        jLabel614.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel614);

        jLabel615.setText("14");
        jLabel615.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel615);

        jLabel616.setText("15");
        jLabel616.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel616);

        jLabel617.setText("15");
        jLabel617.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel617);

        jLabel618.setText("16");
        jLabel618.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel618);

        jLabel619.setText("17");
        jLabel619.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel619);

        jLabel620.setText("18");
        jLabel620.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel620);

        jLabel621.setText("19");
        jLabel621.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel621);

        jLabel622.setText("20");
        jLabel622.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel622);

        jLabel623.setText("21");
        jLabel623.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel623);

        jLabel624.setText("22");
        jLabel624.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel624);

        jLabel625.setText("23");
        jLabel625.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel625);

        jLabel626.setText("24");
        jLabel626.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel626);

        jLabel627.setText("25");
        jLabel627.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel627);

        jLabel628.setText("26");
        jLabel628.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel628);

        jLabel629.setText("27");
        jLabel629.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel629);

        jLabel630.setText("28");
        jLabel630.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel630);

        jLabel631.setText("29");
        jLabel631.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel631);

        jLabel632.setText("30");
        jLabel632.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Columnas.add(jLabel632);

        PanelPrincipal.add(Columnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 790, 20));

        Filas.setLayout(new java.awt.GridLayout(20, 0));

        jLabel633.setText("  1");
        Filas.add(jLabel633);

        jLabel634.setText("  2");
        Filas.add(jLabel634);

        jLabel635.setText("  3");
        Filas.add(jLabel635);

        jLabel636.setText("  4");
        Filas.add(jLabel636);

        jLabel637.setText("  5");
        Filas.add(jLabel637);

        jLabel638.setText("  6");
        Filas.add(jLabel638);

        jLabel639.setText("  7");
        Filas.add(jLabel639);

        jLabel641.setText("  8");
        Filas.add(jLabel641);

        jLabel642.setText("  9");
        Filas.add(jLabel642);

        jLabel643.setText(" 10");
        Filas.add(jLabel643);

        jLabel644.setText(" 11");
        Filas.add(jLabel644);

        jLabel645.setText(" 12");
        Filas.add(jLabel645);

        jLabel646.setText(" 13");
        Filas.add(jLabel646);

        jLabel647.setText(" 14");
        Filas.add(jLabel647);

        jLabel648.setText(" 15");
        Filas.add(jLabel648);

        jLabel649.setText(" 16");
        Filas.add(jLabel649);

        jLabel650.setText(" 17");
        Filas.add(jLabel650);

        jLabel651.setText(" 18");
        Filas.add(jLabel651);

        jLabel652.setText(" 19");
        Filas.add(jLabel652);

        jLabel653.setText(" 20");
        Filas.add(jLabel653);

        PanelPrincipal.add(Filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 20, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        PanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaComandosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaComandosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaComandosActionPerformed

    private void EntradaComandosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaComandosKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.vivo = verificarVivo();
       
            String command = EntradaComandos.getText();
            String[] separado = command.split("-");
        
            if(null == separado[0]){
                addMensaje("Error, el comando ingresado es inexistente");
            }
            else switch (separado[0]) {
                case "CNSE":
                    if(separado.length == 2){
                    
                        String nombre = separado[1];
                        this.newPlayer(nombre);
                        lblNombreJugador.setText(nombre);
                        
                    }
                    else{
                        addMensaje("El comando no esta ingresado correctamente.");
         
                    }break; 
                case "CRPE":
                    addMensaje(cliente.crearPersonajes(separado));
                    break;

        }
            EntradaComandos.setText(""); 
       }
    

    }//GEN-LAST:event_EntradaComandosKeyPressed
    
        
    
    
    
    /*
    private Casilla buscarCasilla()
    {
        
    }
    
    private void actualizarCelda()
    {
        actualizarObjeto();
        pintarCelda();
    }
    
    
    
    private Color elegirColor()
    {
        return Color.red;
    }
    
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BoardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoardCliente().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Bitacora;
    private javax.swing.JPanel Columnas;
    private javax.swing.JTextField EntradaComandos;
    private javax.swing.JPanel Filas;
    private javax.swing.JLabel LbNombre_Bitacora;
    private javax.swing.JLabel LbNombre_Bitacora1;
    private javax.swing.JPanel LbPanelCuadricula;
    private javax.swing.JPanel PanelBitacora;
    private javax.swing.JPanel PanelComandos;
    private javax.swing.JPanel PanelComandos1;
    private javax.swing.JPanel PanelInfCasilla;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelResultados;
    private javax.swing.JPanel PanellInfJugadores;
    private javax.swing.JScrollPane Resultados;
    private javax.swing.JTextArea TextAreaComandos;
    private javax.swing.JTextArea TxtBitacora;
    private javax.swing.JLabel imagen_lbl1;
    private javax.swing.JLabel imagen_lbl4;
    private javax.swing.JLabel imagen_lbl5;
    private javax.swing.JLabel imagen_lbl6;
    private javax.swing.JLabel imagen_lbl7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel602;
    private javax.swing.JLabel jLabel603;
    private javax.swing.JLabel jLabel604;
    private javax.swing.JLabel jLabel605;
    private javax.swing.JLabel jLabel606;
    private javax.swing.JLabel jLabel607;
    private javax.swing.JLabel jLabel608;
    private javax.swing.JLabel jLabel609;
    private javax.swing.JLabel jLabel610;
    private javax.swing.JLabel jLabel611;
    private javax.swing.JLabel jLabel612;
    private javax.swing.JLabel jLabel613;
    private javax.swing.JLabel jLabel614;
    private javax.swing.JLabel jLabel615;
    private javax.swing.JLabel jLabel616;
    private javax.swing.JLabel jLabel617;
    private javax.swing.JLabel jLabel618;
    private javax.swing.JLabel jLabel619;
    private javax.swing.JLabel jLabel620;
    private javax.swing.JLabel jLabel621;
    private javax.swing.JLabel jLabel622;
    private javax.swing.JLabel jLabel623;
    private javax.swing.JLabel jLabel624;
    private javax.swing.JLabel jLabel625;
    private javax.swing.JLabel jLabel626;
    private javax.swing.JLabel jLabel627;
    private javax.swing.JLabel jLabel628;
    private javax.swing.JLabel jLabel629;
    private javax.swing.JLabel jLabel630;
    private javax.swing.JLabel jLabel631;
    private javax.swing.JLabel jLabel632;
    private javax.swing.JLabel jLabel633;
    private javax.swing.JLabel jLabel634;
    private javax.swing.JLabel jLabel635;
    private javax.swing.JLabel jLabel636;
    private javax.swing.JLabel jLabel637;
    private javax.swing.JLabel jLabel638;
    private javax.swing.JLabel jLabel639;
    private javax.swing.JLabel jLabel641;
    private javax.swing.JLabel jLabel642;
    private javax.swing.JLabel jLabel643;
    private javax.swing.JLabel jLabel644;
    private javax.swing.JLabel jLabel645;
    private javax.swing.JLabel jLabel646;
    private javax.swing.JLabel jLabel647;
    private javax.swing.JLabel jLabel648;
    private javax.swing.JLabel jLabel649;
    private javax.swing.JLabel jLabel650;
    private javax.swing.JLabel jLabel651;
    private javax.swing.JLabel jLabel652;
    private javax.swing.JLabel jLabel653;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel lblNombreJugador;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables
}
