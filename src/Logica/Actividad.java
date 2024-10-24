package Logica;

import java.util.ArrayList;

import java.io.Serializable;


public abstract class Actividad implements Serializable {

	private String descripcion;
	private String objetivo;
	private int nivelDificultad;
	private int duracionEsperada;
	private String fechaLimite;
	private ArrayList<Actividad> listaActividadPrevia;
	private boolean actividadCompletada;
	
	
	public Actividad(String descripcion, String objetivo, String fechaLimite, int nivelDificultad, int duracionEsperada, boolean actividadCompletada) {
		this.descripcion = descripcion;
		this.objetivo = objetivo;
		this.fechaLimite = fechaLimite;
		this.nivelDificultad = nivelDificultad;
		this.duracionEsperada = duracionEsperada;
		listaActividadPrevia = new ArrayList<>();
		this.actividadCompletada = actividadCompletada;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getObjetivo() {
		return objetivo;
	}


	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}


	public int getNivelDificultad() {
		return nivelDificultad;
	}


	public void setNivelDificultad(int nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}


	public int getDuracionEsperada() {
		return duracionEsperada;
	}


	public void setDuracionEsperada(int duracionEsperada) {
		this.duracionEsperada = duracionEsperada;
	}


	public String getFechaLimite() {
		return fechaLimite;
	}


	public void setFechaLimite(String fechaLimite) {
		this.fechaLimite = fechaLimite;
	}


	public ArrayList<Actividad> getListaActividadPrevia() {
		return listaActividadPrevia;
	}


	public void setListaActividadPrevia(ArrayList<Actividad> listaActividadPrevia) {
		this.listaActividadPrevia = listaActividadPrevia;
	}


	public boolean isActividadCompletada() {
		return actividadCompletada;
	}


	public void setActividadCompletada(boolean actividadCompletada) {
		this.actividadCompletada = actividadCompletada;
	}
	
	
}


