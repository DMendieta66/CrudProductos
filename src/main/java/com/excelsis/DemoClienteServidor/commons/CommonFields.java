/**
 * 
 */
package com.excelsis.DemoClienteServidor.commons;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author OpenWebinars.
 *
 */
@Data
@MappedSuperclass
public class CommonFields {
	/**
	 * Identificador de las tablas.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	/**
	 * Fecha de creacion del registro en la tabla.
	 */
	@Column(name = "fecha_creacion")
	private LocalDateTime fechaCreacion;

}
