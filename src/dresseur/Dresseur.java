package dresseur;

import java.util.ArrayList;
import java.util.List;

import pokemon.Pokemon;

public class Dresseur {

	private String nom;
	private int argent;
	private List<Pokemon> sacADos = new ArrayList<Pokemon>(3);
	
	public Dresseur(String nom, int argent) {
		this.nom = nom;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	
	public int getNbPokemons() {
		return this.sacADos.size();
	}
	
	public void capturerPokemons() {
		
	}
	
	public boolean peutCombattre() {
		return true;
	}
	
	public void perdreArgent(Dresseur adversaire) {
		
	}
	
	public void combattre(Dresseur adversaire) {
		
	}
	
	public void pokeCenter() {
		
	}
	
	public String toString() {
		return this.nom;
	}
}
