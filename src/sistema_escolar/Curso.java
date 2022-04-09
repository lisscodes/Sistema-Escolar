package sistema_escolar;

public class Curso {

	private String nomeCurso;
	private int turma;
	private long matricula;
	
	
	public Curso(String nomeCurso,int turma,long matricula)
	{
		this.nomeCurso = nomeCurso;
		this.turma = turma;
		this.matricula = matricula;
	}


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	public int getTurma() {
		return turma;
	}


	public void setTurma(int turma) {
		this.turma = turma;
	}


	public long getMatricula() {
		return matricula;
	}


	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
	
}
