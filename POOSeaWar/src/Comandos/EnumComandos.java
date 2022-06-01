/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Comandos;

/**
 *
 * @author moig1
 */
public enum EnumComandos {
    CNSE("Conecta con el servidor.","CNSE-nombre del rey"),
    CRPE("Crea nuevo personaje.","CRPE-nombre-url-sanidad-resistencia-fuerza-porcentaje-poder"),
    INIP("Iniciar partida.","INIP"),
    CHGE("Chat general.","CHGE-mensaje a enviar"),
    CHPR("Enviar mensaje a un enemigo particular","CHPR-nombre destinatario-mensaje a enviar"),
    ATQE("Ataca un enemigo.","ATQE-enemigo-personaje-ataque-argumentos"),
    VERC("Ve los detalles de una celda particular.","VERC-x-y"),
    CONE("se muestra el estado del enemigo: porcentaje de vida, casillas de muertas del total","CONE-enemigo"),
    SALT("Salta el turno.","SALT"),
    REND("Rendirse.","REND"),
    LOGT("muestra un detalle de TODOS los eventos que han sucedido: ataques recididos, ataques ejecutados","LOGT"),
    LOGR("resumen: da cuántos ataques se han realizado y cuál es el porcentaje de éxito, cuántos atinaron, cuántos no.","LOGR"),
    SANI("En vez de atacar, sana las casillas heridas, en proporcion a la sanidad del personaje.","SANI-personaje"),
    ESCU("En vez de atacar, protege las casillas no muertas con un escudo equivalente a la resistencia del personaje","ESCU-personaje"),
    MOVC("Muestra en el mapa la vida de cada celda","MOVC-X-Y");
    
	private String descripcion;
	private String ejemplo;
	
	private EnumComandos (String descripcion,String ejemplo){
		this.descripcion = descripcion;
                this.ejemplo=ejemplo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEjemplo() {
		return ejemplo;
	}	
    
}
