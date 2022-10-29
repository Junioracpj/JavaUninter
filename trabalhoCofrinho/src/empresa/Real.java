package empresa;

public class Real extends Moeda {
	
//	construtor
	public Real(double valor) {
		super(valor);
	}

//	metodo de calculo
	@Override
	double calculaValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Real valor=" + valor + ", Valor=" + calculaValor() + "]";
	}
}

