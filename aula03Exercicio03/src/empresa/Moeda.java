package empresa;

public class Moeda {

	private String nome;
	private double valor;
	
	
	
//	construtor				
public Moeda(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
//	Get and set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}
