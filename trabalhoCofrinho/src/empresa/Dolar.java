package empresa;

public class Dolar extends Moeda {
	
	double quant;
	
	public void info() {
		System.out.println("Moeda Dolar" + quant);
	}
	
	public void converter() {
		System.out.println(quant * 5.4); 
	}
	


}
