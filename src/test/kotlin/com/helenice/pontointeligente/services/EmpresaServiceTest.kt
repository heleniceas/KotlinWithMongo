package com.helenice.pontointeligente.services

import com.helenice.pontointeligente.docs.Empresa
import com.helenice.pontointeligente.repositories.EmpresaRepository
import com.helenice.services.EmpresaService
import org.assertj.core.api.Assert
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.mockito.BDDMockito
import org.mockito.Mock
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import java.lang.Exception


@SpringBootTest
class EmpresaServiceTest{

	@Autowired
	val empresaService: EmpresaService? = null;

	@MockBean
	 private val empresaRepository: EmpresaRepository? = null;

	 private val CNPJ: String = "2131317321378";

	@BeforeAll
	@Throws(Exception::class)
 	fun setUp(){
		BDDMockito.given(empresaRepository?.findByCnpj(CNPJ)).willReturn(empresa())
		BDDMockito.given(empresaRepository?.save(empresa())).willReturn(empresa())
	}

	fun testBuscarEmpresaPorCnpj(){
		val empresa: Empresa? = empresaService?.buscarPorCNPJ(CNPJ)
		Assertions.assertNotNull(empresa)
	}

	fun testPersistirEmpresa(){
		val empresa: Empresa? = empresaService?.persistir(empresa())
		Assertions.assertNotNull(empresa)
	}

	private fun empresa(): Empresa = Empresa("Nome", CNPJ, "1")

}