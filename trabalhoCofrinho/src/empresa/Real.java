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

	@Override
	public int hashCode() {
		return super.hashCode();
	}

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

