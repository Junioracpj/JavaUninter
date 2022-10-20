package empresa;

public class Curso {

	String nome;
	double mensalidade;
	
	void info() {
		System.out.println("Nome curso : " + nome);
		System.out.println("Mensalidade curso: " + mensalidade);
	}

//	construtor
	public Curso(String nome, double mensalidade) {
		super();
		this.nome = nome;
		this.mensalidade = mensalidade;
	}
	
}
