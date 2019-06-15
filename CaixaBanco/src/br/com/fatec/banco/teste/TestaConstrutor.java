package br.com.fatec.banco.teste;

public class TestaConstrutor {
	public static void main(String[] args) {
		Filho filho = new Filho();
		filho.cumprimentar();
		filho.danca(); // ok
		
		Pai pai = new Filho();
		pai.cumprimentar();
		
		((Filho)pai).danca();
		
		
		Avo avo = new Filho();
		avo.cumprimentar();
		((Filho)avo).danca();
	}
}

class Avo {
	String padrao; // default
	private String privado;
	protected String protegido;
	public String publico;
	
	public Avo() {
//		System.out.println("construtor Avo");
	}
	
	public void cumprimentar() {
		System.out.println("Olá! Como vai?");
	}
}

class Pai extends Avo {
	
	public Pai() {
//		System.out.println("construtor Pai");
	}
	
	@Override
	public void cumprimentar() {
		System.out.println("Olá");
	}
}

class Filho extends Pai {
	
	public Filho() {
//		System.out.println("construtor Objeto");
	}

	public void danca() {
		System.out.println("Tutz! Tutz! te quero bem");
	}
	
	@Override // sobreescreve
	public void cumprimentar() {
		System.out.println("E aí véi");
	}
}

/*

inclusive as private, mas os private ele não consegue ver, mas ele tem

*/