package br.com.alura.aluvery.ui.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import br.com.alura.aluvery.ui.states.HomeScreenUiState

class HomeScreenViewModel : ViewModel() {

    var uiState: HomeScreenUiState by mutableStateOf(HomeScreenUiState(
        onSearchChange = {
            uiState = uiState.copy(searchText = it)
        }
    ))
        private set

}