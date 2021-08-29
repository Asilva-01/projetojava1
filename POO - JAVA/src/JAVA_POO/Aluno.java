package JAVA_POO;


/*Est� � nossa classe/objeto que representa o Aluno*/
public class Aluno {
	/*Esses s�o os atributosa do aluno*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	public Aluno( ) {/*Cria os dado na memora - Sendo padr�o do Java*/

}

	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	 /*Veremos os m�todos SETTERS e GETTERS do Objeto*/
	/*SET � para adcionar ou receber dados para os atributos*/
	/*GET � para resgatar ou obter o valor do atributo*/
	
	/*Recebe dados*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
}