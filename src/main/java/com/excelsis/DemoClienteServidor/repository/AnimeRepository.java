/**
 * 
 */
package com.excelsis.DemoClienteServidor.repository;

import com.excelsis.DemoClienteServidor.entity.Anime;
import org.springframework.data.repository.CrudRepository;

/**
 * @author OpenWebinars
 * @version 1.0 02/03/2021
 * 
 * Interface que contiene el CRUD de animes, heredado del CrudRepository de Spring JPA.
 */
public interface AnimeRepository extends CrudRepository<Anime, Long> {

}
