package com.seuprojeto.salaoagenda.models

data class Agendamento(
    val cliente: String = "",
    val servico: String = "",
    val data: String = "",
    val hora: String = ""
)
