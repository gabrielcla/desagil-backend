package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist; // Só getter
	private String name; // Só getter
	private int duration; // Só getter
	
	public Track(Artist artista, String nome, int duracao) {
		this.artist = artista;
		this.name = nome;
		this.duration = duracao;
	}
	
	// Recebe nada e retorna String com a duração em minutos e segundos
	public String getDurationString() {
		int t = this.duration;
		double k = t/60;
		int h = (int) k;
		double m = t - h*60;	
		
		String val = null;
		if (m < 1) {
			val = "0:00";
		} else if (m < 10 && m>0) {
			val = String.valueOf(h)+":0"+String.valueOf(m);
		} else {
			val = String.valueOf(h)+":"+String.valueOf(m);
		}
		return val;
	}
	
	// Recebe nada e retorna nome completo do artista
	public String getFullArtistName() {
		return this.artist.getName();
	}
	
	
	
	public Artist getArtista() {
		return artist;
	}
	public String getName() {
		return name;
	}
	public int getDuration() {
		return duration;
	}	
	
}
