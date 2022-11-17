package pokemonTypes;

import pokemon.Pokemon;
import pokemon.TypePokemon;

public class PokemonPlante extends Pokemon {

	public PokemonPlante(String nom, TypePokemon type) {
		super(nom, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int attaquer(Pokemon p) {
		return this.subir(p);
	}

	@Override
	public int subir(Pokemon p) {
		int res;
		
		switch(p.getType()) {
			case FIRE:
				res = this.hp - p.getAtk() * 2;
				break;
				
			case WATER:
				res = (int) this.hp - p.getAtk() / 2;
				break;
				
			case PLANT:
				res = this.hp - p.getAtk();
				break;
				
			default:
				res = this.hp - p.getAtk();
				break;
		}
		return res;
	}
}
