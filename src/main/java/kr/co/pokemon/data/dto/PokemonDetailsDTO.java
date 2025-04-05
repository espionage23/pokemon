package kr.co.pokemon.data.dto;

import java.util.List;

import kr.co.pokemon.play.dto.PokemonOwnType;
import kr.co.pokemon.pokemon.dto.EvolutionDTO;
import kr.co.pokemon.pokemon.dto.PokemonDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PokemonDetailsDTO {
    private PokemonDTO pokemon;
    private List<PokemonOwnType> types;
    private EvolutionDTO evolution;

    public PokemonDetailsDTO(PokemonDTO pokemon, List<PokemonOwnType> types, EvolutionDTO evolution) {
        this.pokemon = pokemon;
        this.types = types;
        this.evolution = evolution;
    }
}