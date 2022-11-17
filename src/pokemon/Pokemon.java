package pokemon;

import java.util.Random;

public abstract class Pokemon {

	private String nom;
	private int niveau;
	private static int niveauMax;
	protected int hp;
	private int atk;
	private TypePokemon type;
	private static Random r = new Random();
	
	public Pokemon(String nom, TypePokemon type) {
		this.nom = nom;
		this.niveau = r.nextInt(1,10);
		this.hp = this.niveau * 2;
		this.atk = (int) (this.niveau / 2) + 1;
		this.type = type;
	}

	public String getNom() {
		return nom;
	}
	
	public int getNiveau() {
		return niveau;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public boolean isKO() {
		return hp <= 0;
	}
	
	public void soigner() {
		this.hp = this.niveau * 2;
	}
	
	public abstract int attaquer(Pokemon p);
	
	public abstract int subir(Pokemon p);
	
	public String toString() {
		return "Je suis " + this.nom + " de niveau " + this.niveau + ", j'ai actuellement "
				+ this.hp + "hp et " + this.atk + " atk !";
	}
	
	public void log(String msg) {
		System.out.println("[Pokemon " + this.nom + "] " + msg);
	}

	public TypePokemon getType() {
		return type;
	}
	
}