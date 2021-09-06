package cursojava.interfaces;

/*Essa interface será o nosso controto de autenticação*/
public interface PermitirAcesso {
	

	public boolean autenticar(String login, String senha);
}
