package com.helenice.pontointeligente.docs

import com.helenice.pontointeligente.enums.PerfilEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Funcionario (
		val nome: String,
		val email: String,
		val senha: String,
		val cpf: String,
		val perfil: PerfilEnum,
		val empresaId: String,
		val valorHora: Double? = 0.0,
		val qtdHorasTrabalhoDia: Float? = 0.0f,
		val qtaHorasAlmoco: Float? = 0.0f,
		@Id val id: String? = null
)