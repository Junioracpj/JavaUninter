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
	
//	metodo usado para exibicao dos dados na listagem
	@Override
	public String toString() {
		return "Dolar valor=" + valor + ", Valor convertido em real=" + calculaValor();
	}

//	metodo usado para comparacao dos dados na exclusao
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}
