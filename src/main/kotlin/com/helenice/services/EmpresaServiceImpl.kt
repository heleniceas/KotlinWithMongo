package com.helenice.services

import com.helenice.pontointeligente.docs.Empresa
import com.helenice.pontointeligente.repositories.EmpresaRepository
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService{
	override fun buscarPorCNPJ(cnpj: String ): Empresa? = empresaRepository.findByCnpj(cnpj)
	override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}