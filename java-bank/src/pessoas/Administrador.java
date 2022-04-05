package src.pessoas;

import src.autenticacao.Autenticacao;
import src.autenticacao.Autenticavel;
import src.pessoas.Funcionario;

public class Administrador extends Funcionario implements src.autenticacao.Autenticavel{

	private src.autenticacao.Autenticacao autenticador;

	public Administrador() {
		this.autenticador = new src.autenticacao.Autenticacao();
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

