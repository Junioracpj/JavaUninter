package empresa;

public abstract class Moeda {
	double valor;
	
public Moeda(double valor) {
		super();
		this.valor = valor;
	}

//	metodo principal de calculo
	abstract double calculaValor();
}
