package empresa;

public class IngressoVip extends Ingresso{

	double adcional;
	
	
	public IngressoVip(String nomeEvento, double valor, double adcional) {
		super(nomeEvento, valor);
		this.adcional = adcional;
	}
	
	@Override
	public void info() {
		 super.info();
		 System.out.println("Valro adcional: " + adcional);
		 System.out.println("Total do ingresso: " + (valor + adcional));
	}
}

