package br.com.fatec.banco.teste;

import br.com.fatec.banco.model.PessoaFisica;

public class TestaPessoaFisica {

	public void testaCPFValido() {
		
		PessoaFisica p = new PessoaFisica("teste");
		try {
			/**
			 * @TODO: Acrescentar validação do CPF
			 */
			p.setDocumento("11111111111"); // mas, 11111111111 é válido? existe esse CPF?
			System.out.println("Teste OK!");
		} catch (IllegalArgumentException e) {
			System.out.println("Teste Falhou");
		}
	}
	
	public void testaCPFInvalido() {
		PessoaFisica p = new PessoaFisica("teste");
		try {
			p.setDocumento("123");
			System.out.println("Teste falhou!");
		} catch (IllegalArgumentException e) {
			System.out.println("Teste OK");
		}
		
		try {
			p.setDocumento("1231231231a");
			System.out.println("Teste falhou!");
		} catch (IllegalArgumentException e) {
			System.out.println("Teste OK");
		}
		
		try {
			p.setDocumento(null);
			System.out.println("Teste falhou!");
		} catch (IllegalArgumentException e) {
			System.out.println("Teste OK");
		}
	}
	
	public static void main(String[] args) {
		TestaPessoaFisica teste = new TestaPessoaFisica();
		
		teste.testaCPFInvalido();
		teste.testaCPFValido();
	}
}
