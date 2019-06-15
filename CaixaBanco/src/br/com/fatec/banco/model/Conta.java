package br.com.fatec.banco.model;

import java.math.BigDecimal;

public class Conta {

	private Tipo tipo;
	private BigDecimal saldo;
	
	enum Tipo {
		INDIVIDUAL, CONJUNTA, JURIDICA
	}
}
