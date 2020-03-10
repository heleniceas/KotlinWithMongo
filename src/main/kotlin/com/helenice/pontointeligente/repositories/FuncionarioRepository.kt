package com.helenice.pontointeligente.repositories

import com.helenice.pontointeligente.docs.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String> {

	fun findByEmail(email: String): Funcionario

	fun findByCpf(cpf: String): Funcionario

}