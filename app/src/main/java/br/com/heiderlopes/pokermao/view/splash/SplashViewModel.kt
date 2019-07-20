package br.com.heiderlopes.pokermao.view.splash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.heiderlopes.pokermao.repository.PokemonRepository

class SplashViewModel(
    private val pokemonRepository: PokemonRepository
) : ViewModel() {

    val messageError = MutableLiveData<String>()

    fun checkHealth() {
        pokemonRepository.checkHealth(
            onComplete = {
                messageError.value = ""
            }, onError = {
                messageError.value = it.message
            })
    }
}