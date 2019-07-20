package br.com.heiderlopes.pokermao.repository

import br.com.heiderlopes.pokermao.model.Pokemon

interface PokemonRepository {

    fun checkHealth(
        onComplete:() -> Unit,
        onError:(t: Throwable) -> Unit
    )

    fun getPokemons(
        sort: String,
        size: Int,
        onComplete:(List<Pokemon>) -> Unit,
        onError:(Throwable) -> Unit
    )

    fun updatePokemon(
        pokemon: Pokemon,
        onComplete:(Pokemon?) -> Unit,
        onError:(Throwable) -> Unit
    )

}