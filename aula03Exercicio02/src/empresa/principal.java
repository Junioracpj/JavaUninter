package empresa;

public class principal {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Mario", 111, 0.1, new Curso("Engenaharia", 1000));
		
		a1.info();
	}

}
