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

//	metodo usado para exibicao dos dados na listagem
	@Override
	public String toString() {
		return "Euro valor=" + valor + ",Valor convertido em real=" + calculaValor();
	}

//	metodo usado para comparação dos dados na exclusão
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
