package empresa;

public class Euro extends Moeda {
	
	double quant;
	
	public void info() {
		System.out.println("Moeda Euro" + quant);
	}
	
	public void converter() {
		System.out.println(quant * 5.6); 
	}
	

}
