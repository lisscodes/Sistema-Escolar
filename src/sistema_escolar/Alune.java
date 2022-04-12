package sistema_escolar;

public class Alune extends Pessoa {
	
	private long matricula = 0;
	private int turma = 0;
	private Curso curso;
	
	public Alune(String nome, String cpf, long matricula, int turma, Curso curso) {
		super(nome, cpf);
		this.matricula = matricula;
		this.turma = turma;
		this.curso = curso;
	}
	
	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public int getTurma() {
		return turma;
	}

	public void setTurma(int turma) {
		this.turma = turma;
	}
	
	


	@Override
	public String toString() {
		return "INFORMAÇÕES DO ALUNE\n"+super.toString()+curso.toString()+"\nMatricula: "+matricula+"\nTurma: "+turma;
	}

	
	
}
