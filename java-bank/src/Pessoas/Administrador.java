package Pessoas;

import Autenticacao.Autenticacao;
import Autenticacao.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel{

	private Autenticacao autenticador;

	public Administrador() {
		this.autenticador = new Autenticacao();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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

