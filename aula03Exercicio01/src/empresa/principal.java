package empresa;

public class principal {

	public static void main(String[] args) {
		
		Nota mario = new Nota();
		
		System.out.println("Media Luigi");
		Nota luigi = new Nota(90, 80, 5);
		System.out.println();
		

		mario.setNota1(9);
		mario.setNota2(10);
		mario.setFaltas(5);
		mario.resultado();
		mario.setNota1(2);
		mario.setFaltas(10);
		mario.resultado();
		
	}

}
