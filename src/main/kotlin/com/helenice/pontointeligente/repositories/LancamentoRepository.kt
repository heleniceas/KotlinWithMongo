package com.helenice.pontointeligente.repositories

import com.helenice.pontointeligente.docs.Funcionario
import com.helenice.pontointeligente.docs.Lancamento
import org.springframework.data.mongodb.repository.MongoRepository
import java.awt.print.Pageable

interface LancamentoRepository : MongoRepository<Lancamento, String> {
	fun findByFuncionarioId(funcionarioId: String, pageable: Pageable): Lancamento
}