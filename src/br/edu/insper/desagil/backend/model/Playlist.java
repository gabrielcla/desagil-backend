package br.edu.insper.desagil.backend.model;

import java.util.List;
import java.util.Map;

public class Playlist {
	private int id; // só getter
	private List<Track> tracks; // só getter
	private Map<String, Integer> ratings; // só getter
	
	public Playlist(int id) {
		this.id = id;
		this.tracks = null; // inicializada como vazia
		this.ratings = null; // inicializada como vazia
	}

	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public void putRating(String nome, int rat) {
		this.ratings.put(nome, rat);
	}
	
	public double averageRatings() {
		int soma = 0;
		for (int v: this.ratings.values()) {
			soma = soma + v;
		}
		double average = soma/this.ratings.size();
		
		int i = (int) average;
		double d = average - i;
		double u = 0.0;
		
		if (d < 0.26) {
			u = 0.0;
		} else if (d >= 0.26 && d < 0.74) {
			u = 0.5;
		} else if (d >= 0.74) {
			u = 1.0;
		}
		
		double res = i+u;
		
		return res;
	}
	
	
	public int getId() {
		return id;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public Map<String, Integer> getRatings() {
		return ratings;
	}


	
}
