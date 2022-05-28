/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SeaWarCliente.gui;

import Comandos.BaseComandos;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JLabel;

/**
 *
 * @author ANTONY
 */
public class BoardCliente extends javax.swing.JFrame {
    private Cliente cliente;
    
    private Rey miPersonaje;
    /**
     * Creates new form BoardCliente
     */
    public BoardCliente() {
        
        initComponents();
        cliente = new Cliente(this);
        Dimension dim = this.getToolkit().getScreenSize();
        dim.setSize(dim.width, dim.height + 40);
        this.setSize(dim);
    }

    public void showClientMessage(String msg){
        this.TxtBitacora.append(msg + "\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        LbNombre_Bitacora = new javax.swing.JLabel();
        Conectar_borr = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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
        Resultados = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        Bitacora = new javax.swing.JScrollPane();
        TxtBitacora = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txComandos = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        CuadriculaDeJuego = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jLabel303 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        jLabel337 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        jLabel311 = new javax.swing.JLabel();
        jLabel312 = new javax.swing.JLabel();
        jLabel313 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        jLabel315 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jLabel316 = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        jLabel325 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        jLabel327 = new javax.swing.JLabel();
        jLabel328 = new javax.swing.JLabel();
        jLabel329 = new javax.swing.JLabel();
        jLabel330 = new javax.swing.JLabel();
        jLabel331 = new javax.swing.JLabel();
        jLabel332 = new javax.swing.JLabel();
        jLabel333 = new javax.swing.JLabel();
        jLabel334 = new javax.swing.JLabel();
        jLabel335 = new javax.swing.JLabel();
        jLabel336 = new javax.swing.JLabel();
        jLabel338 = new javax.swing.JLabel();
        jLabel339 = new javax.swing.JLabel();
        jLabel340 = new javax.swing.JLabel();
        jLabel341 = new javax.swing.JLabel();
        jLabel342 = new javax.swing.JLabel();
        jLabel343 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        jLabel345 = new javax.swing.JLabel();
        jLabel346 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        jLabel348 = new javax.swing.JLabel();
        jLabel349 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        jLabel351 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        jLabel353 = new javax.swing.JLabel();
        jLabel354 = new javax.swing.JLabel();
        jLabel355 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();
        jLabel357 = new javax.swing.JLabel();
        jLabel358 = new javax.swing.JLabel();
        jLabel359 = new javax.swing.JLabel();
        jLabel360 = new javax.swing.JLabel();
        jLabel361 = new javax.swing.JLabel();
        jLabel362 = new javax.swing.JLabel();
        jLabel363 = new javax.swing.JLabel();
        jLabel364 = new javax.swing.JLabel();
        jLabel365 = new javax.swing.JLabel();
        jLabel366 = new javax.swing.JLabel();
        jLabel367 = new javax.swing.JLabel();
        jLabel368 = new javax.swing.JLabel();
        jLabel369 = new javax.swing.JLabel();
        jLabel370 = new javax.swing.JLabel();
        jLabel371 = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        jLabel373 = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jLabel375 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jLabel377 = new javax.swing.JLabel();
        jLabel378 = new javax.swing.JLabel();
        jLabel379 = new javax.swing.JLabel();
        jLabel380 = new javax.swing.JLabel();
        jLabel381 = new javax.swing.JLabel();
        jLabel382 = new javax.swing.JLabel();
        jLabel383 = new javax.swing.JLabel();
        jLabel384 = new javax.swing.JLabel();
        jLabel385 = new javax.swing.JLabel();
        jLabel386 = new javax.swing.JLabel();
        jLabel387 = new javax.swing.JLabel();
        jLabel388 = new javax.swing.JLabel();
        jLabel389 = new javax.swing.JLabel();
        jLabel390 = new javax.swing.JLabel();
        jLabel391 = new javax.swing.JLabel();
        jLabel392 = new javax.swing.JLabel();
        jLabel393 = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        jLabel395 = new javax.swing.JLabel();
        jLabel396 = new javax.swing.JLabel();
        jLabel397 = new javax.swing.JLabel();
        jLabel398 = new javax.swing.JLabel();
        jLabel399 = new javax.swing.JLabel();
        jLabel400 = new javax.swing.JLabel();
        jLabel401 = new javax.swing.JLabel();
        jLabel402 = new javax.swing.JLabel();
        jLabel403 = new javax.swing.JLabel();
        jLabel404 = new javax.swing.JLabel();
        jLabel405 = new javax.swing.JLabel();
        jLabel406 = new javax.swing.JLabel();
        jLabel407 = new javax.swing.JLabel();
        jLabel408 = new javax.swing.JLabel();
        jLabel409 = new javax.swing.JLabel();
        jLabel410 = new javax.swing.JLabel();
        jLabel411 = new javax.swing.JLabel();
        jLabel412 = new javax.swing.JLabel();
        jLabel413 = new javax.swing.JLabel();
        jLabel414 = new javax.swing.JLabel();
        jLabel415 = new javax.swing.JLabel();
        jLabel416 = new javax.swing.JLabel();
        jLabel417 = new javax.swing.JLabel();
        jLabel418 = new javax.swing.JLabel();
        jLabel419 = new javax.swing.JLabel();
        jLabel420 = new javax.swing.JLabel();
        jLabel421 = new javax.swing.JLabel();
        jLabel422 = new javax.swing.JLabel();
        jLabel423 = new javax.swing.JLabel();
        jLabel424 = new javax.swing.JLabel();
        jLabel425 = new javax.swing.JLabel();
        jLabel426 = new javax.swing.JLabel();
        jLabel427 = new javax.swing.JLabel();
        jLabel428 = new javax.swing.JLabel();
        jLabel429 = new javax.swing.JLabel();
        jLabel430 = new javax.swing.JLabel();
        jLabel431 = new javax.swing.JLabel();
        jLabel432 = new javax.swing.JLabel();
        jLabel433 = new javax.swing.JLabel();
        jLabel434 = new javax.swing.JLabel();
        jLabel435 = new javax.swing.JLabel();
        jLabel436 = new javax.swing.JLabel();
        jLabel437 = new javax.swing.JLabel();
        jLabel438 = new javax.swing.JLabel();
        jLabel439 = new javax.swing.JLabel();
        jLabel440 = new javax.swing.JLabel();
        jLabel441 = new javax.swing.JLabel();
        jLabel442 = new javax.swing.JLabel();
        jLabel443 = new javax.swing.JLabel();
        jLabel444 = new javax.swing.JLabel();
        jLabel445 = new javax.swing.JLabel();
        jLabel446 = new javax.swing.JLabel();
        jLabel447 = new javax.swing.JLabel();
        jLabel448 = new javax.swing.JLabel();
        jLabel449 = new javax.swing.JLabel();
        jLabel450 = new javax.swing.JLabel();
        jLabel451 = new javax.swing.JLabel();
        jLabel452 = new javax.swing.JLabel();
        jLabel453 = new javax.swing.JLabel();
        jLabel454 = new javax.swing.JLabel();
        jLabel455 = new javax.swing.JLabel();
        jLabel456 = new javax.swing.JLabel();
        jLabel457 = new javax.swing.JLabel();
        jLabel458 = new javax.swing.JLabel();
        jLabel459 = new javax.swing.JLabel();
        jLabel460 = new javax.swing.JLabel();
        jLabel461 = new javax.swing.JLabel();
        jLabel462 = new javax.swing.JLabel();
        jLabel463 = new javax.swing.JLabel();
        jLabel464 = new javax.swing.JLabel();
        jLabel465 = new javax.swing.JLabel();
        jLabel466 = new javax.swing.JLabel();
        jLabel467 = new javax.swing.JLabel();
        jLabel468 = new javax.swing.JLabel();
        jLabel469 = new javax.swing.JLabel();
        jLabel470 = new javax.swing.JLabel();
        jLabel471 = new javax.swing.JLabel();
        jLabel472 = new javax.swing.JLabel();
        jLabel473 = new javax.swing.JLabel();
        jLabel474 = new javax.swing.JLabel();
        jLabel475 = new javax.swing.JLabel();
        jLabel476 = new javax.swing.JLabel();
        jLabel477 = new javax.swing.JLabel();
        jLabel478 = new javax.swing.JLabel();
        jLabel479 = new javax.swing.JLabel();
        jLabel480 = new javax.swing.JLabel();
        jLabel481 = new javax.swing.JLabel();
        jLabel482 = new javax.swing.JLabel();
        jLabel483 = new javax.swing.JLabel();
        jLabel484 = new javax.swing.JLabel();
        jLabel485 = new javax.swing.JLabel();
        jLabel486 = new javax.swing.JLabel();
        jLabel487 = new javax.swing.JLabel();
        jLabel488 = new javax.swing.JLabel();
        jLabel489 = new javax.swing.JLabel();
        jLabel490 = new javax.swing.JLabel();
        jLabel491 = new javax.swing.JLabel();
        jLabel492 = new javax.swing.JLabel();
        jLabel493 = new javax.swing.JLabel();
        jLabel494 = new javax.swing.JLabel();
        jLabel495 = new javax.swing.JLabel();
        jLabel496 = new javax.swing.JLabel();
        jLabel497 = new javax.swing.JLabel();
        jLabel498 = new javax.swing.JLabel();
        jLabel499 = new javax.swing.JLabel();
        jLabel500 = new javax.swing.JLabel();
        jLabel501 = new javax.swing.JLabel();
        jLabel502 = new javax.swing.JLabel();
        jLabel503 = new javax.swing.JLabel();
        jLabel504 = new javax.swing.JLabel();
        jLabel505 = new javax.swing.JLabel();
        jLabel506 = new javax.swing.JLabel();
        jLabel507 = new javax.swing.JLabel();
        jLabel508 = new javax.swing.JLabel();
        jLabel509 = new javax.swing.JLabel();
        jLabel510 = new javax.swing.JLabel();
        jLabel511 = new javax.swing.JLabel();
        jLabel512 = new javax.swing.JLabel();
        jLabel513 = new javax.swing.JLabel();
        jLabel514 = new javax.swing.JLabel();
        jLabel515 = new javax.swing.JLabel();
        jLabel516 = new javax.swing.JLabel();
        jLabel517 = new javax.swing.JLabel();
        jLabel546 = new javax.swing.JLabel();
        jLabel518 = new javax.swing.JLabel();
        jLabel519 = new javax.swing.JLabel();
        jLabel520 = new javax.swing.JLabel();
        jLabel521 = new javax.swing.JLabel();
        jLabel522 = new javax.swing.JLabel();
        jLabel523 = new javax.swing.JLabel();
        jLabel524 = new javax.swing.JLabel();
        jLabel525 = new javax.swing.JLabel();
        jLabel526 = new javax.swing.JLabel();
        jLabel527 = new javax.swing.JLabel();
        jLabel528 = new javax.swing.JLabel();
        jLabel529 = new javax.swing.JLabel();
        jLabel530 = new javax.swing.JLabel();
        jLabel531 = new javax.swing.JLabel();
        jLabel532 = new javax.swing.JLabel();
        jLabel533 = new javax.swing.JLabel();
        jLabel534 = new javax.swing.JLabel();
        jLabel535 = new javax.swing.JLabel();
        jLabel536 = new javax.swing.JLabel();
        jLabel537 = new javax.swing.JLabel();
        jLabel538 = new javax.swing.JLabel();
        jLabel539 = new javax.swing.JLabel();
        jLabel540 = new javax.swing.JLabel();
        jLabel541 = new javax.swing.JLabel();
        jLabel542 = new javax.swing.JLabel();
        jLabel543 = new javax.swing.JLabel();
        jLabel544 = new javax.swing.JLabel();
        jLabel545 = new javax.swing.JLabel();
        jLabel547 = new javax.swing.JLabel();
        jLabel548 = new javax.swing.JLabel();
        jLabel549 = new javax.swing.JLabel();
        jLabel550 = new javax.swing.JLabel();
        jLabel551 = new javax.swing.JLabel();
        jLabel552 = new javax.swing.JLabel();
        jLabel553 = new javax.swing.JLabel();
        jLabel554 = new javax.swing.JLabel();
        jLabel555 = new javax.swing.JLabel();
        jLabel556 = new javax.swing.JLabel();
        jLabel557 = new javax.swing.JLabel();
        jLabel558 = new javax.swing.JLabel();
        jLabel559 = new javax.swing.JLabel();
        jLabel560 = new javax.swing.JLabel();
        jLabel561 = new javax.swing.JLabel();
        jLabel562 = new javax.swing.JLabel();
        jLabel563 = new javax.swing.JLabel();
        jLabel564 = new javax.swing.JLabel();
        jLabel565 = new javax.swing.JLabel();
        jLabel566 = new javax.swing.JLabel();
        jLabel567 = new javax.swing.JLabel();
        jLabel568 = new javax.swing.JLabel();
        jLabel569 = new javax.swing.JLabel();
        jLabel570 = new javax.swing.JLabel();
        jLabel571 = new javax.swing.JLabel();
        jLabel572 = new javax.swing.JLabel();
        jLabel573 = new javax.swing.JLabel();
        jLabel574 = new javax.swing.JLabel();
        jLabel575 = new javax.swing.JLabel();
        jLabel576 = new javax.swing.JLabel();
        jLabel577 = new javax.swing.JLabel();
        jLabel578 = new javax.swing.JLabel();
        jLabel579 = new javax.swing.JLabel();
        jLabel580 = new javax.swing.JLabel();
        jLabel581 = new javax.swing.JLabel();
        jLabel582 = new javax.swing.JLabel();
        jLabel583 = new javax.swing.JLabel();
        jLabel584 = new javax.swing.JLabel();
        jLabel585 = new javax.swing.JLabel();
        jLabel586 = new javax.swing.JLabel();
        jLabel587 = new javax.swing.JLabel();
        jLabel588 = new javax.swing.JLabel();
        jLabel589 = new javax.swing.JLabel();
        jLabel590 = new javax.swing.JLabel();
        jLabel591 = new javax.swing.JLabel();
        jLabel592 = new javax.swing.JLabel();
        jLabel593 = new javax.swing.JLabel();
        jLabel594 = new javax.swing.JLabel();
        jLabel595 = new javax.swing.JLabel();
        jLabel596 = new javax.swing.JLabel();
        jLabel597 = new javax.swing.JLabel();
        jLabel598 = new javax.swing.JLabel();
        jLabel599 = new javax.swing.JLabel();
        jLabel600 = new javax.swing.JLabel();
        jLabel640 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(Columnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 790, 20));

        LbNombre_Bitacora.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LbNombre_Bitacora.setText("  Bitacora");
        LbNombre_Bitacora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(LbNombre_Bitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 520, 30));

