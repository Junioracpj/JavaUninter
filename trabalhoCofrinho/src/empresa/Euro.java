package empresa;

public class Euro extends Moeda {
	
//	construtor
	public Euro(double valor) {
		super(valor);
	}

//	metodo de calculo
	@Override
	double calculaValor() {
		double total = valor * 5.4;
		return total;
	}
}
