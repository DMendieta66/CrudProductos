/**
 * 
 */
package com.excelsis.DemoClienteServidor.entity;

import lombok.Data;
import com.excelsis.DemoClienteServidor.commons.CommonFields;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author OpenWebinar
 * @version 1.0 03/03/2021
 * 
 * Clase que reprensenta una entidad en la base de datos de Animes.
 */
@Data
@Entity
@Table(name="anime")
public class Anime extends CommonFields {
	/**
	 * Nombre del anime.
	 */
	@Column(name = "nombre")
	private String nombre;
	/**
	 * Genero del anime.
	 */
	@Column(name = "genero")
	private String genero;
}
