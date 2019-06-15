package br.com.fatec.banco.model;

public class PessoaFisica extends Cliente {

	public PessoaFisica(String nome) {
		super(nome);
	}

	/**
	 * @TODO: Acrescentar valida��o do CPF
	 */
	@Override
	public void setDocumento(String documento) {
		if (documento == null || documento.length() != 11) {
			// aqui valida se o n�mero � nulo ou se o tamanho � inv�lido
			throw new IllegalArgumentException("CPF inv�lido!");
		}

		try {
			Long.parseLong(documento);
		} catch (NumberFormatException e) {
			// se cair aqui � porque tem caracteres al�m de n�meros
			throw new IllegalArgumentException("CPF inv�lido!");
		}

		// validar o CPF aqui

		// aqui o n�mero � v�lido
		this.documento = documento;
	}

	@Override
	public String getDocumentoFormatado() {
		if (this.documento == null) {
			throw new IllegalStateException("CPF n�o informado!");
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
