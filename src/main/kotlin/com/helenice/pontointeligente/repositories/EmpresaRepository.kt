package com.helenice.pontointeligente.repositories

import com.helenice.pontointeligente.docs.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {

	fun findByCnpj(cnpj: String): Empresa

}