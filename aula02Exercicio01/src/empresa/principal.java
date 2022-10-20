package empresa;

public class principal {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Mario", "Enacanador", new Avaliacao(9, 10, 3));
		Aluno a2 = new Aluno("Luigi", "Enacanador", new Avaliacao(4, 1, 10));
		
		a1.info();
		a2.info();
	}

}
