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
