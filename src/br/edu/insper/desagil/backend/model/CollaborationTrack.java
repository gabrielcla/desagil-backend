package br.edu.insper.desagil.backend.model;

import java.util.List;

public class CollaborationTrack extends Track { // extends Track
	private List<Artist> collaborators; // sem getter nem setter

	public CollaborationTrack(Artist artista, List<Artist> colabs,  String nome, int duracao) {
		super(artista, nome, duracao);
		this.collaborators = colabs;
	}
	
	@Override
	public String getFullArtistName() {
		
		String principal = super.getFullArtistName();
		
		List<String> secs = null; 
		for (Artist a: this.collaborators) {
			secs.add(a.getName());
		}
		
		String comp = String.join(",", secs);
		
		String val = principal + " ("+ comp+")";
		return val;
	}
	
}
