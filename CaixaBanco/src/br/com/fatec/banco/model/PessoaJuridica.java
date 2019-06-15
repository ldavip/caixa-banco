package br.com.fatec.banco.model;

public class PessoaJuridica extends Cliente {

	public PessoaJuridica(String nome) {
		super(nome);
	}

	@Override
	public void setDocumento(String documento) {
		throw new UnsupportedOperationException("Não implementado ainda");
	}

}
