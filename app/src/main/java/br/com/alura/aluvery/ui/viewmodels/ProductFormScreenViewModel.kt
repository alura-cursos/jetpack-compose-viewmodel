package br.com.alura.aluvery.ui.viewmodels

import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import br.com.alura.aluvery.ui.states.ProductFormUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.math.BigDecimal
import java.text.DecimalFormat

class ProductFormScreenViewModel : ViewModel() {

    private val _uiState: MutableStateFlow<ProductFormUiState> = MutableStateFlow(
            ProductFormUiState()
    )
    val uiState get() = _uiState.asStateFlow()

    val formatter =
        DecimalFormat("#.##")

    init {
        _uiState.update { currentState ->
            currentState.copy(
                    onUrlChange = {
                        _uiState.value = _uiState.value.copy(
                                url = it
                        )
                    },
                    onNameChange = {
                        _uiState.value = _uiState.value.copy(
                                name = it
                        )
                    },
                    onPriceChange = {
                        val price = try {
                            formatter.format(BigDecimal(it))
                        } catch (e: IllegalArgumentException) {
                            if (it.isEmpty()) {
                                it
                            } else {
                                null
                            }
                        }
                        price?.let {
                            _uiState.value = _uiState.value.copy(
                                    price = price
                            )
                        }
                    },
                    onDescriptionChange = {
                        _uiState.value = _uiState.value.copy(
                                description = it
                        )
                    }
            )
        }
    }

}