package com.helenice.services

import com.helenice.pontointeligente.docs.Empresa

interface EmpresaService {

	fun buscarPorCNPJ(cnpj: String ): Empresa?

	fun persistir(empresa: Empresa): Empresa
}