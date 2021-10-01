/**
 * 
 */
package com.excelsis.DemoClienteServidor.controller;

import com.excelsis.DemoClienteServidor.entity.Anime;
import com.excelsis.DemoClienteServidor.exceptions.OpenWebinarsException;
import com.excelsis.DemoClienteServidor.service.AnimeService;
import com.excelsis.DemoClienteServidor.utils.CommonsUtils;
import org.primefaces.PrimeFaces;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;

/**
 * @author OpenWebinars.
 * @version 1.0.
 * 
 * Clase que representa el controlador de la pantalla del CRUD de Animes.
 */
@ManagedBean
@ViewScoped
public class AnimeController {
	/**
	 * Animes a mostrar en el datatable.
	 */
	private List<Anime> animes;
	/**
	 * Animes filtrados.
	 */
	private List<Anime> animesFiltrados;
	/**
	 * Objeto anime a guardar, actualizar o eliminar.
	 */
	private Anime anime;
	/**
	 * Objeto de logica de negocio para los servicios de animes.
	 */
	@ManagedProperty("#{animeServiceImpl}")
	private AnimeService animeServiceImpl;
	
	/**
	 * Metodo que inicializa la pantalla de animes durante la carga de la pantalla.
	 */
	@PostConstruct
	public void init() {
		this.consultar();
		this.inicializarComponentes();
	}
	
	/**
	 * Metodo que permite inicializar los componentes de la pantalla.
	 */
	public void inicializarComponentes() {
		this.anime = new Anime();
	}
	
	/**
	 * Metodo que permite consultar los animes.
	 */
	public void consultar() {
		try {
			this.animes = this.animeServiceImpl.consultarAnimes();
		} catch (OpenWebinarsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo que permite guardar o actualizar un anime.
	 */
	public void guardar() {
		
		if (this.anime.getId() == null) {
			
			try {
				Anime animeGuardado = this.animeServiceImpl.guardarAnime(anime);
				
				PrimeFaces.current().executeScript("PF('dlgAnime').hide()");
				
				this.consultar();
				
				CommonsUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "¡Éxito!",
						"Anime " + animeGuardado.getNombre() + " guardado exitósamente");
				
				this.inicializarComponentes();
			} catch (OpenWebinarsException e) {
				CommonsUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "¡UPS!", e.getMessage());

				e.printStackTrace();
			}
			
		} else {
			
			try {
				Anime animeActualizado = this.animeServiceImpl.actualizarAnime(anime);
				
				PrimeFaces.current().executeScript("PF('dlgAnime').hide()");
				
				this.consultar();
				
				CommonsUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "¡Éxito!", 
						"Anime " + animeActualizado.getNombre() + " actualizado exitósamente");
				
				this.inicializarComponentes();				
			} catch (Exception e) {
				CommonsUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "¡UPS!", e.getMessage());

				e.printStackTrace();
			}

		}
	}
	
	/**
	 * Metodo que permite cargar un anime que se desea actualizar.
	 * @param animeSeleccionado {@link Anime} objeto con el anime a actualizar.
	 */
	public void cargarAnime(Anime animeSeleccionado) {
		this.anime = animeSeleccionado;
	}
	
	/**
	 * Metodo que permite eliminar un anime.
	 * @param animeEliminado {@link Anime} anime seleccionado del datatable a eliminar.
	 */
	public void eliminar(Anime animeEliminado) {
		
		try {
			this.animeServiceImpl.eliminarAnime(animeEliminado.getId());
			
			this.consultar();
			
			CommonsUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "¡Éxito!", 
					"Anime " + animeEliminado.getNombre() + " eliminado exitósamente");
			
			this.inicializarComponentes();	
		} catch (OpenWebinarsException e) {
			CommonsUtils.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "¡UPS!", e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public List<Anime> getAnimes() {
		return animes;
	}

	public void setAnimes(List<Anime> animes) {
		this.animes = animes;
	}

	public List<Anime> getAnimesFiltrados() {
		return animesFiltrados;
	}

	public void setAnimesFiltrados(List<Anime> animesFiltrados) {
		this.animesFiltrados = animesFiltrados;
	}

	public AnimeService getAnimeServiceImpl() {
		return animeServiceImpl;
	}

	public void setAnimeServiceImpl(AnimeService animeServiceImpl) {
		this.animeServiceImpl = animeServiceImpl;
	}

	public Anime getAnime() {
		return anime;
	}

	public void setAnime(Anime anime) {
		this.anime = anime;
	}
}
