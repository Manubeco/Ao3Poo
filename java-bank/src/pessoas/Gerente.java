package src.pessoas;

import src.autenticacao.Autenticacao;
import src.autenticacao.Autenticavel;
import src.pessoas.Funcionario;

public class Gerente extends Funcionario implements src.autenticacao.Autenticavel{
	
	private src.autenticacao.Autenticacao autenticador;

	public Gerente() {
		this.autenticador = new src.autenticacao.Autenticacao();
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
