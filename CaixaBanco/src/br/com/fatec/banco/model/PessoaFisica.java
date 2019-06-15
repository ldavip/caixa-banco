package br.com.fatec.banco.model;

public class PessoaFisica extends Cliente {

	public PessoaFisica(String nome) {
		super(nome);
	}

	/**
	 * @TODO: Acrescentar validação do CPF
	 */
	@Override
	public void setDocumento(String documento) {
		if (documento == null || documento.length() != 11) {
			// aqui valida se o número é nulo ou se o tamanho é inválido
			throw new IllegalArgumentException("CPF inválido!");
		}

		try {
			Long.parseLong(documento);
		} catch (NumberFormatException e) {
			// se cair aqui é porque tem caracteres além de números
			throw new IllegalArgumentException("CPF inválido!");
		}

		// validar o CPF aqui

		// aqui o número é válido
		this.documento = documento;
	}

	@Override
	public String getDocumentoFormatado() {
		if (this.documento == null) {
			throw new IllegalStateException("CPF não informado!");
		}

		String doc = this.documento;
		// 11111111111

		doc = doc.substring(0, 3) + "." + doc.substring(3);
		// 111.11111111

		doc = doc.substring(0, 7) + "." + doc.substring(7);
		// 111.111.11111

		doc = doc.substring(0, 11) + "-" + doc.substring(11);
		// 111.111.111-11

		return doc;
	}

}