        Conectar_borr.setText("Conectar al servidor");
        Conectar_borr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Conectar_borrActionPerformed(evt);
            }
        });
        jPanel1.add(Conectar_borr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 40));

        jButton1.setText("ENVIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 1010, 200, 60));

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

        jPanel1.add(Filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 20, 700));

        txtResultados.setColumns(20);
        txtResultados.setRows(5);
        Resultados.setViewportView(txtResultados);

        jPanel1.add(Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 520, 470));

        TxtBitacora.setColumns(20);
        TxtBitacora.setRows(5);
        Bitacora.setViewportView(TxtBitacora);

        jPanel1.add(Bitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 520, 280));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 870, 1900, 130));

        txComandos.setColumns(20);
        txComandos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txComandos.setRows(5);
        jScrollPane3.setViewportView(txComandos);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1010, 1700, 60));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 50, 530, 810));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 750, 810, 110));

        CuadriculaDeJuego.setLayout(new java.awt.GridLayout(20, 30));

        jLabel1.setText("x");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel1);

        jLabel3.setText("x");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel3);

        jLabel4.setText("x");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel4);

        jLabel5.setText("x");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel5);

        jLabel6.setText("x");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel6);

        jLabel7.setText("x");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel7);

        jLabel8.setText("x");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel8);

        jLabel9.setText("x");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel9);

        jLabel10.setText("x");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel10);

        jLabel11.setText("x");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel11);

        jLabel12.setText("x");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel12);

        jLabel13.setText("x");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel13);

        jLabel14.setText("x");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel14);

        jLabel15.setText("x");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel15);

        jLabel16.setText("x");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel16);

        jLabel17.setText("x");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel17);

        jLabel18.setText("x");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel18);

        jLabel19.setText("x");
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel19);

        jLabel20.setText("x");
        jLabel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel20);

        jLabel21.setText("x");
        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel21);

        jLabel22.setText("x");
        jLabel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel22);

        jLabel23.setText("x");
        jLabel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel23);

        jLabel24.setText("x");
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel24);

        jLabel25.setText("x");
        jLabel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel25);

        jLabel26.setText("x");
        jLabel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel26);

        jLabel27.setText("x");
        jLabel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel27);

        jLabel28.setText("x");
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel28);

        jLabel29.setText("x");
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel29);

        jLabel30.setText("x");
        jLabel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel30);

        jLabel31.setText("x");
        jLabel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel31);

        jLabel32.setText("x");
        jLabel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel32);

        jLabel33.setText("x");
        jLabel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel33);

        jLabel34.setText("x");
        jLabel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel34);

        jLabel35.setText("x");
        jLabel35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel35);

        jLabel36.setText("x");
        jLabel36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel36);

        jLabel37.setText("x");
        jLabel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel37);

        jLabel38.setText("x");
        jLabel38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel38);

        jLabel39.setText("x");
        jLabel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel39);

        jLabel40.setText("x");
        jLabel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel40);

        jLabel41.setText("x");
        jLabel41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel41);

        jLabel42.setText("x");
        jLabel42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel42);

        jLabel43.setText("x");
        jLabel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel43);

        jLabel44.setText("x");
        jLabel44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel44);

        jLabel45.setText("x");
        jLabel45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel45);

        jLabel46.setText("x");
        jLabel46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel46);

        jLabel47.setText("x");
        jLabel47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel47);

        jLabel48.setText("x");
        jLabel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel48);

        jLabel49.setText("x");
        jLabel49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel49);

        jLabel50.setText("x");
        jLabel50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel50);

        jLabel51.setText("x");
        jLabel51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel51);

        jLabel52.setText("x");
        jLabel52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel52);

        jLabel53.setText("x");
        jLabel53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel53);

        jLabel54.setText("x");
        jLabel54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel54);

        jLabel55.setText("x");
        jLabel55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel55);

        jLabel56.setText("x");
        jLabel56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel56);

        jLabel57.setText("x");
        jLabel57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel57);

        jLabel58.setText("x");
        jLabel58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel58);

        jLabel59.setText("x");
        jLabel59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel59);

        jLabel60.setText("x");
        jLabel60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel60);

        jLabel61.setText("x");
        jLabel61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel61);

        jLabel62.setText("x");
        jLabel62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel62);

        jLabel63.setText("x");
        jLabel63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel63);

        jLabel64.setText("x");
        jLabel64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel64);

        jLabel65.setText("x");
        jLabel65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel65);

        jLabel66.setText("x");
        jLabel66.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel66);

        jLabel67.setText("x");
        jLabel67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel67);

        jLabel68.setText("x");
        jLabel68.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel68);

        jLabel69.setText("x");
        jLabel69.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel69);

        jLabel70.setText("x");
        jLabel70.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel70);

        jLabel71.setText("x");
        jLabel71.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel71);

        jLabel72.setText("x");
        jLabel72.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel72);

        jLabel73.setText("x");
        jLabel73.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel73);

        jLabel74.setText("x");
        jLabel74.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel74);

        jLabel75.setText("x");
        jLabel75.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel75);

        jLabel76.setText("x");
        jLabel76.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel76);

        jLabel77.setText("x");
        jLabel77.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel77);

        jLabel78.setText("x");
        jLabel78.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel78);

        jLabel79.setText("x");
        jLabel79.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel79);

        jLabel80.setText("x");
        jLabel80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel80);

        jLabel81.setText("x");
        jLabel81.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel81);

        jLabel82.setText("x");
        jLabel82.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel82);

        jLabel83.setText("x");
        jLabel83.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel83);

        jLabel84.setText("x");
        jLabel84.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel84);

        jLabel85.setText("x");
        jLabel85.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel85);

        jLabel86.setText("x");
        jLabel86.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel86);

        jLabel87.setText("x");
        jLabel87.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel87);

        jLabel88.setText("x");
        jLabel88.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel88);

        jLabel89.setText("x");
        jLabel89.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel89);

        jLabel90.setText("x");
        jLabel90.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel90);

        jLabel91.setText("x");
        jLabel91.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel91);

        jLabel92.setText("x");
        jLabel92.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel92);

        jLabel93.setText("x");
        jLabel93.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel93);

        jLabel94.setText("x");
        jLabel94.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel94);

        jLabel95.setText("x");
        jLabel95.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel95);

        jLabel96.setText("x");
        jLabel96.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel96);

        jLabel97.setText("x");
        jLabel97.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel97);

        jLabel98.setText("x");
        jLabel98.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel98);

        jLabel99.setText("x");
        jLabel99.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel99);

        jLabel100.setText("x");
        jLabel100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel100);

        jLabel101.setText("x");
        jLabel101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel101);

        jLabel102.setText("x");
        jLabel102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel102);

        jLabel103.setText("x");
        jLabel103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel103);

        jLabel104.setText("x");
        jLabel104.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel104);

        jLabel105.setText("x");
        jLabel105.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel105);

        jLabel106.setText("x");
        jLabel106.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel106);

        jLabel107.setText("x");
        jLabel107.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel107);

        jLabel108.setText("x");
        jLabel108.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel108);

        jLabel109.setText("x");
        jLabel109.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel109);

        jLabel110.setText("x");
        jLabel110.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel110);

        jLabel111.setText("x");
        jLabel111.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel111);

        jLabel112.setText("x");
        jLabel112.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel112);

        jLabel113.setText("x");
        jLabel113.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel113);

        jLabel114.setText("x");
        jLabel114.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel114);

        jLabel115.setText("x");
        jLabel115.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel115);

        jLabel116.setText("x");
        jLabel116.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel116);

        jLabel117.setText("x");
        jLabel117.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel117);

        jLabel118.setText("x");
        jLabel118.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel118);

        jLabel119.setText("x");
        jLabel119.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel119);

        jLabel120.setText("x");
        jLabel120.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel120);

        jLabel121.setText("x");
        jLabel121.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel121);

        jLabel122.setText("x");
        jLabel122.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel122);

        jLabel123.setText("x");
        jLabel123.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel123);

        jLabel124.setText("x");
        jLabel124.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel124);

        jLabel125.setText("x");
        jLabel125.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel125);

        jLabel126.setText("x");
        jLabel126.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel126);

        jLabel127.setText("x");
        jLabel127.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel127);

        jLabel128.setText("x");
        jLabel128.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel128);

        jLabel129.setText("x");
        jLabel129.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel129);

        jLabel130.setText("x");
        jLabel130.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel130);

        jLabel131.setText("x");
        jLabel131.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel131);

        jLabel132.setText("x");
        jLabel132.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel132);

        jLabel133.setText("x");
        jLabel133.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel133);

        jLabel134.setText("x");
        jLabel134.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel134);

        jLabel135.setText("x");
        jLabel135.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel135);

        jLabel136.setText("x");
        jLabel136.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel136);

        jLabel137.setText("x");
        jLabel137.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel137);

        jLabel138.setText("x");
        jLabel138.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel138);

        jLabel139.setText("x");
        jLabel139.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel139);

        jLabel140.setText("x");
        jLabel140.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel140);

        jLabel141.setText("x");
        jLabel141.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel141);

        jLabel142.setText("x");
        jLabel142.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel142);

        jLabel143.setText("x");
        jLabel143.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel143);

        jLabel144.setText("x");
        jLabel144.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel144);

        jLabel145.setText("x");
        jLabel145.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel145);

        jLabel146.setText("x");
        jLabel146.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel146);

        jLabel147.setText("x");
        jLabel147.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel147);

        jLabel148.setText("x");
        jLabel148.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel148);

        jLabel149.setText("x");
        jLabel149.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel149);

        jLabel150.setText("x");
        jLabel150.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel150);

        jLabel151.setText("x");
        jLabel151.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel151);

        jLabel152.setText("x");
        jLabel152.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel152);

        jLabel153.setText("x");
        jLabel153.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel153);

        jLabel154.setText("x");
        jLabel154.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel154);

        jLabel155.setText("x");
        jLabel155.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel155);

        jLabel156.setText("x");
        jLabel156.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel156);

        jLabel157.setText("x");
        jLabel157.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel157);

        jLabel158.setText("x");
        jLabel158.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel158);

        jLabel159.setText("x");
        jLabel159.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel159);

        jLabel160.setText("x");
        jLabel160.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel160);

        jLabel161.setText("x");
        jLabel161.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel161);

        jLabel162.setText("x");
        jLabel162.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel162);

        jLabel163.setText("x");
        jLabel163.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel163);

        jLabel164.setText("x");
        jLabel164.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel164);

        jLabel165.setText("x");
        jLabel165.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel165);

        jLabel166.setText("x");
        jLabel166.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel166);

        jLabel167.setText("x");
        jLabel167.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel167);

        jLabel168.setText("x");
        jLabel168.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel168);

        jLabel169.setText("x");
        jLabel169.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel169);

        jLabel170.setText("x");
        jLabel170.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel170);

        jLabel171.setText("x");
        jLabel171.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel171);

        jLabel172.setText("x");
        jLabel172.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel172);

        jLabel173.setText("x");
        jLabel173.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel173);

        jLabel174.setText("x");
        jLabel174.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel174);

        jLabel175.setText("x");
        jLabel175.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel175);

        jLabel176.setText("x");
        jLabel176.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel176);

        jLabel177.setText("x");
        jLabel177.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel177);

        jLabel178.setText("x");
        jLabel178.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel178);

        jLabel179.setText("x");
        jLabel179.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel179);

        jLabel180.setText("x");
        jLabel180.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel180);

        jLabel181.setText("x");
        jLabel181.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel181);

        jLabel182.setText("x");
        jLabel182.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel182);

        jLabel183.setText("x");
        jLabel183.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel183);

        jLabel184.setText("x");
        jLabel184.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel184);

        jLabel185.setText("x");
        jLabel185.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel185);

        jLabel186.setText("x");
        jLabel186.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel186);

        jLabel187.setText("x");
        jLabel187.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel187);

        jLabel188.setText("x");
        jLabel188.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel188);

        jLabel189.setText("x");
        jLabel189.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel189);

        jLabel190.setText("x");
        jLabel190.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel190);

        jLabel191.setText("x");
        jLabel191.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel191);

        jLabel193.setText("x");
        jLabel193.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel193);

        jLabel194.setText("x");
        jLabel194.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel194);

        jLabel195.setText("x");
        jLabel195.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel195);

        jLabel196.setText("x");
        jLabel196.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel196);

        jLabel197.setText("x");
        jLabel197.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel197);

        jLabel198.setText("x");
        jLabel198.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel198);

        jLabel199.setText("x");
        jLabel199.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel199);

        jLabel200.setText("x");
        jLabel200.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel200);

        jLabel201.setText("x");
        jLabel201.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel201);

        jLabel202.setText("x");
        jLabel202.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel202);

        jLabel203.setText("x");
        jLabel203.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel203);

        jLabel204.setText("x");
        jLabel204.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel204);

        jLabel205.setText("x");
        jLabel205.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel205);

        jLabel206.setText("x");
        jLabel206.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel206);

        jLabel207.setText("x");
        jLabel207.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel207);

        jLabel208.setText("x");
        jLabel208.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel208);

        jLabel209.setText("x");
        jLabel209.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel209);

        jLabel210.setText("x");
        jLabel210.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel210);

        jLabel211.setText("x");
        jLabel211.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel211);

        jLabel212.setText("x");
        jLabel212.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel212);

        jLabel213.setText("x");
        jLabel213.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel213);

        jLabel214.setText("x");
        jLabel214.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel214);

        jLabel215.setText("x");
        jLabel215.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel215);

        jLabel216.setText("x");
        jLabel216.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel216);

        jLabel217.setText("x");
        jLabel217.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel217);

        jLabel218.setText("x");
        jLabel218.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel218);

        jLabel219.setText("x");
        jLabel219.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel219);

        jLabel220.setText("x");
        jLabel220.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel220);

        jLabel221.setText("x");
        jLabel221.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel221);

        jLabel222.setText("x");
        jLabel222.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel222);

        jLabel192.setText("x");
        jLabel192.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel192);

        jLabel223.setText("x");
        jLabel223.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel223);

        jLabel224.setText("x");
        jLabel224.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel224);

        jLabel225.setText("x");
        jLabel225.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel225);

        jLabel226.setText("x");
        jLabel226.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel226);

        jLabel227.setText("x");
        jLabel227.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel227);

        jLabel228.setText("x");
        jLabel228.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel228);

        jLabel229.setText("x");
        jLabel229.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel229);

        jLabel230.setText("x");
        jLabel230.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel230);

        jLabel231.setText("x");
        jLabel231.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel231);

        jLabel232.setText("x");
        jLabel232.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel232);

        jLabel233.setText("x");
        jLabel233.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel233);

        jLabel234.setText("x");
        jLabel234.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel234);

        jLabel235.setText("x");
        jLabel235.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel235);

        jLabel236.setText("x");
        jLabel236.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel236);

        jLabel237.setText("x");
        jLabel237.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel237);

        jLabel238.setText("x");
        jLabel238.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel238);

        jLabel239.setText("x");
        jLabel239.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel239);

        jLabel240.setText("x");
        jLabel240.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel240);

        jLabel241.setText("x");
        jLabel241.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel241);

        jLabel242.setText("x");
        jLabel242.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel242);

        jLabel243.setText("x");
        jLabel243.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel243);

        jLabel244.setText("x");
        jLabel244.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel244);

        jLabel245.setText("x");
        jLabel245.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel245);

        jLabel246.setText("x");
        jLabel246.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel246);

        jLabel247.setText("x");
        jLabel247.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel247);

        jLabel248.setText("x");
        jLabel248.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel248);

        jLabel249.setText("x");
        jLabel249.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel249);

        jLabel250.setText("x");
        jLabel250.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel250);

        jLabel251.setText("x");
        jLabel251.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel251);

        jLabel252.setText("x");
        jLabel252.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel252);

        jLabel253.setText("x");
        jLabel253.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel253);

        jLabel254.setText("x");
        jLabel254.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel254);

        jLabel255.setText("x");
        jLabel255.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel255);

        jLabel256.setText("x");
        jLabel256.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel256);

        jLabel257.setText("x");
        jLabel257.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel257);

        jLabel258.setText("x");
        jLabel258.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel258);

        jLabel259.setText("x");
        jLabel259.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel259);

        jLabel260.setText("x");
        jLabel260.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel260);

        jLabel261.setText("x");
        jLabel261.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel261);

        jLabel262.setText("x");
        jLabel262.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel262);

        jLabel263.setText("x");
        jLabel263.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel263);

        jLabel264.setText("x");
        jLabel264.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel264);

        jLabel265.setText("x");
        jLabel265.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel265);

        jLabel266.setText("x");
        jLabel266.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel266);

        jLabel267.setText("x");
        jLabel267.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel267);

        jLabel268.setText("x");
        jLabel268.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel268);

        jLabel269.setText("x");
        jLabel269.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel269);

        jLabel270.setText("x");
        jLabel270.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel270);

        jLabel271.setText("x");
        jLabel271.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel271);

        jLabel272.setText("x");
        jLabel272.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel272);

        jLabel273.setText("x");
        jLabel273.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel273);

        jLabel274.setText("x");
        jLabel274.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel274);

        jLabel275.setText("x");
        jLabel275.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel275);

        jLabel276.setText("x");
        jLabel276.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel276);

        jLabel277.setText("x");
        jLabel277.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel277);

        jLabel278.setText("x");
        jLabel278.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel278);

        jLabel279.setText("x");
        jLabel279.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel279);

        jLabel280.setText("x");
        jLabel280.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel280);

        jLabel281.setText("x");
        jLabel281.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel281);

        jLabel282.setText("x");
        jLabel282.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel282);

        jLabel283.setText("x");
        jLabel283.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel283);

        jLabel285.setText("x");
        jLabel285.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel285);

        jLabel286.setText("x");
        jLabel286.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel286);

        jLabel287.setText("x");
        jLabel287.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel287);

        jLabel288.setText("x");
        jLabel288.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel288);

        jLabel289.setText("x");
        jLabel289.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel289);

        jLabel290.setText("x");
        jLabel290.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel290);

        jLabel291.setText("x");
        jLabel291.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel291);

        jLabel292.setText("x");
        jLabel292.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel292);

        jLabel293.setText("x");
        jLabel293.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel293);

        jLabel294.setText("x");
        jLabel294.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel294);

        jLabel295.setText("x");
        jLabel295.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel295);

        jLabel296.setText("x");
        jLabel296.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel296);

        jLabel297.setText("x");
        jLabel297.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel297);

        jLabel298.setText("x");
        jLabel298.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel298);

        jLabel299.setText("x");
        jLabel299.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel299);

        jLabel300.setText("x");
        jLabel300.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel300);

        jLabel301.setText("x");
        jLabel301.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel301);

        jLabel302.setText("x");
        jLabel302.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel302);

        jLabel303.setText("x");
        jLabel303.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel303);

        jLabel304.setText("x");
        jLabel304.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel304);

        jLabel305.setText("x");
        jLabel305.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel305);

        jLabel306.setText("x");
        jLabel306.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel306);

        jLabel307.setText("x");
        jLabel307.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel307);

        jLabel337.setText("x");
        jLabel337.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel337);

        jLabel308.setText("x");
        jLabel308.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel308);

        jLabel309.setText("x");
        jLabel309.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel309);

        jLabel310.setText("x");
        jLabel310.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel310);

        jLabel311.setText("x");
        jLabel311.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel311);

        jLabel312.setText("x");
        jLabel312.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel312);

        jLabel313.setText("x");
        jLabel313.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel313);

        jLabel314.setText("x");
        jLabel314.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel314);

        jLabel315.setText("x");
        jLabel315.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel315);

        jLabel284.setText("x");
        jLabel284.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel284);

        jLabel316.setText("x");
        jLabel316.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel316);

        jLabel317.setText("x");
        jLabel317.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel317);

        jLabel318.setText("x");
        jLabel318.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel318);

        jLabel319.setText("x");
        jLabel319.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel319);

        jLabel320.setText("x");
        jLabel320.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel320);

        jLabel321.setText("x");
        jLabel321.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel321);

        jLabel322.setText("x");
        jLabel322.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel322);

        jLabel323.setText("x");
        jLabel323.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel323);

        jLabel324.setText("x");
        jLabel324.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel324);

        jLabel325.setText("x");
        jLabel325.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel325);

        jLabel326.setText("x");
        jLabel326.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel326);

        jLabel327.setText("x");
        jLabel327.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel327);

        jLabel328.setText("x");
        jLabel328.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel328);

        jLabel329.setText("x");
        jLabel329.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel329);

        jLabel330.setText("x");
        jLabel330.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel330);

        jLabel331.setText("x");
        jLabel331.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel331);

        jLabel332.setText("x");
        jLabel332.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel332);

        jLabel333.setText("x");
        jLabel333.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel333);

        jLabel334.setText("x");
        jLabel334.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel334);

        jLabel335.setText("x");
        jLabel335.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel335);

        jLabel336.setText("x");
        jLabel336.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel336);

        jLabel338.setText("x");
        jLabel338.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel338);

        jLabel339.setText("x");
        jLabel339.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel339);

        jLabel340.setText("x");
        jLabel340.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel340);

        jLabel341.setText("x");
        jLabel341.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel341);

        jLabel342.setText("x");
        jLabel342.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel342);

        jLabel343.setText("x");
        jLabel343.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel343);

        jLabel344.setText("x");
        jLabel344.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel344);

        jLabel345.setText("x");
        jLabel345.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel345);

        jLabel346.setText("x");
        jLabel346.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel346);

        jLabel347.setText("x");
        jLabel347.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel347);

        jLabel348.setText("x");
        jLabel348.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel348);

        jLabel349.setText("x");
        jLabel349.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel349);

        jLabel350.setText("x");
        jLabel350.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel350);

        jLabel351.setText("x");
        jLabel351.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel351);

        jLabel352.setText("x");
        jLabel352.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel352);

        jLabel353.setText("x");
        jLabel353.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel353);

        jLabel354.setText("x");
        jLabel354.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel354);

        jLabel355.setText("x");
        jLabel355.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel355);

        jLabel356.setText("x");
        jLabel356.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel356);

        jLabel357.setText("x");
        jLabel357.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel357);

        jLabel358.setText("x");
        jLabel358.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel358);

        jLabel359.setText("x");
        jLabel359.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel359);

        jLabel360.setText("x");
        jLabel360.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel360);

        jLabel361.setText("x");
        jLabel361.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel361);

        jLabel362.setText("x");
        jLabel362.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel362);

        jLabel363.setText("x");
        jLabel363.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel363);

        jLabel364.setText("x");
        jLabel364.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel364);

        jLabel365.setText("x");
        jLabel365.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel365);

        jLabel366.setText("x");
        jLabel366.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel366);

        jLabel367.setText("x");
        jLabel367.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel367);

        jLabel368.setText("x");
        jLabel368.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel368);

        jLabel369.setText("x");
        jLabel369.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel369);

        jLabel370.setText("x");
        jLabel370.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel370);

        jLabel371.setText("x");
        jLabel371.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel371);

        jLabel372.setText("x");
        jLabel372.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel372);

        jLabel373.setText("x");
        jLabel373.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel373);

        jLabel374.setText("x");
        jLabel374.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel374);

        jLabel375.setText("x");
        jLabel375.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel375);

        jLabel376.setText("x");
        jLabel376.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel376);

        jLabel377.setText("x");
        jLabel377.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel377);

        jLabel378.setText("x");
        jLabel378.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel378);

        jLabel379.setText("x");
        jLabel379.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel379);

        jLabel380.setText("x");
        jLabel380.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel380);

        jLabel381.setText("x");
        jLabel381.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel381);

        jLabel382.setText("x");
        jLabel382.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel382);

        jLabel383.setText("x");
        jLabel383.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel383);

        jLabel384.setText("x");
        jLabel384.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel384);

        jLabel385.setText("x");
        jLabel385.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel385);

        jLabel386.setText("x");
        jLabel386.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel386);

        jLabel387.setText("x");
        jLabel387.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel387);

        jLabel388.setText("x");
        jLabel388.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel388);

        jLabel389.setText("x");
        jLabel389.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel389);

        jLabel390.setText("x");
        jLabel390.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel390);

        jLabel391.setText("x");
        jLabel391.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel391);

        jLabel392.setText("x");
        jLabel392.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel392);

        jLabel393.setText("x");
        jLabel393.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel393);

        jLabel394.setText("x");
        jLabel394.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel394);

        jLabel395.setText("x");
        jLabel395.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel395);

        jLabel396.setText("x");
        jLabel396.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel396);

        jLabel397.setText("x");
        jLabel397.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel397);

        jLabel398.setText("x");
        jLabel398.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel398);

        jLabel399.setText("x");
        jLabel399.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel399);

        jLabel400.setText("x");
        jLabel400.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel400);

        jLabel401.setText("x");
        jLabel401.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel401);

        jLabel402.setText("x");
        jLabel402.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel402);

        jLabel403.setText("x");
        jLabel403.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel403);

        jLabel404.setText("x");
        jLabel404.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel404);

        jLabel405.setText("x");
        jLabel405.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel405);

        jLabel406.setText("x");
        jLabel406.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel406);

        jLabel407.setText("x");
        jLabel407.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel407);

        jLabel408.setText("x");
        jLabel408.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel408);

        jLabel409.setText("x");
        jLabel409.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel409);

        jLabel410.setText("x");
        jLabel410.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel410);

        jLabel411.setText("x");
        jLabel411.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel411);

        jLabel412.setText("x");
        jLabel412.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel412);

        jLabel413.setText("x");
        jLabel413.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel413);

        jLabel414.setText("x");
        jLabel414.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel414);

        jLabel415.setText("x");
        jLabel415.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel415);

        jLabel416.setText("x");
        jLabel416.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel416);

        jLabel417.setText("x");
        jLabel417.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel417);

        jLabel418.setText("x");
        jLabel418.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel418);

        jLabel419.setText("x");
        jLabel419.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel419);

        jLabel420.setText("x");
        jLabel420.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel420);

        jLabel421.setText("x");
        jLabel421.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel421);

        jLabel422.setText("x");
        jLabel422.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel422);

        jLabel423.setText("x");
        jLabel423.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel423);

        jLabel424.setText("x");
        jLabel424.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel424);

        jLabel425.setText("x");
        jLabel425.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel425);

        jLabel426.setText("x");
        jLabel426.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel426);

        jLabel427.setText("x");
        jLabel427.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel427);

        jLabel428.setText("x");
        jLabel428.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel428);

        jLabel429.setText("x");
        jLabel429.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel429);

        jLabel430.setText("x");
        jLabel430.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel430);

        jLabel431.setText("x");
        jLabel431.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel431);

        jLabel432.setText("x");
        jLabel432.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel432);

        jLabel433.setText("x");
        jLabel433.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel433);

        jLabel434.setText("x");
        jLabel434.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel434);

        jLabel435.setText("x");
        jLabel435.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel435);

        jLabel436.setText("x");
        jLabel436.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel436);

        jLabel437.setText("x");
        jLabel437.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel437);

        jLabel438.setText("x");
        jLabel438.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel438);

        jLabel439.setText("x");
        jLabel439.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel439);

        jLabel440.setText("x");
        jLabel440.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel440);

        jLabel441.setText("x");
        jLabel441.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel441);

        jLabel442.setText("x");
        jLabel442.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel442);

        jLabel443.setText("x");
        jLabel443.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel443);

        jLabel444.setText("x");
        jLabel444.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel444);

        jLabel445.setText("x");
        jLabel445.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel445);

        jLabel446.setText("x");
        jLabel446.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel446);

        jLabel447.setText("x");
        jLabel447.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel447);

        jLabel448.setText("x");
        jLabel448.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel448);

        jLabel449.setText("x");
        jLabel449.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel449);

        jLabel450.setText("x");
        jLabel450.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel450);

        jLabel451.setText("x");
        jLabel451.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel451);

        jLabel452.setText("x");
        jLabel452.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel452);

        jLabel453.setText("x");
        jLabel453.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel453);

        jLabel454.setText("x");
        jLabel454.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel454);

        jLabel455.setText("x");
        jLabel455.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel455);

        jLabel456.setText("x");
        jLabel456.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel456);

        jLabel457.setText("x");
        jLabel457.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel457);

        jLabel458.setText("x");
        jLabel458.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel458);

        jLabel459.setText("x");
        jLabel459.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel459);

        jLabel460.setText("x");
        jLabel460.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel460);

        jLabel461.setText("x");
        jLabel461.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel461);

        jLabel462.setText("x");
        jLabel462.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel462);

        jLabel463.setText("x");
        jLabel463.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel463);

        jLabel464.setText("x");
        jLabel464.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel464);

        jLabel465.setText("x");
        jLabel465.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel465);

        jLabel466.setText("x");
        jLabel466.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel466);

        jLabel467.setText("x");
        jLabel467.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel467);

        jLabel468.setText("x");
        jLabel468.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel468);

        jLabel469.setText("x");
        jLabel469.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel469);

        jLabel470.setText("x");
        jLabel470.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel470);

        jLabel471.setText("x");
        jLabel471.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel471);

        jLabel472.setText("x");
        jLabel472.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel472);

        jLabel473.setText("x");
        jLabel473.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel473);

        jLabel474.setText("x");
        jLabel474.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel474);

        jLabel475.setText("x");
        jLabel475.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel475);

        jLabel476.setText("x");
        jLabel476.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel476);

        jLabel477.setText("x");
        jLabel477.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel477);

        jLabel478.setText("x");
        jLabel478.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel478);

        jLabel479.setText("x");
        jLabel479.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel479);

        jLabel480.setText("x");
        jLabel480.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel480);

        jLabel481.setText("x");
        jLabel481.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel481);

        jLabel482.setText("x");
        jLabel482.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel482);

        jLabel483.setText("x");
        jLabel483.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel483);

        jLabel484.setText("x");
        jLabel484.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel484);

        jLabel485.setText("x");
        jLabel485.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel485);

        jLabel486.setText("x");
        jLabel486.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel486);

        jLabel487.setText("x");
        jLabel487.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel487);

        jLabel488.setText("x");
        jLabel488.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel488);

        jLabel489.setText("x");
        jLabel489.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel489);

        jLabel490.setText("x");
        jLabel490.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel490);

        jLabel491.setText("x");
        jLabel491.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel491);

        jLabel492.setText("x");
        jLabel492.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel492);

        jLabel493.setText("x");
        jLabel493.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel493);

        jLabel494.setText("x");
        jLabel494.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel494);

        jLabel495.setText("x");
        jLabel495.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel495);

        jLabel496.setText("x");
        jLabel496.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel496);

        jLabel497.setText("x");
        jLabel497.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel497);

        jLabel498.setText("x");
        jLabel498.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel498);

        jLabel499.setText("x");
        jLabel499.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel499);

        jLabel500.setText("x");
        jLabel500.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel500);

        jLabel501.setText("x");
        jLabel501.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel501);

        jLabel502.setText("x");
        jLabel502.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel502);

        jLabel503.setText("x");
        jLabel503.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel503);

        jLabel504.setText("x");
        jLabel504.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel504);

        jLabel505.setText("x");
        jLabel505.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel505);

        jLabel506.setText("x");
        jLabel506.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel506);

        jLabel507.setText("x");
        jLabel507.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel507);

        jLabel508.setText("x");
        jLabel508.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel508);

        jLabel509.setText("x");
        jLabel509.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel509);

        jLabel510.setText("x");
        jLabel510.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel510);

        jLabel511.setText("x");
        jLabel511.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel511);

        jLabel512.setText("x");
        jLabel512.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel512);

        jLabel513.setText("x");
        jLabel513.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel513);

        jLabel514.setText("x");
        jLabel514.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel514);

        jLabel515.setText("x");
        jLabel515.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel515);

        jLabel516.setText("x");
        jLabel516.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel516);

        jLabel517.setText("x");
        jLabel517.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel517);

        jLabel546.setText("x");
        jLabel546.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel546);

        jLabel518.setText("x");
        jLabel518.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel518);

        jLabel519.setText("x");
        jLabel519.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel519);

        jLabel520.setText("x");
        jLabel520.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel520);

        jLabel521.setText("x");
        jLabel521.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel521);

        jLabel522.setText("x");
        jLabel522.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel522);

        jLabel523.setText("x");
        jLabel523.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel523);

        jLabel524.setText("x");
        jLabel524.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel524);

        jLabel525.setText("x");
        jLabel525.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel525);

        jLabel526.setText("x");
        jLabel526.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel526);

        jLabel527.setText("x");
        jLabel527.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel527);

        jLabel528.setText("x");
        jLabel528.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel528);

        jLabel529.setText("x");
        jLabel529.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel529);

        jLabel530.setText("x");
        jLabel530.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel530);

        jLabel531.setText("x");
        jLabel531.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel531);

        jLabel532.setText("x");
        jLabel532.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel532);

        jLabel533.setText("x");
        jLabel533.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel533);

        jLabel534.setText("x");
        jLabel534.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel534);

        jLabel535.setText("x");
        jLabel535.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel535);

        jLabel536.setText("x");
        jLabel536.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel536);

        jLabel537.setText("x");
        jLabel537.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel537);

        jLabel538.setText("x");
        jLabel538.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel538);

        jLabel539.setText("x");
        jLabel539.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel539);

        jLabel540.setText("x");
        jLabel540.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel540);

        jLabel541.setText("x");
        jLabel541.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel541);

        jLabel542.setText("x");
        jLabel542.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel542);

        jLabel543.setText("x");
        jLabel543.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel543);

        jLabel544.setText("x");
        jLabel544.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel544);

        jLabel545.setText("x");
        jLabel545.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel545);

        jLabel547.setText("x");
        jLabel547.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel547);

        jLabel548.setText("x");
        jLabel548.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel548);

        jLabel549.setText("x");
        jLabel549.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel549);

        jLabel550.setText("x");
        jLabel550.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel550);

        jLabel551.setText("x");
        jLabel551.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel551);

        jLabel552.setText("x");
        jLabel552.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel552);

        jLabel553.setText("x");
        jLabel553.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel553);

        jLabel554.setText("x");
        jLabel554.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel554);

        jLabel555.setText("x");
        jLabel555.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel555);

        jLabel556.setText("x");
        jLabel556.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel556);

        jLabel557.setText("x");
        jLabel557.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel557);

        jLabel558.setText("x");
        jLabel558.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel558);

        jLabel559.setText("x");
        jLabel559.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel559);

        jLabel560.setText("x");
        jLabel560.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel560);

        jLabel561.setText("x");
        jLabel561.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel561);

        jLabel562.setText("x");
        jLabel562.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel562);

        jLabel563.setText("x");
        jLabel563.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel563);

        jLabel564.setText("x");
        jLabel564.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel564);

        jLabel565.setText("x");
        jLabel565.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel565);

        jLabel566.setText("x");
        jLabel566.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel566);

        jLabel567.setText("x");
        jLabel567.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel567);

        jLabel568.setText("x");
        jLabel568.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel568);

        jLabel569.setText("x");
        jLabel569.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel569);

        jLabel570.setText("x");
        jLabel570.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel570);

        jLabel571.setText("x");
        jLabel571.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel571);

        jLabel572.setText("x");
        jLabel572.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel572);

        jLabel573.setText("x");
        jLabel573.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel573);

        jLabel574.setText("x");
        jLabel574.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel574);

        jLabel575.setText("x");
        jLabel575.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel575);

        jLabel576.setText("x");
        jLabel576.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel576);

        jLabel577.setText("x");
        jLabel577.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel577);

        jLabel578.setText("x");
        jLabel578.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel578);

        jLabel579.setText("x");
        jLabel579.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel579);

        jLabel580.setText("x");
        jLabel580.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel580);

        jLabel581.setText("x");
        jLabel581.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel581);

        jLabel582.setText("x");
        jLabel582.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel582);

        jLabel583.setText("x");
        jLabel583.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel583);

        jLabel584.setText("x");
        jLabel584.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel584);

        jLabel585.setText("x");
        jLabel585.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel585);

        jLabel586.setText("x");
        jLabel586.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel586);

        jLabel587.setText("x");
        jLabel587.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel587);

        jLabel588.setText("x");
        jLabel588.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel588);

        jLabel589.setText("x");
        jLabel589.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel589);

        jLabel590.setText("x");
        jLabel590.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel590);

        jLabel591.setText("x");
        jLabel591.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel591);

        jLabel592.setText("x");
        jLabel592.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel592);

        jLabel593.setText("x");
        jLabel593.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel593);

        jLabel594.setText("x");
        jLabel594.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel594);

        jLabel595.setText("x");
        jLabel595.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel595);

        jLabel596.setText("x");
        jLabel596.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel596);

        jLabel597.setText("x");
        jLabel597.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel597);

        jLabel598.setText("x");
        jLabel598.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel598);

        jLabel599.setText("x");
        jLabel599.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel599);

        jLabel600.setText("x");
        jLabel600.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel600);

        jLabel640.setText("x");
        jLabel640.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CuadriculaDeJuego.add(jLabel640);

        jPanel1.add(CuadriculaDeJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 790, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANTONY\\Desktop\\POOSeaWar\\POOSeaWar\\recursos\\Fondo.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*String comando = txComandos.getText().trim();
        if (!comando.equals("")){
            String array[] = CommandUtils.convertToArray(comando);
            BaseComandos newCommand = CommandFactory.getCommand(array[0], array);
            if (newCommand.getCommandName().toUpperCase().equals("ERROR"))
                showClientMessage(newCommand.executeOnClient());
            else{
            try {
                    cliente.writer.writeObject(newCommand);
                } catch (IOException ex) {}
            }
        }
        */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Conectar_borrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Conectar_borrActionPerformed
        this.cliente.conectado();
    }//GEN-LAST:event_Conectar_borrActionPerformed
      
    private void crearLables()
    {
        for(int i=0;i<20;i++)
        {   JLabel label = new JLabel("Label"+i);
            label.setText("");
            label.setBackground(elegirColor());
            
        }
        
            
    }
    
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
    private javax.swing.JButton Conectar_borr;
    private javax.swing.JPanel CuadriculaDeJuego;
    private javax.swing.JPanel Filas;
    private javax.swing.JLabel LbNombre_Bitacora;
    private javax.swing.JScrollPane Resultados;
    private javax.swing.JTextArea TxtBitacora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel353;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JLabel jLabel359;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel360;
    private javax.swing.JLabel jLabel361;
    private javax.swing.JLabel jLabel362;
    private javax.swing.JLabel jLabel363;
    private javax.swing.JLabel jLabel364;
    private javax.swing.JLabel jLabel365;
    private javax.swing.JLabel jLabel366;
    private javax.swing.JLabel jLabel367;
    private javax.swing.JLabel jLabel368;
    private javax.swing.JLabel jLabel369;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel384;
    private javax.swing.JLabel jLabel385;
    private javax.swing.JLabel jLabel386;
    private javax.swing.JLabel jLabel387;
    private javax.swing.JLabel jLabel388;
    private javax.swing.JLabel jLabel389;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel390;
    private javax.swing.JLabel jLabel391;
    private javax.swing.JLabel jLabel392;
    private javax.swing.JLabel jLabel393;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel395;
    private javax.swing.JLabel jLabel396;
    private javax.swing.JLabel jLabel397;
    private javax.swing.JLabel jLabel398;
    private javax.swing.JLabel jLabel399;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel400;
    private javax.swing.JLabel jLabel401;
    private javax.swing.JLabel jLabel402;
    private javax.swing.JLabel jLabel403;
    private javax.swing.JLabel jLabel404;
    private javax.swing.JLabel jLabel405;
    private javax.swing.JLabel jLabel406;
    private javax.swing.JLabel jLabel407;
    private javax.swing.JLabel jLabel408;
    private javax.swing.JLabel jLabel409;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel410;
    private javax.swing.JLabel jLabel411;
    private javax.swing.JLabel jLabel412;
    private javax.swing.JLabel jLabel413;
    private javax.swing.JLabel jLabel414;
    private javax.swing.JLabel jLabel415;
    private javax.swing.JLabel jLabel416;
    private javax.swing.JLabel jLabel417;
    private javax.swing.JLabel jLabel418;
    private javax.swing.JLabel jLabel419;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel420;
    private javax.swing.JLabel jLabel421;
    private javax.swing.JLabel jLabel422;
    private javax.swing.JLabel jLabel423;
    private javax.swing.JLabel jLabel424;
    private javax.swing.JLabel jLabel425;
    private javax.swing.JLabel jLabel426;
    private javax.swing.JLabel jLabel427;
    private javax.swing.JLabel jLabel428;
    private javax.swing.JLabel jLabel429;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel430;
    private javax.swing.JLabel jLabel431;
    private javax.swing.JLabel jLabel432;
    private javax.swing.JLabel jLabel433;
    private javax.swing.JLabel jLabel434;
    private javax.swing.JLabel jLabel435;
    private javax.swing.JLabel jLabel436;
    private javax.swing.JLabel jLabel437;
    private javax.swing.JLabel jLabel438;
    private javax.swing.JLabel jLabel439;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel440;
    private javax.swing.JLabel jLabel441;
    private javax.swing.JLabel jLabel442;
    private javax.swing.JLabel jLabel443;
    private javax.swing.JLabel jLabel444;
    private javax.swing.JLabel jLabel445;
    private javax.swing.JLabel jLabel446;
    private javax.swing.JLabel jLabel447;
    private javax.swing.JLabel jLabel448;
    private javax.swing.JLabel jLabel449;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel450;
    private javax.swing.JLabel jLabel451;
    private javax.swing.JLabel jLabel452;
    private javax.swing.JLabel jLabel453;
    private javax.swing.JLabel jLabel454;
    private javax.swing.JLabel jLabel455;
    private javax.swing.JLabel jLabel456;
    private javax.swing.JLabel jLabel457;
    private javax.swing.JLabel jLabel458;
    private javax.swing.JLabel jLabel459;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel460;
    private javax.swing.JLabel jLabel461;
    private javax.swing.JLabel jLabel462;
    private javax.swing.JLabel jLabel463;
    private javax.swing.JLabel jLabel464;
    private javax.swing.JLabel jLabel465;
    private javax.swing.JLabel jLabel466;
    private javax.swing.JLabel jLabel467;
    private javax.swing.JLabel jLabel468;
    private javax.swing.JLabel jLabel469;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel470;
    private javax.swing.JLabel jLabel471;
    private javax.swing.JLabel jLabel472;
    private javax.swing.JLabel jLabel473;
    private javax.swing.JLabel jLabel474;
    private javax.swing.JLabel jLabel475;
    private javax.swing.JLabel jLabel476;
    private javax.swing.JLabel jLabel477;
    private javax.swing.JLabel jLabel478;
    private javax.swing.JLabel jLabel479;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel480;
    private javax.swing.JLabel jLabel481;
    private javax.swing.JLabel jLabel482;
    private javax.swing.JLabel jLabel483;
    private javax.swing.JLabel jLabel484;
    private javax.swing.JLabel jLabel485;
    private javax.swing.JLabel jLabel486;
    private javax.swing.JLabel jLabel487;
    private javax.swing.JLabel jLabel488;
    private javax.swing.JLabel jLabel489;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel490;
    private javax.swing.JLabel jLabel491;
    private javax.swing.JLabel jLabel492;
    private javax.swing.JLabel jLabel493;
    private javax.swing.JLabel jLabel494;
    private javax.swing.JLabel jLabel495;
    private javax.swing.JLabel jLabel496;
    private javax.swing.JLabel jLabel497;
    private javax.swing.JLabel jLabel498;
    private javax.swing.JLabel jLabel499;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel500;
    private javax.swing.JLabel jLabel501;
    private javax.swing.JLabel jLabel502;
    private javax.swing.JLabel jLabel503;
    private javax.swing.JLabel jLabel504;
    private javax.swing.JLabel jLabel505;
    private javax.swing.JLabel jLabel506;
    private javax.swing.JLabel jLabel507;
    private javax.swing.JLabel jLabel508;
    private javax.swing.JLabel jLabel509;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel510;
    private javax.swing.JLabel jLabel511;
    private javax.swing.JLabel jLabel512;
    private javax.swing.JLabel jLabel513;
    private javax.swing.JLabel jLabel514;
    private javax.swing.JLabel jLabel515;
    private javax.swing.JLabel jLabel516;
    private javax.swing.JLabel jLabel517;
    private javax.swing.JLabel jLabel518;
    private javax.swing.JLabel jLabel519;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel520;
    private javax.swing.JLabel jLabel521;
    private javax.swing.JLabel jLabel522;
    private javax.swing.JLabel jLabel523;
    private javax.swing.JLabel jLabel524;
    private javax.swing.JLabel jLabel525;
    private javax.swing.JLabel jLabel526;
    private javax.swing.JLabel jLabel527;
    private javax.swing.JLabel jLabel528;
    private javax.swing.JLabel jLabel529;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel530;
    private javax.swing.JLabel jLabel531;
    private javax.swing.JLabel jLabel532;
    private javax.swing.JLabel jLabel533;
    private javax.swing.JLabel jLabel534;
    private javax.swing.JLabel jLabel535;
    private javax.swing.JLabel jLabel536;
    private javax.swing.JLabel jLabel537;
    private javax.swing.JLabel jLabel538;
    private javax.swing.JLabel jLabel539;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel540;
    private javax.swing.JLabel jLabel541;
    private javax.swing.JLabel jLabel542;
    private javax.swing.JLabel jLabel543;
    private javax.swing.JLabel jLabel544;
    private javax.swing.JLabel jLabel545;
    private javax.swing.JLabel jLabel546;
    private javax.swing.JLabel jLabel547;
    private javax.swing.JLabel jLabel548;
    private javax.swing.JLabel jLabel549;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel550;
    private javax.swing.JLabel jLabel551;
    private javax.swing.JLabel jLabel552;
    private javax.swing.JLabel jLabel553;
    private javax.swing.JLabel jLabel554;
    private javax.swing.JLabel jLabel555;
    private javax.swing.JLabel jLabel556;
    private javax.swing.JLabel jLabel557;
    private javax.swing.JLabel jLabel558;
    private javax.swing.JLabel jLabel559;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel560;
    private javax.swing.JLabel jLabel561;
    private javax.swing.JLabel jLabel562;
    private javax.swing.JLabel jLabel563;
    private javax.swing.JLabel jLabel564;
    private javax.swing.JLabel jLabel565;
    private javax.swing.JLabel jLabel566;
    private javax.swing.JLabel jLabel567;
    private javax.swing.JLabel jLabel568;
    private javax.swing.JLabel jLabel569;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel570;
    private javax.swing.JLabel jLabel571;
    private javax.swing.JLabel jLabel572;
    private javax.swing.JLabel jLabel573;
    private javax.swing.JLabel jLabel574;
    private javax.swing.JLabel jLabel575;
    private javax.swing.JLabel jLabel576;
    private javax.swing.JLabel jLabel577;
    private javax.swing.JLabel jLabel578;
    private javax.swing.JLabel jLabel579;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel580;
    private javax.swing.JLabel jLabel581;
    private javax.swing.JLabel jLabel582;
    private javax.swing.JLabel jLabel583;
    private javax.swing.JLabel jLabel584;
    private javax.swing.JLabel jLabel585;
    private javax.swing.JLabel jLabel586;
    private javax.swing.JLabel jLabel587;
    private javax.swing.JLabel jLabel588;
    private javax.swing.JLabel jLabel589;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel590;
    private javax.swing.JLabel jLabel591;
    private javax.swing.JLabel jLabel592;
    private javax.swing.JLabel jLabel593;
    private javax.swing.JLabel jLabel594;
    private javax.swing.JLabel jLabel595;
    private javax.swing.JLabel jLabel596;
    private javax.swing.JLabel jLabel597;
    private javax.swing.JLabel jLabel598;
    private javax.swing.JLabel jLabel599;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel600;
    private javax.swing.JLabel jLabel602;
    private javax.swing.JLabel jLabel603;
    private javax.swing.JLabel jLabel604;
    private javax.swing.JLabel jLabel605;
    private javax.swing.JLabel jLabel606;
    private javax.swing.JLabel jLabel607;
    private javax.swing.JLabel jLabel608;
    private javax.swing.JLabel jLabel609;
    private javax.swing.JLabel jLabel61;
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
    private javax.swing.JLabel jLabel62;
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
    private javax.swing.JLabel jLabel63;
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
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel640;
    private javax.swing.JLabel jLabel641;
    private javax.swing.JLabel jLabel642;
    private javax.swing.JLabel jLabel643;
    private javax.swing.JLabel jLabel644;
    private javax.swing.JLabel jLabel645;
    private javax.swing.JLabel jLabel646;
    private javax.swing.JLabel jLabel647;
    private javax.swing.JLabel jLabel648;
    private javax.swing.JLabel jLabel649;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel650;
    private javax.swing.JLabel jLabel651;
    private javax.swing.JLabel jLabel652;
    private javax.swing.JLabel jLabel653;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea txComandos;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables
}
