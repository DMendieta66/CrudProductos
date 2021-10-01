/**
 * 
 */
package com.excelsis.DemoClienteServidor.utils;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 * @author OpenWebinars.
 * @version 1.0
 */
public class CommonsUtils {

	/**
	 * Metodo que puede ser reutilizado para mostrar mensajes de la aplicacion desde el backend.
	 * @param severity {@link Severity} objeto con el tipo de mensaje a mostrar.
	 * @param summary {@link String} titulo del mensaje.
	 * @param detail {@link String} detalle del mensajje.
	 */
	public static void mostrarMensaje(Severity severity, String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
	}
}
