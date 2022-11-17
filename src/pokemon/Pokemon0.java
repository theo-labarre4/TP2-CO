package pokemon;

import java.util.Random;

public class Pokemon0 {

	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	private static Random r = new Random();
	
	public Pokemon0(String nom) {
		this.nom = nom;
		this.niveau = r.nextInt(1,10);
		this.hp = this.niveau * 2;
		this.atk = (int) (this.niveau / 2) + 1;
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
	
	public int attaquer(Pokemon0 p) {
		p.hp = p.hp - this.atk;
		return p.hp;
	}
	
	public String toString() {
		return "Je suis " + this.nom + " de niveau " + this.niveau + ", j'ai actuellement "
				+ this.hp + "hp et " + this.atk + " atk !";
	}
	
	public void log(String msg) {
		System.out.println("[Pokemon " + this.nom + "] " + msg);
	}
	
}