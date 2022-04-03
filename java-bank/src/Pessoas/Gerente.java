package Pessoas;

import Autenticacao.Autenticacao;
import Autenticacao.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel{
	
	private Autenticacao autenticador;

	public Gerente() {
		this.autenticador = new Autenticacao();
	}
	
	public double getBonificacao() {
		System.out.println("Bonificação gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
