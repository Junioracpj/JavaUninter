package empresa;

public class Principal {

	public static void main(String[] args) {
		
		LivroDigital ld = new LivroDigital("Senhor dos aneis",
				new Autor("Tolkein","Britanico","tolkein@gmail.com"),
				"Aventura",
				5,
				10000,
				3500);
	
		ld.info();
	}
	}
	
