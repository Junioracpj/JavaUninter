package empresa;

public class Dolar extends Moeda {
	
//	construtor
	public Dolar(double valor) {
		super(valor);
	}

//	metodo de calculo
	@Override
	double calculaValor() {
		return valor * 5.3;
	}

	@Override
	public String toString() {
		return "Dolar valor=" + valor + ", Valor=" + calculaValor() + "]";
	}

}
