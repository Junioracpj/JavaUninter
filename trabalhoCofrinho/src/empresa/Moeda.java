package empresa;

public abstract class Moeda {
	double valor;
	
//	construtor
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}

//	metodo principal de calculo
	abstract double calculaValor();
	
	
	public void info() {
		System.out.println("Moeda" + valor);
	}

}
