package empresa;

public class principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(111, "Mario", 2000, 500);
		Conta c2 = new Conta(112, "Jorge", 3000, 600);
		
		c1.info();
		
		if (!c1.sacar(200)) {
			System.out.println("Problema ao sacar");
		}
			
		if(!c1.depositar(500)) {
			System.out.println("Problema ao depositar");
		}
		
		if(!c1.tranferir(c2, 500)){
			System.out.println("Problema ao transferir");
		}
		c1.info();
		c2.info();


	}

}
