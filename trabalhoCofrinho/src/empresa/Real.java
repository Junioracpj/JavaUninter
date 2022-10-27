package empresa;

public class Real extends Moeda {
	
//	construtor
	public Real(double valor) {
		super(valor);
	}

//	metodo de calculo
	@Override
	double calculaValor() {
		double total = valor;
		return total;
	}
}

