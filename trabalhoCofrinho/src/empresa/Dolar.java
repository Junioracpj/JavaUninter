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
