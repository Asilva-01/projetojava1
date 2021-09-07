package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente quem tem o contrato da interface de PermitirAcesso e chamar a autenticação */

public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
}
