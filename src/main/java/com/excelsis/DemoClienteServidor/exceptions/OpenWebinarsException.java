/**
 * 
 */
package com.excelsis.DemoClienteServidor.exceptions;

/**
 * @author OpenWebinars
 * @version 1.0 03/03/2021
 * 
 * Excepcion personalizada para mostrar los errores de la aplicación de animes de OpenWebinars.
 */
public class OpenWebinarsException extends Exception {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3230061859863400898L;

	/**
	 * Constructor que inicializa la excepcion.
	 * @param mensaje
	 * @param throwable
	 */
	public OpenWebinarsException(String mensaje, Throwable throwable) {
		super(mensaje, throwable);
	}
}
