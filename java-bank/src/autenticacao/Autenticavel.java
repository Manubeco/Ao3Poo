package src.autenticacao;

public interface Autenticavel {
	
	void setSenha(int senha) ;
	
	boolean autentica(int senha) ;
}
