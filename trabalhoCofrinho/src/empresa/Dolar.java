package empresa;

public class Dolar extends Moeda {
	
//	construtor
	public Dolar(double valor) {
		super(valor);
	}

//	metodo de calculo
	@Override
	double calculaValor() {
		double total = valor * 5.3;
		return total;
	}
}
