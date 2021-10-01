/**
 * 
 */
package com.excelsis.DemoClienteServidor.service.impl;

import com.excelsis.DemoClienteServidor.entity.Anime;
import com.excelsis.DemoClienteServidor.exceptions.OpenWebinarsException;
import com.excelsis.DemoClienteServidor.repository.AnimeRepository;
import com.excelsis.DemoClienteServidor.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author OpenWebinars.
 * @version 1.0 03/03/2021
 * 
 * Clase que implementa los metodos de logica de negocio para la pantalla de animes.
 */
@Service
public class AnimeServiceImpl implements AnimeService {

	@Autowired
	private AnimeRepository animeRepository;

	@Override
	public List<Anime> consultarAnimes() throws OpenWebinarsException {

		List<Anime> animesConsultados = StreamSupport.stream(
				this.animeRepository.findAll().spliterator(), false).collect(Collectors.toList());
		
		return animesConsultados;
		
	}

	@Override
	public Anime guardarAnime(Anime anime) throws OpenWebinarsException {
		anime.setFechaCreacion(LocalDateTime.now());
		return this.animeRepository.save(anime);
	}

	@Override
	public Anime actualizarAnime(Anime anime) throws OpenWebinarsException {
		return this.animeRepository.save(anime);
	}

	@Override
	public void eliminarAnime(Long id) throws OpenWebinarsException {
		this.animeRepository.deleteById(id);

	}

}
