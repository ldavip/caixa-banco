package br.com.fatec.banco.teste;

import br.com.fatec.banco.model.PessoaFisica;

public class TestaFormatacaoDoCPF {

	public static void main(String[] args) {
		PessoaFisica p = new PessoaFisica("John Doe");

		p.setDocumento("12312312312");

		System.out.println(p.getDocumento());
		System.out.println(p.getDocumentoFormatado());

	}

}
