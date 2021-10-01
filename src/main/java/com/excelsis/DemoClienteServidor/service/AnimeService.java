/**
 * 
 */
package com.excelsis.DemoClienteServidor.service;

import com.excelsis.DemoClienteServidor.entity.Anime;
import com.excelsis.DemoClienteServidor.exceptions.OpenWebinarsException;

import java.util.List;

/**
 * @author OpenWebinars
 * @version 1.0 03/03/2021
 * 
 * Interface que define los metodos de logica de negocio para la pantalla de animes.
 */
public interface AnimeService {
	/**
	 * Metodo que permite consultar animes.
	 * @return {@link List} lista de animes consultados.
	 * @throws OpenWebinarsException Excepcion generada en caso de error al ejecutar la transaccion.
	 */
	List<Anime> consultarAnimes() throws OpenWebinarsException;
	/**
	 * Metodo que permite guardar un anime.
	 * @param anime {@link Anime} objeto a guardar del anime.
	 * @return {@link Anime} anime guardado.
	 * @throws OpenWebinarsException Excepcion generada en caso de error al ejecutar la transaccion.
	 */
	Anime guardarAnime(Anime anime) throws OpenWebinarsException;
	/**
	 * Metodo que permite actualizar un anime.
	 * @param anime {@link Anime} objeto a actualizar del anime.
	 * @return {@link Anime} anime actualizado.
	 * @throws OpenWebinarsException Excepcion generada en caso de error al ejecutar la transaccion.
	 */
	Anime actualizarAnime(Anime anime) throws OpenWebinarsException;
	/**
	 * Metodo que permite eliminar un anime.
	 * @param id {@link Long} identificador del anime a eliminar.
	 * @throws OpenWebinarsException Excepcion generada en caso de error al ejecutar la transaccion.
	 */
	void eliminarAnime(Long id) throws OpenWebinarsException;
}
