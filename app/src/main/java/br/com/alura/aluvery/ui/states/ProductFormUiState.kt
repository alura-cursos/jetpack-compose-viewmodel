package br.com.alura.aluvery.ui.states

data class ProductFormUiState(
    val url: String = "",
    val name: String = "",
    val price: String = "",
    val description: String = "",
    val onUrlChange: (String) -> Unit = {},
    val onNameChange: (String) -> Unit = {},
    val onDescriptionChange: (String) -> Unit = {},
    val onPriceChange: (String) -> Unit = {}
) {
    val isShowPreview: Boolean get() = url.isNotBlank()
}