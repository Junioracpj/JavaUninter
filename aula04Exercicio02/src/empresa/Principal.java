package empresa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IngressoVip iv = new IngressoVip("Rock in Curitiba", 200, 100);
		
//		iv.info();
		
		Ingresso i = new Ingresso("Rock in Rio", 50);
		
		i.info();
	}

}
