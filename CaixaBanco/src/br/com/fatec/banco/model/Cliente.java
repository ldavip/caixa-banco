package br.com.fatec.banco.model;

import java.time.LocalDate;

public abstract class Cliente {

	private long id;
	private String nome;
	private LocalDate dataNascimento;
	protected String documento;

	public Cliente(String nome) {
		this.nome = nome;
	}

	 // força cada um a validar o seu
	public abstract void setDocumento(String documento);

	public String getDocumento() {
		return this.documento;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public String getDocumentoFormatado() {
		return this.documento;
	}
}
