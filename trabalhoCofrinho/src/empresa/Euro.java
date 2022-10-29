package empresa;

public class Euro extends Moeda {
	
//	construtor
	public Euro(double valor) {
		super(valor);
	}

//	metodo de calculo
	@Override
	double calculaValor() {
		return valor * 5.4;

	}

	@Override
	public String toString() {
		return "Euro valor=" + valor + ", Valor=" + calculaValor() + "]";
	}
}
