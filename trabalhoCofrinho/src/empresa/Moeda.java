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
	
//	metodo usado para exibicao dos dados na listagem
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
}
