package pokemonTypes;

import pokemon.Pokemon;
import pokemon.TypePokemon;

public class PokemonFeu extends Pokemon {

	public PokemonFeu(String nom, TypePokemon type) {
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
				res = this.hp - p.getAtk();
				break;
				
			case WATER:
				res = this.hp - p.getAtk() * 2;
				break;
				
			case PLANT:
				res = (int) this.hp - p.getAtk() / 2;
				break;
				
			default:
				res = this.hp - p.getAtk();
				break;
		}
		return res;
	}

}
