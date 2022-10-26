package empresa;

public class Real extends Moeda {
	
	double quant;
	
	public void info() {
		System.out.println("Moeda Euro" + quant);
	}
	
	public void converter() {
		System.out.println(quant); 
	}
	


}
